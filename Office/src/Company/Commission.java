package Company;

public class Commission extends Hourly { 
	private double saleTotal;
	private double commissionRate;
	
	public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commisionRate) {
		super(eName, eAddress, ePhone, socSecNumber, rate);
		this.commissionRate = commisionRate;
	}
	
	public void addSales(double totalSales){
		this.saleTotal = totalSales;
	}
	
	public double pay(){
		double payment = super.pay() + (saleTotal*commissionRate);
		saleTotal = 0;
		
		return payment;
	}
	
	public String toString() {
		String result = super.toString();
		result += "\nTotal Sales: " + saleTotal;
		
		return result;
	}

}
