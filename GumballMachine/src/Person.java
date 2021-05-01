
public class Person {
	private int coins;
	private int price;
	public Person(int coins) {
		this.coins = coins;
		this.price = 3;
	}
	public int getCoins() {
		return this.coins;
	}
	
	public void insertCoin(Coinable coinable,int coins) {
		System.out.println(coins+" coins Inserted");
		if(coins>2) {
			if(!coinable.insertCoin()) {
				System.out.println(coins + "coins refunded");
			}
			else {
				coins = coins-price;
				System.out.println("Change: " + coins);
			}
		}
		else {
			System.out.println("Insufficient Coins, Coins Returned: " + coins);
		}
	}
}
