package Genirics;

public class Logic {
	public static void main(String[] args) {
		Pair<String, String> vc = new Pair<>("vamsi", "1143");
		System.out.println(vc.toString());
		vc.setKey("varam");
		vc.setValue("134");
		System.out.println(vc.toString());
		
		Pair<String ,java.util.Date> p1 = new Pair<>("Today is",(new java.util.Date()));
		System.out.println(p1.toString());

	}

}
