import java.util.Scanner;
public class Ex02 {

    public static int totalCnt = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		for(int t = 1; t <= test; t++) {
			String s = sc.next();
			int[] a = new int[s.length()];
			for(int i = 0; i < s.length(); i++) {
				a[i] = s.charAt(i) - '0';
			}
			change(a, 0, 0);
			
			
			System.out.println("#" + t + " " + totalCnt);
            totalCnt = 0;
		}

    }

    public static void change(int[] arr, int point, int cnt) {
		if(cnt == arr.length) {
			return;
		}
		if(arr[cnt] != point) {
			point = arr[cnt];
			totalCnt++;
		}
		change(arr, point, cnt+1);
	}
}
