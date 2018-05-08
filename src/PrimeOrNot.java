import javax.swing.JOptionPane;

public class PrimeOrNot {
	public static void main(String[] args) {
		String numS = JOptionPane.showInputDialog("number?");
		boolean prime = true;
		int num = Integer.parseInt(numS);
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				prime = false;
				break;
			} 
		}
		if (prime) {
			JOptionPane.showMessageDialog(null, "yay");
		} else {
			JOptionPane.showMessageDialog(null, "nay");
		}
		
	}
}
