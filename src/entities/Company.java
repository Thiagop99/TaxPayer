package entities;

public class Company extends TaxPayer {
	
	private int numberOfEmployess;
	
	public Company() {
		super();
	}
	
	public Company(String name, Double anualIncome, int numberOfEmployess) {
		super(name, anualIncome);
		this.numberOfEmployess = numberOfEmployess;
	}

	public int getNumberOfEmployess() {
		return numberOfEmployess;
	}

	public void setNumberOfEmployess(int numberOfEmployess) {
		this.numberOfEmployess = numberOfEmployess;
	}

	@Override
	public Double tax() {
		if (numberOfEmployess > 10) {
			return super.getAnualIncome() * 0.14;
		}
		else {
			return super.getAnualIncome() * 0.16;
		}
	}

}
