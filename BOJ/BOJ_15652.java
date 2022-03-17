import java.util.Scanner;

public class BOJ_15652 {
    public static int[] arr;
	public static int N, M;
	public static StringBuilder sb = new StringBuilder();
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
 
		N = sc.nextInt();
		M = sc.nextInt();
 
		arr = new int[M];
        
		dfs(1, 0);
		System.out.print(sb);
 
	}
 
	public static void dfs(int step, int depth) {
 
		if (depth == M) {
			for (int val : arr) {
				sb.append(val).append(' ');
			}
			sb.append('\n');
			return;
		}
        
		for (int i = step; i <= N; i++) {
 
			arr[depth] = i;
			dfs(i, depth + 1);
		} 
	}
}