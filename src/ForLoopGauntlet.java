
public class ForLoopGauntlet {
	public static void main(String[] args) {
		String asterisk = "*";
		StringBuilder sb;
		for (int i = 0; i < 7; i += 1) {
			
			
			if (i <= 2) {
			System.out.print(asterisk);
			asterisk = asterisk + "*";
			
			} else {
				System.out.print(asterisk);
				sb = new StringBuilder(asterisk);
				sb.deleteCharAt(0);
				asterisk = sb.toString();
				
			}
			System.out.println();
			
		}
	}
}
