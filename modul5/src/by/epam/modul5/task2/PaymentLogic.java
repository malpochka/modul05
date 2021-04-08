package by.epam.modul5.task2;

public class PaymentLogic {

	public double total(Payment payment) {
		double sum;

		sum = 0;

		for (int i = 0; i < payment.getPayments().size(); i++) {
			sum = sum + payment.getPayments().get(i).getPrice();
		}
		return sum;
	}
}
