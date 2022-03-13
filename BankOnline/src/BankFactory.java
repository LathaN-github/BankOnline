

public abstract class BankFactory {

	public MMSavingAcc getNewSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		return null;
	}

	public MMCurrentAcc getNewCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		return null;
	}
}