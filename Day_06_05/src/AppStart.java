
public class AppStart {

	public static void main(String[] args) {
		Maker maker = new Maker();
		Beverage tmp;
		tmp = maker.getBeverage("È«Â÷");
		tmp = maker.getBeverage("Ä¿ÇÇ");
		tmp = maker.getBeverage("È«Â÷");
		tmp = maker.getBeverage("Ä¿ÇÇ");
		tmp = maker.getBeverage("È«Â÷");
		System.out.println("ÃÑ " + maker.getCount() + "ÀÜÀÌ ¸¸µé¾îÁ³½À´Ï´Ù.");
	}

}