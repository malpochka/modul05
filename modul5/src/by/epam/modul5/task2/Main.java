package by.epam.modul5.task2;

import by.epam.modul5.task2.Payment.Goods;

/*Создать клас Payment с внутренним классом, с помощью объектов которого можно сформировать покупку из нескольких товаров.*/
public class Main {

	public static void main(String[] args) {
		double total;

		Payment pays = new Payment("Наличными");
		PaymentView view = new PaymentView();
		PaymentLogic logic = new PaymentLogic();

		pays.addPayments(new Goods("Хлеб", 2.5, "Беларусь"));
		pays.addPayments(new Goods("Молоко", 1.5, "Беларусь"));
		pays.addPayments(new Goods("Хлебцы", 5.25, "Финляндия"));
		pays.addPayments(new Goods("Масло", 3.59, "Россия"));

		total = logic.total(pays);
		view.print(pays.getPayments());
		view.printTotal(total);

	}

}
