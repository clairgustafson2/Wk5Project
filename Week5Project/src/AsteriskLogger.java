
public class AsteriskLogger implements Logger {

	@Override
	public void log(String log) {
		String word = log.toString();
		System.out.println("***" + word + "***");
			
	}

	@Override
	public void error(String error) {
		String stars = "";
		int n= error.length();
		
		for (int i = 0; i<n + 12;i++) {
			stars += "*";
			
		}
		
		System.out.println();
		
		System.out.println(stars);
		System.out.println("***" + "ERROR:" + error + "***");
		System.out.println(stars);
		
		for (int i = 0; i<n + 12;i++) {
			stars += "*";
	}

}
}