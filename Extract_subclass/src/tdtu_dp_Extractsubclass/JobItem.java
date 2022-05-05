package tdtu_dp_Extractsubclass;

public class JobItem {
	protected JobItem(int unitPrice, int quantity) {
		_unitPrice = unitPrice;
		_quantity = quantity;
	}
	
	public int getTotalPrice() {
		 return getUnitPrice() * _quantity;
	}
	public int getUnitPrice(){
		 return _unitPrice;
	}
	public int getQuantity(){
		 return _quantity;
	}
	public Employee getEmployee() {
		 return _employee;
	}
	private int _unitPrice;
	private int _quantity;
	protected boolean isLabor() {
		 return false;
	}
	protected Employee _employee;

}
