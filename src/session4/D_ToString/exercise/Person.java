package session4.D_ToString.exercise;

/**
 * Exercise:
 * a) Run the code below and see the output.
 * b) Implement the toString method. If a person does not have middle name, it should be
 * properly displayed.
 * c) Run again the code below and see the output.
 */
public class Person {
    String firstName;
    String middleName;
    String lastName;
    int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = "";
        this.age = age;
    }

    public Person(String firstName, String middleName, String lastName, int age) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        if (middleName.isEmpty())
            return "Person{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", age=" + age +
                    '}';

        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {

        //Create the object
        Person person1 = new Person("Anders", "Madsen", 38);
        System.out.println(person1);

        Person person2 = new Person("Anders", "M", "Madsen", 38);
        System.out.println(person2);
    }

}
