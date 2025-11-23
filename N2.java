import java.util.Scanner;

public class N2  {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while (T-- > 0) {
            int N = in.nextInt();
            int L = in.nextInt();
            long S = in.nextLong();

            boolean found = false;
            long sum = 0;
            for (int i = 0; i < L; i++) {
                sum += i + 1;
            }

            if (sum == S) {
                found = true;
            }

            for (int i = L; i < N; i++) {
                sum = sum - (i - L + 1) + (i + 1);
                if (sum == S) {
                    found = true;
                    break;
                }
            }

            if (found) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
