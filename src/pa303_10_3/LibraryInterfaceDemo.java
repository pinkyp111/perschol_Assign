package pa303_10_3;

public class LibraryInterfaceDemo {
    public static void main(String[] args) {

        KidUser kd = new KidUser();
        kd.setAge(10);
        kd.setBooktype("kids");
        System.out.println(kd.getAge() + " " + kd.getBooktype());
        kd.setAge(18);
        kd.setBooktype("fiction");
        System.out.println(kd.getAge() + " " + kd.getBooktype());
        KidUser kd1 = new AdultUser();
        kd.setAge(5);
        kd.setBooktype("kids");
        System.out.println(kd.getAge() + " " + kd.getBooktype());
        kd.setAge(23);
        kd.setBooktype("fiction");
        System.out.println(kd.getAge() + " " + kd.getBooktype());


    }
}
