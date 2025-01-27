package AccountManagement.saving;

import AccountManagement.Account;
import AccountManagement.AccountType;
import AccountManagement.InterestStrategy;

public class CurrentAccount extends Account {
	public CurrentAccount(long accountNo, String accountHolderName) {

        super(accountNo, accountHolderName, AccountType.CURRENT);

        setInterestStrategy(InterestStrategy.SIMPLE);

    }

    @Override

    public double getInterest(int term) {

        return this.getInterestStrategy().getInterest(accountType, amount, term);

    }

}
