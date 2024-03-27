package pa303_10_3;

public class AdultUser extends KidUser implements LibraryUser {
    @Override
    public void setBooktype(String booktype) {
        super.setBooktype(booktype);
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public String getBooktype() {
        return super.getBooktype();
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public void registerAccount(int age) {
        if (age >= 12)
            System.out.println("You have successfully registered under an Adult Account");

        else if (age <= 11)
            System.out.println("Sorry, age must be greater than 12 to register as an adult");


    }

    @Override
    public String book(String Booktype) {
        if (Booktype.equals("fiction"))
            return "Book issued successfully, please return the book within 7 days";
        else
            return "Oops, you are allowed to take only adult fiction books";
    }
}
