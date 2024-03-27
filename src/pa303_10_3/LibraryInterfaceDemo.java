package pa303_10_3;

public class LibraryInterfaceDemo {
    public static void main(String[] args) {

        KidUser kd = new KidUser();
       /* kd.setAge(10);
        kd.setBooktype("kids");
        kd.setAge(10);
        kd.setBooktype("kids");*/
        kd.registerAccount(10);
        kd.book("kids");
        kd.registerAccount(18);
        kd.book("fiction");
        kd.registerAccount(5);
        kd.book("kids");
        kd.registerAccount(7);
        kd.book("fiction");


       /* System.out.println(kd.getAge() + " " + kd.getBooktype());
        KidUser kd1 = new AdultUser();
        kd.setAge(5);
        kd.setBooktype("kids");
        System.out.println(kd.getAge() + " " + kd.getBooktype());
        kd.setAge(23);
        kd.setBooktype("fiction");
        System.out.println(kd.getAge() + " " + kd.getBooktype());
        kd.setAge(4);
        kd.setBooktype("fiction book");
        System.out.println(kd.getAge() + " " + kd.getBooktype());*/

    }
}
