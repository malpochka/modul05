package by.epam.modul5.task2;

import java.util.List;

import by.epam.modul5.task2.Payment.Goods;

public class PaymentView {

	public void print(List<Goods> goods) {
		for (Goods good : goods) {
			System.out.println(good);
		}
	}

	public void printTotal(double sum) {

		System.out.println("Итого:  " + sum);
	}
}
