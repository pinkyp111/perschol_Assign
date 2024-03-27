package pa303_10_3;

public class LibraryInterfaceDemo {
    public static void main(String[] args) {

        KidUser kd = new KidUser();
        KidUser kd1 = new AdultUser();
       /* kd.setAge(10);
        kd.setBooktype("kids");
        kd.setAge(10);
        kd.setBooktype("kids");*/
        kd.registerAccount(14);
        kd.book("kidsk");
        kd1.registerAccount(8);
        kd1.book("fictionll");

       /* System.out.println(kd.getAge() + " " + kd.getBooktype());
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
