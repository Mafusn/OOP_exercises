package session2.D_Constructors.exercise;

import feedback.Feedback;

/**
 * Exercise:
 *  * Now a Person can have a first name, a last name and, optionally, a middle name. And also an age.
 *  * Create two constructors for this class.
 *      * A constructor to create Person objects with middle name.
 *      * A constructor to create Person objects without middle name.
 *  * Add a method that return true/false to indicate if the person has or does not have a middle name.
 *  * Add a method that outputs the person's information as a string formatted as:
 *      * E.g. ”Anders, Madsen, 28” if there is no middle name.
 *      * E.g. ”Anders, M., Madsen, 28” if there is a middle name.
 **/
class Person {
    private String firstName;
    private String middleName;
    private String lastName;
    private int age;

    Person(){
        this.firstName = "";
        this.middleName = "";
        this.lastName = "";
        this.age = 0;
    }

    Person(String firstName, String middleName, String lastName, int age){
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
    }

    Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.middleName = "";
        this.lastName = lastName;
        this.age = age;
    }

    private boolean hasAMiddleName(){
        return !this.middleName.equals("");
    }

    void getPerson(){
        if (this.hasAMiddleName()){
            System.out.println(this.firstName + ", " + this.middleName + ", " + this.lastName + ", " + this.age);
        } else {
            System.out.println(this.firstName + ", " + this.lastName + ", " + this.age);
        }
    }


    public static void main(String[] args) {

        Person person1 = new Person("Jens", "K.", "Hansen", 28);
        Person person2 = new Person("Jens", "Hansen", 28);

        person1.getPerson();
        person2.getPerson();
    }
}
