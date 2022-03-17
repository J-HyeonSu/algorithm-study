import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA_2001 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(bf.readLine());

        for(int t = 1; t <= T; t++){
            int N = Integer.parseInt(bf.readLine());
            String farm[] = new String[N];
            for(int i =0; i < N ; i++){
                farm[i] = bf.readLine();
            }
            int sum=0;
            for(int i = 0; i < N/2; i++){
                for(int j = N/2-i; j<=N/2+i; j++){
                    sum += farm[i].charAt(j)-'0';
                }

            }
            for(int i = N/2; i<N; i++){
                for(int j = i-N/2; j<N-i+N/2; j++){
                    sum += farm[i].charAt(j)-'0';
                }
            }
            sb.append("#").append(t).append(" ").append(sum).append('\n');
        }
        System.out.println(sb);

    }
}
