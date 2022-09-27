package session2.C_Methods.exercise;

/**
 * Start from Person class in A_ClassesAndObjects.
 *     - Add a method that returns whether the person is or not under the legal age (18 years old).
 *     - Add a method that returns a string formatted as ”Anders, Madsen, 28, Above Legal Age”
 */
class Person {

    String firstName;
    String lastName;
    int age;


    // Add the methods

    boolean isAboveTheLegalAge(){
        return this.age >= 18;
    }

    void getPerson(){
        if (this.isAboveTheLegalAge()) {
            System.out.println(this.firstName + ", " + this.lastName + ", " + this.age + ", Above Legal Age");
        } else {
            System.out.println(this.firstName + ", " + this.lastName + ", " + this.age + ", Below Legal Age");
        }
    }


    public static void main(String[] args) {

        //Create the object
        Person person = new Person();

        //Assign the values to the instance variables
        person.firstName="Anders";
        person.lastName="Madsen";
        person.age = 18;

        person.getPerson();


        /***** UNCOMMENT BELOW TO PROVIDE FEEDBACK ****/

        /*
        //Did you have time to finish the exercise?
        boolean I_did_finish = true;

        //Did you understand the concepts used in the exercise?
        boolean I_did_understand = true;

        //Any comments
        String comment = "No comments";

        feedback.Feedback.submit("session2_C_Methods", I_did_finish, I_did_understand, comment);
        */

    }

}
