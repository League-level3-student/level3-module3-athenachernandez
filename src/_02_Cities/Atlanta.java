package _02_Cities;

public class Atlanta extends City{

	public Atlanta(int population, double taxRate) {
		super(population, taxRate);
	}

	@Override
	double getAnnualTaxes() {
		double taxes = population * taxRate - (0.15 * population);
		return taxes;
	}

}
