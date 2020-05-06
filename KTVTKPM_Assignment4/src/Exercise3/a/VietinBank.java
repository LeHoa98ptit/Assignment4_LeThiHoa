package Exercise3.a;

/**
 *
 * @author LeHoa
 */
public class VietinBank extends Bank{
    public VietinBank(Account account) {
        super(account);
    }
 
    @Override
    public void openAccount() {
        System.out.print("Open your account at VietinBank is a ");
        account.openAccount();
    }
}
