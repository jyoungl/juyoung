
public class PizzaStore {
	public Pizza order(String pizzaName) {
		switch(pizzaName) {
		case "어니언":
			System.out.println("어니언피자를 내놓습니다.");
			return new OnionPizza();
		case "갈릭":
			System.out.println("갈릭피자를 내놓습니다.");
			return new GarlicPizza();
		default:
			System.out.println("취급하지 않는 품목입니다.");
			return null;
		}
	}
}