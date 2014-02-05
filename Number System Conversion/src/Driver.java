import javax.swing.JOptionPane;

public class Driver {
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
		String s = "";
		for (x = x; x > 0; x /= 2)
			s = (x % 2) + s;
		return s;
	}

	public static String octalizer(int x) {
		String s = "";
		for (x = x; x > 0; x /= 8)
			s = (x % 8) + s;
		return s;
	}

	public static String hexer(int x) {
		String s = "";
		for (x = x; x > 0; x /= 16)
			s = getMeMyHexSymbol(x % 16) + s;
		return s;
	}

	public static String getMeMyHexSymbol(int n) {
		switch (n) {
		case (10):
			return "A";
		case (11):
			return "B";
		case (12):
			return "C";
		case (13):
			return "D";
		case (14):
			return "E";
		case (15):
			return "F";
		default:
			return "" + n;
		}
	}
}