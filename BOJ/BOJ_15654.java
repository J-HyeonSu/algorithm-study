import java.util.Scanner;
import java.util.Arrays;

public class BOJ_15654 {
    public static int[] arr, list;
    public static boolean[] visit;
	public static int N, M;
	public static StringBuilder sb = new StringBuilder();
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
 
		N = sc.nextInt();
		M = sc.nextInt();
        
        list = new int[N];
        for(int i = 0; i < N;i++) {
            list[i] = sc.nextInt();
        }
        Arrays.sort(list);
		arr = new int[M];
        visit = new boolean[N];
        
		dfs(N, M, 0);
		System.out.print(sb);
 
	}
 
	public static void dfs(int N,int M, int depth) {
 
		if (depth == M) {
			for (int val : arr) {
				sb.append(val).append(' ');
			}
			sb.append('\n');
			return;
		}
        
		for (int i = 0; i < N; i++) {
            if(!visit[i]){
                visit[i] = true;
                arr[depth] = list[i];
                dfs(N, M, depth + 1);
                visit[i] = false;

            }
 
			
		} 
	}
}
