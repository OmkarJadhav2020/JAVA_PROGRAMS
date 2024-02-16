import java.util.Scanner;
public class ncr {
    public static void main(String[] args) {
        int n, r;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter n");
        n = scan.nextInt();
        System.out.println("Enter r"); r =
                scan.nextInt();
        int nfact = 1; for(int i = 1; i <=
                n; i++) {
            nfact = nfact * i;
        }
        int rfact = 1; for(int i = 1; i <=
                r; i++) {
            rfact = rfact * i;
        }
        int n_rfact = 1;
        for(int i = 1; i <= (n - r); i++) {
            n_rfact = n_rfact * i;
        }
        int result = nfact / (rfact * n_rfact);
        System.out.println("Result is - " + result);
    }
}