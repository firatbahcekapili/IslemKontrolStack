import java.util.Scanner;
import java.util.Stack;

public class islemKontrolStack {

	public static void main(String[] args) {

		Stack<String> s = new Stack<String>();
		Scanner string = new Scanner(System.in);
		String str = string.nextLine();
		// String string = "(5-6+3))(2/5)+7+8)*(2/5+8)(2/3)(4+2)";

		char b[] = str.toCharArray();

		String c[] = new String[b.length];

		for (int i = 0; i < b.length; i++) {
			c[i] = String.valueOf(b[i]);

		}

		for (int i = 0; i < b.length; i++) {
			s.push(c[i]);
		}

		int ac�k = 0, kapal� = 0;

		String kontrol;

		for (int k = 0; k < b.length; k++) {
			try {
				kontrol = s.pop().toString();

				if (kontrol.equals("(")) {
					ac�k++;
				} else if (kontrol.equals(")")) {
					kapal�++;
				}
			} catch (Exception e) {

			}

		}
		System.out.println("A��k Parantez : " + ac�k + " Kapal� Parantez : " + kapal�);
		if (kapal� == ac�k) {
			System.out.println("��lem do�ru");
		} else
			System.out.println("��lem yanl��");

	}

}
