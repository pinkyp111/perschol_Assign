package pa303_10_3;

public class LibraryInterfaceDemo {
    public static void main(String[] args) {

        KidUser kd = new KidUser();
        KidUser kd1 = new AdultUser();

        kd.registerAccount(10);
        kd.book("kids");
        kd.registerAccount(18);
        kd.book("fiction");
        kd1.registerAccount(5);
        kd1.book("kids");
        kd1.registerAccount(23);
        kd1.book("fiction");


    }
}
