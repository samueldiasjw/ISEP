public class Person {
    private String name;
    private int age;

    public Person() {
        name = "Samuel Dias";
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void personToString(){
        System.out.println(this.name + " tem " + this.age + " anos");
    }
}
