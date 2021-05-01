import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
		int coins, coin;
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert coins to play. Coins to be Inserted:");
		coins = sc.nextInt();
		coin = coins+1;
		ArcadeMachine arcade = new ArcadeMachine();
		Person person = new Person(coins);
		for(int i=0; i<coin; i++) {
			person.insertCoin(arcade);
			coins--;
		}
	}
}
