package _02_Cities;

public class SanDiego extends City{

	public SanDiego(int population, double taxRate) {
		super(population, taxRate);
	}

	@Override
	double getAnnualTaxes() {
		double taxes = population * taxRate + 1000000;
		return taxes;
	}
}
