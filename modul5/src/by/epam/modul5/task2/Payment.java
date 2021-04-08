package by.epam.modul5.task2;

import java.util.ArrayList;
import java.util.List;

public class Payment {
	
	private String typeOfPayment; // Наличными или картой
	private List<Goods> payments;

	{
		payments = new ArrayList<Goods>();
	}

	public Payment(String typeOfPayment) {
		super();
		this.typeOfPayment = typeOfPayment;

	}

	public Payment() {

	}

	public void addPayments(Goods goods) {
		payments.add(goods);
	}

	public void removePayments(Goods goods) {
		payments.remove(goods);
	}

	public String getTypeOfPayment() {
		return typeOfPayment;
	}

	public void setPay(String typeOfPayment) {
		this.typeOfPayment = typeOfPayment;
	}

	public List<Goods> getPayments() {
		return payments;
	}

	public void setPayments(List<Goods> payments) {
		this.payments = payments;
	}

	public static class Goods {
		private String name;
		private double price;
		private String country;

		public Goods(String name, double price, String country) {
			super();
			this.name = name;
			this.country = country;
			this.price = price;
		}

		public Goods() {

		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		public String getCountry() {
			return country;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((country == null) ? 0 : country.hashCode());
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			long temp;
			temp = Double.doubleToLongBits(price);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Goods other = (Goods) obj;
			if (country == null) {
				if (other.country != null)
					return false;
			} else if (!country.equals(other.country))
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "����� [ "+name + ", ����=" + price + ", ������ �������������=" + country + "]";
		}

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((typeOfPayment == null) ? 0 : typeOfPayment.hashCode());
		result = prime * result + ((payments == null) ? 0 : payments.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Payment other = (Payment) obj;
		if (typeOfPayment == null) {
			if (other.typeOfPayment != null)
				return false;
		} else if (!typeOfPayment.equals(other.typeOfPayment))
			return false;
		if (payments == null) {
			if (other.payments != null)
				return false;
		} else if (!payments.equals(other.payments))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Payment [typeOfPayment=" + typeOfPayment + ", payments=" + payments + "]";
	}
}
