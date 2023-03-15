//interface class Bank
interface Bank
{
    //Abstract Method
    public abstract void deposit();
    public abstract void withdrawl();
}
//Create a Class Dev which implement Bank Interface
class Dev implements  Bank
{
    //Implement methods which are define in interface
    public void deposit()
    {
        System.out.println("Your Deposit Amount is "+1100);
    }
    public void withdrawl()
    {
        System.out.println("Your Withdrawl Amount is "+1000);
    }
}
//Create a class Main and create an object of class and call implement method
public class Main {
    public static void main(String[] args) {
        Dev d = new Dev();
        d.deposit();
        d.withdrawl();
    }
}
