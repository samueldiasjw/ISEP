#!/bin/bash

# MEMBROS DO GRUPO
# 1201205 - Samuel Dias
# 1060694 - António Sousa

# DESCRIÇÃO DA ESTRATÉGIA
# Em primeiro lugar, validamos o argumento de entrada. Caso não contenha 
# um, termina o script e mostra uma mensagem com o método de utilizaçao.
# Logo de seguida, verificamos se o ficheiro indicado pelo utilizador existe, 
# e caso não exista, termina o script e mostra uma mensagem a informar.
# Se o ficheiro existir, vamos criar 3 arrays para receber os respetivos 
# nomes/ips das máquinas cujo código de erro se verifique. Iniciamos o ciclo 
# de leitura do ficheiro com as entradas nos nomes/ips das máquinas e para
# cada um, vamos executar o comando ping com os argumentos '-c 1' e também
# '-W 2' que aguarda apenas 2 segundos pelo pacote de resposta. Consoante 
# o resultado do código de erro de saída  do comando ping, iremos então 
# fazer a devida triagem e acrescentar o nome/ip da máquina ao respetivo array.
# == SAMUEL, continua a partir daqui ...
#

showFile()
{
	printf "\e[1;31m------- $FILE -------\e[0m\n"
	# Ler linha a linha do ficheiro	
	while fileContents= read -r line
	do	
		if [[ "$line" == *"máquinas ativas"* ]]; then
  			printf "\e[1;32m$line\e[0m\n"
		fi
		
		if [[ "$line" == *"máquinas inativas"* ]]; then
  			printf "\e[1;33m$line\e[0m\n"
		fi

		if [[ "$line" == *"máquinas inválidas"* ]]; then
  			printf "\e[1;31m$line\e[0m\n"
		fi
		
		if [[ "$line" != "Encontrado"* ]]; then
  			echo $line
		fi
	done < $FILE
}



# verifica se recebeu o argumento
if [ ! $1 ]
then
	# nao recebeu, mostra mensagem do método de utilização do programa
	printf "\n Usage:\n  pingsweeper.sh <filename>\n\n"
else
	# verifica se o ficheiro existe
	if [ ! -f $1 ]
	then
		printf "O ficheiro não existe\n\n"
	else
		# executa o programa - INÍCIO (R1)

		# definição dos arrays onde ficam armazenados os nomes/endereços das máquinas resultantes do comando 'ping'
		declare -a ATIVOS
		declare -a INATIVOS
		declare -a INVALIDOS

		# le ficheiro de entrada com nomes/ips das máquinas
		# O conteúdo de cada linha do ficheiro, fica armazenado na variável $line
		# nota: o nome do ficheiro de entrada, é dado na última linha do ciclo while: 'done < $1', em que $1 representa
		# o conteúdo do primeiro argumento passado para este script, neste caso, o nome do ficheiro
		while fileContents= read -r line
		do	
			# argumentos usados no comando 'ping' ==
			# "-c 1": envia apenas um pacote
			# "-W 2": aguarda 2 segundos no maximo pela resposta, depois é dado como 100% packet loss
			ping -c 1 -W 2 $line > /dev/null 2>&1

			# regista o código de erro da saída do ping
			erro=$?

			# saída de códigos de erro do comando 'ping' ==
			# 0: significa que não houve perda de pacotes. máquina ativa (0% packet loss)
			# 1: perda total de pacotes. a máquina está inativa (100% packet loss)
			# 2: host de destino inválido (inválido)
			# se houver 0% packet loss
			if [ $erro -eq 0 ]
			then
				# acrescenta host ACTIVO
				ATIVOS[${#ATIVOS[@]}]=$line
			fi
			if [ $erro -eq 1 ]
			then
				# acrescenta host INATIVO
				INATIVOS[${#INATIVOS[@]}]=$line
			fi
			if [ $erro -eq 2 ]
			then
				# acrescenta host INVÁLIDO
				INVALIDOS[${#INVALIDOS[@]}]=$line
			fi
		done < $1
	
		### ==================================================
		#Verifica se o ficheiro existe, se existir apaga para não dar append a ficheiros que existem
		FILE=./reachability_test.txt
		
		if [[ -f "$FILE" ]]; then
    			rm -r $FILE
		fi

		# máquinas ativas:

		echo "Encontrado ${#ATIVOS[@]} máquinas ativas" >> ./reachability_test.txt

		for maquina in ${ATIVOS[@]}
		do
			echo "$maquina" >> ./reachability_test.txt
		done

		#nbspc
		echo "" >> ./reachability_test.txt
		
			
		# máquinas inativas:
		echo "Encontrado ${#INATIVOS[@]} máquinas inativas" >> ./reachability_test.txt

		for maquina in ${INATIVOS[@]}
		do
			echo "$maquina" >> ./reachability_test.txt
		done

		#nbspc
		echo "" >> ./reachability_test.txt

		
		# máquinas inválidas:
		echo "Encontrado ${#INVALIDOS[@]} máquinas inválidas" >> ./reachability_test.txt

		for maquina in ${INVALIDOS[@]}
		do
			echo "$maquina\n\n" >> ./reachability_test.txt
		done
		
		# Verificar se o utilizador quer ver o ficheiro
		while true; do
    		read -p "Pretende visualizar o conteudo do ficheiro? [Y/N] " yn
    			case $yn in
        			[Yy]* ) showFile; break;;
        			[Nn]* ) exit;;
        			* ) echo "Please answer Y or N.";;
    			esac
		done

		
		# printf "I \033[0;31m love Stack Overflow\n"
		### =========================================================
	fi
fi
