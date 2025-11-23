import java.util.Scanner;

public class Lucky{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int a3 = sc.nextInt();
        
        boolean foundLuckyPair = false;
        if ((a1 + a2) % 2 == 0 && (a1 + a2) > 0) {
            foundLuckyPair = true;
        } else if ((a1 + a3) % 2 == 0 && (a1 + a3) > 0) {
            foundLuckyPair = true;
        } else if ((a2 + a3) % 2 == 0 && (a2 + a3) > 0) {
            foundLuckyPair = true;
        }
        
        if (foundLuckyPair) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
