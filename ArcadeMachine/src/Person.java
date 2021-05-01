
public class Person {
	private int coin;
	public Person(int coin) {
		this.coin = coin;
	}
	public void insertCoin(Coinable coinable) {
		System.out.println(coin + " coin/s available");
		if(coin>0) {
		if(!coinable.insertCoin()) {
			coin--;
			System.out.println("Coin Refunded");
		}
		}
		else if(coin==0) {
			System.out.println("Out of Coins");
		}
		coin--;
	}
}
