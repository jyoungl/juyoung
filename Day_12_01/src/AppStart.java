import java.io.File;

public class AppStart {
	public static int convert(String str) throws Exception {
		return Integer.parseInt(str);
	}
		public static void main(String[] args) {
			File f = new File("data.txt");
		try {
		Thread.sleep(30000L);
		}
		catch (InterruptedException e) {}
		System.out.println("프로그램 종료");
		}
}
