import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String name = "";

        System.out.println("Qual e o teu nome?");
        name = myObj.nextLine();

        Person person = new Person(name,10);

        System.out.println(person.getName());
        System.out.println(person.getAge());

        person.setName("MUDOU");
        person.setAge(20);

        System.out.println(person.getName());
        System.out.println(person.getAge());

        person.personToString();
    }
}

