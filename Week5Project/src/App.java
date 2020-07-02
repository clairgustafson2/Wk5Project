
public class App {

	public static void main(String[] args) {

		Logger loggerA = new AsteriskLogger();
		Logger loggerS = new SpacedLogger();
		
	
		loggerA.log("AsterisksLogger");
		
		System.out.println();
		System.out.println();
		
		loggerA.error("AsterisksLogger");
		
		System.out.println();
		System.out.println();
		
		loggerS.log("Spaced");
		
		System.out.println();
		System.out.println();
		
		loggerS.error("Spaced");
		
		
		
	}

}
