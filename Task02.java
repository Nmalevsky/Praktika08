import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Task02 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i != n && i!=0) {
                        System.out.println(" ");
                    }
                    System.out.print("*");
                }

                System.out.println("-");
            }
        }
        }



