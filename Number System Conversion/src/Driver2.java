import javax.swing.JOptionPane;

public class Driver2 {
	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog(null, "Enter a number.");
		int input = Integer.parseInt(s);
		String binary = binarizer(input);
		String octal = octalizer(input);
		String hex = hexer(input);
		String answer = "The number " + input + " is \nbinary: " + binary
				+ "\noctal: " + octal + "\nhex: " + hex;
		JOptionPane.showMessageDialog(null, answer);
	}

	public static String binarizer(int x) {
		return Integer.toBinaryString(x);
	}

	public static String octalizer(int x) {
		return Integer.toOctalString(x);
	}

	public static String hexer(int x) {
		return Integer.toHexString(x).toUpperCase();
	}
}