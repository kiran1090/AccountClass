public class Account {
public String BankId,Name;
public double Balance;
public int credit,debit;

public Account(String BankId, String Name,double Balance)
{
    this.BankId=BankId;
    this.Name=Name;
    this.Balance=Balance;

}
public double credit(int i)
{
    return Balance=this.Balance+100;
}
public double debit(int i)
{
    return Balance -= 50;
}


    @Override
    public String toString() {
        return "Account{" +
                "BankId='" + BankId + '\'' +
                ", Name='" + Name + '\'' +
                ", Balance=" + Balance +
                '}';
    }

    public double transferTo(Account a2, int i) {

    return Balance= a2.Balance+ 100;



    }
}
