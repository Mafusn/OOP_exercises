package session2.E_Encapsulation.exercise;

import feedback.Feedback;

/**
 * Exercise:
 *  * Now a Person can have a first name, a last name and, optionally, a middle name. And also an age.
 *  * Create constructors for this class.
 *  * Create the getter and setters that you think are needed here.
 *  * Write code in the main method that illustrates the use of the getters and setters.
 **/
class Person {
    private String firstName;
    private String middleName;
    private String lastName;
    private int age;

    public Person(String firstName, String middleName, String lastName, int age) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public Person(String firstName, String middleName, int age) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.age = age;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    private boolean hasMiddleName(){
        return this.middleName != null;
    }

    public void setAge(int newAge){
        this.age = newAge;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public int getAge() {
        return this.age;
    }

    public String getMiddleName(){
        return this.middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public static void main(String[] args) {

        Person person1 = new Person("Jens", "Hansen", "Jensen", 29);

        System.out.print(person1.getFirstName() + " ");
        System.out.print(person1.getMiddleName() + " ");
        System.out.print(person1.getLastName() + " ");
        System.out.print(person1.getAge());

        person1.setAge(12);

        System.out.println(person1.getAge());



        /***** UNCOMMENT BELOW TO PROVIDE FEEDBACK ****/

        /*
        //Did you have time to finish the exercise?
        boolean I_did_finish = true;

        //Did you understand the concepts used in the exercise?
        boolean I_did_understand = true;

        //Any comments
        String comment = "No comments";

        feedback.Feedback.submit("session2_E_Encapsulation", I_did_finish, I_did_understand, comment);
        */

    }
}
