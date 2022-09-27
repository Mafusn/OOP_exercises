package session4.C_EqualsMethod;

import java.util.Objects;

public class Person {
    String name;
    int age;

    public Person(String firstName, int age) {
        this.name = firstName;
        this.age = age;
    }


    public static void main(String[] args) {

        //Create the object
        Person person1 = new Person("Anders Madsen", 38);

        Person person2 = new Person("Anders Madsen", 38);

        if (person1==person2)
            System.out.println("They are equal");
        else
            System.out.println("They are not equal");

        if (person1.equals(person2))
            System.out.println("They are equal");
        else
            System.out.println("They are not equal");



        System.out.println("HashCode of Person 1 : " + person1.hashCode());

        System.out.println("HashCode of Person 2 : " + person2.hashCode());
    }

}
