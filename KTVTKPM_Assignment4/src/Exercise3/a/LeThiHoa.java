package Exercise3.a;

/**
 *
 * @author LeHoa
 */
public class LeThiHoa {
    public static void main(String[] args) {
        Bank vietcomBank = new VietcomBank(new CheckingAccount());
        vietcomBank.openAccount();
 
        Bank tpBank = new TPBank(new CheckingAccount());
        tpBank.openAccount();
        
        Bank vietnBank = new VietinBank(new CheckingAccount());
        vietnBank.openAccount();
    }
}
