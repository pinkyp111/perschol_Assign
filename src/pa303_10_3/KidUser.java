package pa303_10_3;

public class KidUser implements LibraryUser {
    private int age;
    private String Booktype;

    public int getAge() {
        return age;
    }

    public String getBooktype() {
        return Booktype;
    }

    public void setBooktype(String Booktype) {
        this.Booktype = Booktype;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void registerAccount(int age) {

        if (age <= 11)
            System.out.println("You have successfully registered under a Kids Account");
        else if (age > 11)
            System.out.println("Sorry, age must be less than 12 to register as a kid");
    }


    public void book(String Booktype) {
        if (Booktype.equals("kids"))
            System.out.println("Book issued successfully, please return the book within 10 days");
        else
            System.out.println("Oops, you are allowed to take only kids books");
    }
}


