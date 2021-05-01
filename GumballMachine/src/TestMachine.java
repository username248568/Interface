
public class TestMachine {
	public static void main(String[] args) {
			System.out.println("Price: 1 gumball = 3 coins");
			GumballMachine gumballMachine = new GumballMachine();
			Person person = new Person(5);
			person.insertCoin(gumballMachine,2);
			person.insertCoin(gumballMachine,4);
			person.insertCoin(gumballMachine,5);
			person.insertCoin(gumballMachine,1);
			person.insertCoin(gumballMachine,3);
	}

}
