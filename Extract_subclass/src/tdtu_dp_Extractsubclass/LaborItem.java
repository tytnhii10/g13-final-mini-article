package tdtu_dp_Extractsubclass;

public class LaborItem extends JobItem {
	public LaborItem (int quantity, Employee employee) {
		super (0, quantity);
		_employee = employee;
	}
	protected boolean isLabor() {
		return true;
	}
	public int getUnitPrice(){
		return _employee.getRate();
	}
}
