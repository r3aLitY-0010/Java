import java.util.Scanner;

public class CaesarCipher {
	static String s = "Caesar Cipher";
	public static int num, shift;
	public static String str;

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		do {
			showMessage();
			showMenu();
			System.out.print("Enter: ");
       
			num = scan.nextInt();
			chooseMenu(num);
			System.out.println();
			System.out.println("Try again (y/n) :");
			str = scan.next();
		}	while (str.equalsIgnoreCase("y"));

		scan.close();
		System.out.println("Thanks for using our app see ya !");

	}
	

	// show message
	public static void showMessage() {
		for (int i = 0; i <= s.length() + 3; i++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.println("**" + s + "**");
		for (int i = 0; i <= s.length() + 3; i++) {
			System.out.print("*");
		}
		System.out.println();

	}
	
	

	// showing menu
	public static void showMenu() {
		System.out.println("1" + ". Encrypt");
		System.out.println("2" + ". Decrypt");
	}
	
	

	// choosing number
	public static int chooseMenu(int num) {
		Scanner scan = new Scanner(System.in);
		if (num == 1) {
			System.out.print("Enter Algorithm number[1-20]: ");

			int shift = scan.nextInt();
			encryptString(shift);
			
		} else if (num == 2) {
			System.out.print("Enter Algorithm number[1-20]: ");

			int shift = scan.nextInt();
			decryptString(shift);
			
		} else {
			System.out.println("The code you entered is wrong. Please enter again!");
		}

		return num;
	}
	

	// encrypt
	public static StringBuffer decryptString(int shift) {
		String str;
		StringBuffer res = new StringBuffer();
		// String s1 ="Your word is";
		String s1 = "Decrypted word is";
		Scanner sc = new Scanner(System.in);
		if (shift >= 1 && shift <= 20) {
			System.out.print("Enter a word you want to decrypt: ");
			str = sc.nextLine();
			
			for (int i = 0; i < str.length(); i++) {

				if (str.charAt(i) == ' ') {
					res.append(' ');
					continue;
				}
				if (Character.isUpperCase(str.charAt(i))) {
					char ch = (char) (((int) str.charAt(i) - shift + 26 - 65) % 26 + 65);
					
					res.append(ch);
				} else {
					char ch = (char) (((int) str.charAt(i) - shift + 26 - 97) % 26 + 97);
					//System.out.println("i is "+str.charAt(i));
					res.append(ch);
					
				}
			}
			System.out.println(s1);
			for (int i = 0; i <= res.length() + 3; i++) {
				System.out.print("*");
			}
			System.out.println();
			System.out.println("**" + res + "**");
			for (int i = 0; i <= res.length() + 3; i++) {
				System.out.print("*");
			}
			
		} else {
			System.out.println("Please enter correct algorithm number!");
		}
		return res;

	}
	
	
	// encrypt
		public static StringBuffer encryptString(int shift) {
			String str;
			StringBuffer res = new StringBuffer();
			// String s1 ="Your word is";
			String s2 = "Encrypted word is";
			Scanner sc = new Scanner(System.in);
			if (shift >= 1 && shift <= 20) {
				System.out.print("Enter a word you want to encrypt: ");
				str = sc.nextLine();
				
				for (int i = 0; i < str.length(); i++) {

					if (str.charAt(i) == ' ') {
						res.append(' ');
						continue;
					}
					if (Character.isUpperCase(str.charAt(i))) {
						char ch = (char) (((int) str.charAt(i) + shift - 65) % 26 + 65);
						
						res.append(ch);
					} else {
						char ch = (char) (((int) str.charAt(i) + shift - 97) % 26 + 97);1
						res.append(ch);
						
					}
				}
				System.out.println(s2);
				for (int i = 0; i <= res.length() + 3; i++) {
					System.out.print("*");
				}
				System.out.println();
				System.out.println("**" + res + "**");
				for (int i = 0; i <= res.length() + 3; i++) {
					System.out.print("*");
				}
				
			} else {
				System.out.println("Please enter correct algorithm number!");
			}
			return res;

		}


	
	   
}