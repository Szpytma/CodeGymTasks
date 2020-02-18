package pl.codegym.task.task05.task0503;

/* 
Gettery i settery dla klasy Pies
*/

public class Dog {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.setName("Azor");
        dog1.setAge(5);

        System.out.println(dog1.getName() + " is " + dog1.getAge() + " year old");
    }
}
