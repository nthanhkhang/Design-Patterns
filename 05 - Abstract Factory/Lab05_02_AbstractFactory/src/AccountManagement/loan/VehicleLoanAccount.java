package AccountManagement.loan;

import AccountManagement.AccountType;
import AccountManagement.InterestStrategy;

public class VehicleLoanAccount extends LoanAccount {
	public VehicleLoanAccount(long accountNo, String accountHolderName, int termInMonths) {

        super(accountNo, accountHolderName, AccountType.VEHICLE_LOAN, termInMonths);

        setInterestStrategy(InterestStrategy.COMPOUND);

    }

    @Override

    public double getInterest(int term) {

        return this.getInterestStrategy().getInterest(accountType, amount, term);

    }
}
