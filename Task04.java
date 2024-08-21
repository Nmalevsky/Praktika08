import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int a = sc.nextInt();
        System.out.println("Enter the number : ");
        int b = sc.nextInt();
        while (a <= b) {
            if (a % 1 == 0 && a % a == 0 && a%2!=0 && a%4!=0 &&a%6!=0&&a%8!=0 && a%10!=0) {
                System.out.println(a);
            }
                a++;

        }
    }
}
