package pl.codegym.task.task13.task1327;

public class Person implements TurnipItem {

    String name;
    Person behind;

    public Person(String name, Person behind) {
        this.name = name;
        this.behind = behind;
    }

    public String pull(Person person) {
        if (behind != null) {
            String story = person.behind.name + " behind " + person.name;
            return story;
        }

        return person.name;
    }
}

