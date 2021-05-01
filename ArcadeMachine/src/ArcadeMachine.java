
public class ArcadeMachine implements Coinable, Dispensable {
	int coins;
	public ArcadeMachine() {
		this.coins = 0;
	}
	
	@Override
	public void dispense() {
		System.out.println("Coin Inserted");
		System.out.println("Ready to Play");
		System.out.println("GAME OVER");
		coins++;
		System.out.println(coins + " coin/s earned");
	}
	@Override
	public boolean insertCoin(){
		this.dispense();
		return true;
	}
}
