package elevator;

public class FPButton implements Button{
	
	private int number;

	public FPButton(int num){
		number = num;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public void press() {
		// TODO Auto-generated method stub
		System.out.println("button no "+number+" pressed in control panel");
	}
}
