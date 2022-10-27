package session2.A_ClassesAndObjects.exercise;

/**
 * a) Write a class to represent a person. A person has a first name, last name, and an age.
 * b) Write code that create a person object and outputs the person's information as a string
 * formatted as ”Anders, Madsen, 28”
 */
public class Person {
    private String firstName;
    private String lastName;
    private int age;



    public void getPerson(){
        System.out.println(this.firstName + ", " + this.lastName + ", " + this.age);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {

        //Create the object
        Person person = new Person();

        person.setFirstName("Anders");
        person.setLastName("Madsen");
        person.setAge(28);

        person.age = 29;

        person.getPerson();
    }

}
