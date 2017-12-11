package App;
import Model.NumberUtils;

public class TesteNumberUtils {

	public static void main(String[] args) {
		NumberUtils n = new NumberUtils(20);
		
		System.out.println(n.isPair());
		System.out.println(n.isOddr());
		System.out.println(n.printCount());
		System.out.println(n.printReverseCount());
	
		
		
	}

}
