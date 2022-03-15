import java.util.Scanner;
 
public class Ex03 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N = sc.nextInt();
        int swi = 0;
        int mal = 0;
        int number = 0;
        boolean arr[] = new boolean [N+1];
        for(int i = 1; i < N+1;i++) {
            swi= sc.nextInt();
            if(swi == 1)
                arr[i] = true;
        }
        int ip = sc.nextInt();
        for(int i = 0; i < ip; i++) {
            mal = sc.nextInt();
            number = sc.nextInt();
            if(mal == 1) {
                for(int j = number; j  <= N; j+=number) {
                    arr[j] = !arr[j];
                }
            }
            if(mal == 2) {
                arr[number] = !arr[number];
                gswitch(arr,number,0,N);
            }
        }
        for(int i = 1; i <= N; i ++) {
            if(i%20 == 1 && i != 1)
                System.out.println();
            if(arr[i] == true)
                System.out.print(1 + " ");
            else
                System.out.print(0 + " ");
        }
        System.out.println();
        for(int i = 0; i < N+1; i++ ) {
            arr[i] = false;
        }
    }
    public static void gswitch(boolean ar[] , int n, int count,int N) {
        if(n+count > N || n-count < 1)
            return;
        if(ar[n+count] == ar[n-count]) {
            ar[n+count] = !ar[n+count];
            ar[n-count] = !ar[n-count];
            gswitch(ar,n,count+1,N);
        }
        return;
    }
}