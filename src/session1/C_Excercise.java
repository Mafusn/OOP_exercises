package session1;

import feedback.Feedback;

/**
 * Try to understand the rationale behind the outputs
 */
class C_Excercise {
    public static void main(String[] args) {
        int int_num = 10; //Dynamic initialization
        double double_num = 10.0;

        System.out.println("Original value of int_num: " + int_num); //10
        System.out.println("Original value of double_num: " + double_num); //10.0
        System.out.println();

        int_num = int_num / 4;
        double_num = double_num / 4;

        System.out.println("int_num after division: " + int_num); //2
        System.out.println("double_num after division: " + double_num); //2.5


        int_num = 10;
        double result = int_num/4;
        System.out.println("Result: " + result); // 2.0

        double result2 = int_num/4.0;
        System.out.println("Result2: " + result2); // 2.5
    }

}