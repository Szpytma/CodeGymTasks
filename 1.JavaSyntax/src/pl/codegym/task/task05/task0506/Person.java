package pl.codegym.task.task05.task0506;

/* 
Ludzie
*/

public class Person {

  //tutaj wpisz swój kod
  private String name;
  private int age;
  private String address;
  private char sex;

  public Person(String name, int age, String address, char sex) {
    this.name = name;
    this.age = age;
    this.address = address;
    this.sex = sex;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public String getAddress() {
    return address;
  }

  public char getSex() {
    return sex;
  }

  public static void main(String[] args) {
    Person person = new Person("Pawel", 28, "London", 'M');
    System.out.println(
        person.getName() + " " + person.getAddress() + " " + person.getAge() + " " + person
            .getSex());

  }
}
