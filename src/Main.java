import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("n sayısı : ");
        int n = input.nextInt();
        System.out.print("r sayısı : ");
        int r = input.nextInt();

        int ntotal = 1;
        int rtotal = 1;
        int nrtotal = 1;

        for (int i = 1; i<=n; i++){
            ntotal = ntotal*i;
        }

        for (int i = 1; i<=r; i++){
            rtotal = rtotal*i;
        }

        for(int i = 1; i<=(n-r); i++){
            nrtotal = nrtotal*i;
        }
        System.out.println(n+"! : "+ntotal);
        System.out.println(r+"! : "+rtotal);
        System.out.println((n-r)+"! : "+nrtotal);
        System.out.print("Kombinasyon : " +(ntotal/(rtotal*nrtotal)));
    }
}
