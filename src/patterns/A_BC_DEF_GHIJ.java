package patterns;
import java.awt.AlphaComposite;
import java.util.Scanner;
public class A_BC_DEF_GHIJ {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();
	    int Alpha = 65;
		sc.close();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print((char) Alpha);
				Alpha++;
			}
			System.out.println();
		}
	}
}*/
		int Alpha = 65;
		for (int i = 1; i <= 1; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print((char) (Alpha));
			}
			System.out.println();
			for (int k = 1; k <= 2; k++) {
				System.out.print((char) (Alpha + k));
			}
			System.out.println();
			for (int l = 3; l <= 5; l++) {
				System.out.print((char) (Alpha + l));
			}
			System.out.println();
			for (int m = 6; m <= 9; m++) {
				System.out.print((char) (Alpha + m));
			}
		}
	}
}