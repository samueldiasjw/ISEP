public class Teste {
    public static void main(String[] args) {
        int a,b,c;
        a=5;
        b=2*a;
        c=a+b;
        a = 2*c+2*b;
        b= a-10;
        for(int i=0;i<10;i++){
            c=c+1;
        }
        if(a>b){
            System.out.println(a + "+" + b + "+" + c);
        }else{
            System.out.println(a+b+c);
        }
    }
}
