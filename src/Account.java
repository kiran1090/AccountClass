public class Account {
public String BankId,Name;
public double Balance;
public Account(String BankId, String Name,double Balance)
{
    this.BankId=BankId;
    this.Name=Name;
    this.Balance=Balance;
}

    @Override
    public String toString() {
        return "Account{" +
                "BankId='" + BankId + '\'' +
                ", Name='" + Name + '\'' +
                ", Balance=" + Balance +
                '}';
    }
}
