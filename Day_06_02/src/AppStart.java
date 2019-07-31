
public class AppStart {
	public static void main(String[] args) {
		PizzaStore ps = new PizzaStore();
		Pizza pizza = ps.order("어니언");
		
		if(pizza instanceof Pizza) {
			System.out.println("피자 인스턴스입니다.");
		}
		
		if(pizza instanceof OnionPizza) {
			System.out.println("어니언피자 인스턴스.");
			OnionPizza p = (OnionPizza)pizza;
		}
		
		if(pizza instanceof GarlicPizza) {
			System.out.println("갈릭피자 인스턴스.");
		}
	}
}