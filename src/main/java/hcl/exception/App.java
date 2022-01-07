package hcl.exception;

public class App 
{
    public static void main( String[] args )
    {
        Account testAcnt = new Account(0);
        testAcnt.deposit(600);
        System.out.println("$" + testAcnt.getBalance());
        testAcnt.withdraw(100);
        System.out.println("$" + testAcnt.getBalance());
        try {
        	testAcnt.withdraw(600);
        } catch (InsufficentBalanceException e) {
        	System.out.println(e.toString());
        }
    }
}
