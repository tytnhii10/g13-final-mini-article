package tdtu_dp_pullupmethod;

import java.sql.Date;

public abstract class Customer {
	public Date LastBillDate;
	protected void AddBill(Date date, double amount) {
	}
	public void CreateBill(Date date) {
		double chargeAmount = ChargeFor (LastBillDate, date);
		AddBill (date, chargeAmount);
	}
	protected abstract double ChargeFor(Date start, Date end);
}
