package by.itclass.gomel;

public class TravelExpenses {
	private static final int   DAY_WAGE=25000;
	private String account;
	private double transportExpenses;
	private int daysQuantity;
	private double total;
	
public TravelExpenses(){
	
}

public TravelExpenses(String account,double transportExpenses, int daysQuantity){
	this.account=account;
	this.transportExpenses =transportExpenses;
	this.daysQuantity=daysQuantity;
	
}

	public String getAccount() {
	return account;
}

public void setAccount(String account) {
	this.account = account;
}

public double getTransportExpenses() {
	return transportExpenses;
}

public void setTransportExpenses(double transportExpenses) {
	this.transportExpenses = transportExpenses;
}

public int getDaysQuantity() {
	return daysQuantity;
}

public void setDaysQuantity(int daysQuantity) {
	this.daysQuantity = daysQuantity;
}

public double getTotal() {
	return total;
}

public void setTotal(double total) {
	this.total = total;
}

	public double getTotalExpenses( double transportExpenses, int daysQuantity){
		total = transportExpenses+((double)daysQuantity*DAY_WAGE);
		return total;
		}
	
	public void show(){
		System.out.println("DAY_WAGE=" + DAY_WAGE + "\n" + "account=" + account +"\n" 
   + "transportExpenses=" + transportExpenses +"\n" +"daysQuantity=" + daysQuantity +"\n"
  +"total=" + total);
		
	}	 		 
		 public String toString(){
			return DAY_WAGE + ";"  + account +";" + transportExpenses +";" + daysQuantity +";"
					   + total;
		}
	}

