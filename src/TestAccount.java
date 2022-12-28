public class TestAccount {
    public static void main(String [] args)
    {
        Account a1= new Account("P1","arun",100);
        Account a2= new Account("P1","ann",100);
        System.out.println("Account Details:"+a1);
        System.out.println("Account Details:"+a2);
        // Test credit() and debit()
      a1.credit(100);
      System.out.println(a1);
      a1.debit(50);
      System.out.println(a1);
      a1.debit(500);  // debit() error
      System.out.println(a1);

      // Test transfer()
      a1.transferTo(a2, 100);  // toString()
      System.out.println(a1);
      System.out.println(a2);
    }
}
