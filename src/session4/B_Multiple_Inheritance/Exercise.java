package session4.B_Multiple_Inheritance;

/**
 * Exercise:
 * a) Make TeslaModelS implements the ElectricVehicle interface.
 * b) Uncomment the code below and try to understand the different statements
 */
public class Exercise {

    public static void main(String[] args) {


        /**
         * Porsche911's objects have the speed method because they are Vehicle's objects too.
         */
        Porsche911 porsche911 = new Porsche911();
        System.out.println(porsche911.speed());



        /**
         * Porsche911's objects do not have the "batteryLevel"method because they are not  ElectricVehicle's objects.
         */
        //System.out.println(porsche911.batteryLevel()); //Compilation error



        /**
         * TeslaModelS's objects have the speed method because they are Vehicle's objects too.
         */
        //TeslaModelS teslaModelS = new TeslaModelS();
        //System.out.println(teslaModelS.speed());

        /**
         * TeslaModelS's objects do have the "batteryLevel"method because they also are ElectricVehicle's objects.
         */
        //System.out.println(teslaModelS.batteryLevel());



        /**
         * TeslaModelS's objects are also ElectricVehicle objects.
         */
        //ElectricVehicle electricVehicle = teslaModelS;
        //System.out.println(electricVehicle.batteryLevel());


        /**
         * ElectricVehicle's objects are not Vehicle objects.
         */
        // System.out.println(electricVehicle.speed()); //Compilation Error
    }
}
