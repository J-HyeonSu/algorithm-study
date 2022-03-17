
import java.util.Scanner;
import java.util.Arrays;
public class SWEA_1208{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for(int num = 1; num <= 10; num++){
            int N = sc.nextInt();

            int[] arr = new int[100];
            for(int t = 0; t < 100; t++) arr[t] = sc.nextInt();   

            Arrays.sort(arr);

            for(int i = 0; i < N; i++){
                arr[0]++;
                arr[99]--;
                Arrays.sort(arr);
            }


            System.out.println("#" + num + " " + (arr[99] - arr[0]));
        }

        

    }
}