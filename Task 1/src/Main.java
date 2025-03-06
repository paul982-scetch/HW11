public class Main {
    public static void main(String[] args) {

        phone apple = new phone();
        apple.namePhone = "yabloko" ;
        apple.numberPhone = 80420417 ;
        apple.weightPhone = 500.5;

        phone iphone = new phone();
        iphone.namePhone = "iphone";
        iphone.numberPhone = 521;
        iphone.weightPhone = 120.2;

        phone smart = new phone();
        smart.namePhone = "Смартфон";
        smart.numberPhone = 89053;
        smart.weightPhone = 15;

        phone andrey = new phone(8908, "Андроид", 152);

        andrey.info();
        smart.info();
        apple.info();
        iphone.receiveCall("Валера", 89085);

    }
}
