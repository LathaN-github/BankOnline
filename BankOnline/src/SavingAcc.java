
public abstract class SavingAcc extends BankAcc {
	public SavingAcc(int accNo, String accNm, float accBal) {
		super(accNo, accNm, accBal);
		
	}

	private boolean isSalaried;
	private static final float MINBAL = 50;

	public SavingAcc(int accNo, String accNm, float accBal, boolean isSlaried) {
		super(accNo, accNm, accBal);
	}

	synchronized public boolean getisSalaried() {
		return isSalaried;
	}

	@Override
	public void withdraw(float wd) {
		super.withdraw(wd);
	}

	@Override
	public String toString() {
		return super.toString();
	}
}