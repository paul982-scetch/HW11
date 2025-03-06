import java.util.Scanner;



public class phone {

    static String cantryManufactured = " Китай ";

    public phone() {

    }

    long numberPhone;
    String namePhone;
    double weightPhone;

    public phone(long numberPhone, String namePhone, double weightPhone) {
        this.numberPhone = numberPhone;
        this.namePhone = namePhone;
        this.weightPhone = weightPhone;
    }
    public void receiveCall(String nameCall){
        receiveCall(nameCall, 0);
    }
    public void receiveCall(String nameCall, long numberCall){
        System.out.println("Звонит абонент по имени " + nameCall + " номер "
                + (numberCall > 0 ? numberCall : "Номер не известен"));
    }

    public void info () {
        System.out.println(" Телефон " + namePhone + " весит " +
                weightPhone + "г." + " и имеет номер " + numberPhone +
                ", производство " + cantryManufactured);
    }

}
