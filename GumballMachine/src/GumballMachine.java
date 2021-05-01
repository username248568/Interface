
public class GumballMachine implements Coinable, Dispensable {
	int gum = 0;
	public GumballMachine() {
		this.gum = 5;
	}
	
	@Override
	public boolean insertCoin() {
		if (this.gum > 0) {
			this.dispense();
			return true;
		}
	System.out.println("Return Coin");
	return false;
	}
	@Override
	public void dispense() {
		this.gum--;
		System.out.println("1 gum dispensed.");
	}
	@Override 
	public void reload(int count) {
	this.gum += count;	
	}
}
