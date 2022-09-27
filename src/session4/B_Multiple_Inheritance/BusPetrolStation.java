package session4.B_Multiple_Inheritance;

public class BusPetrolStation {
    public void recharge(Bus bus){
        System.out.println("Din bus er tanket op!");
    }

    public static void main(String[] args) {
        Volvo volvoBus = new Volvo();
        BusPetrolStation busPetrolStation = new BusPetrolStation();

        busPetrolStation.recharge(volvoBus);
    }
}
