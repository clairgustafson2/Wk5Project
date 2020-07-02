
public class SpacedLogger implements Logger {

	@Override
	public void log(String log) {
		String s = log.toString();
		s = s.replaceAll(".", "$0 ");
		System.out.println(s);
	}

	@Override
	public void error(String error) {
		String e = error.toString();
		e = e.replaceAll(".", "$0 ");
		System.out.println("ERROR: " + e);
		
	}

}
