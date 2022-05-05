package tdtu_dp_pullupmethod;

public class Preferred_Customer extends Customer {
	@Override
	protected double ChargeFor(java.sql.Date start, java.sql.Date end) {
		return (end.getTime()  - start.getTime()) *80;
	}
}
