package by.itclass.gomel;

public class App {

	public static void main(String[] args) {
		TravelExpenses[] expenses = new TravelExpenses[5];
		expenses[0] = new TravelExpenses("Artur Ivanov", 500000.25, 7);
		expenses[1] = new TravelExpenses("Ivan Ivanov", 1000000.25, 5);
		expenses[3] = new TravelExpenses("Ivan Sidorov", 600000.25, 8);
		expenses[4] = new TravelExpenses();
		expenses[4].setTransportExpenses(45454565.3);

		for (TravelExpenses te1 : expenses) {
			if (te1 != null) {
				te1.show();
			}
		}
		System.out.println("duration=" + (expenses[0].getDaysQuantity()+expenses[1].getDaysQuantity()));
		
		for (TravelExpenses te1 : expenses) {
			if (te1 != null) {
				System.out.println(te1.toString());
			}
		}
	}

}
