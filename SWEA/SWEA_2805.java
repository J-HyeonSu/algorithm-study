import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_2805 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(bf.readLine());

        for(int t = 1; t <= T; t++){
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            int map[][] = new int[N][N];
            for(int i = 0; i < N; i++){
                st = new StringTokenizer(bf.readLine());
                for(int j = 0; j < N; j++){
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int max=0, sum=0;
            
            
            int startX = 0;
            int startY = 0;
            while(startX + M <= N && startY+M <= N){
                for(int i=startX; i<startX+M; i++){
                    for(int j = startY; j<startY+M; j++){
                        sum+=map[i][j];
                    }
                }
                if(max<sum){
                    max = sum;
                    
                }
                sum=0;

                if(startX+M<N){
                    startX++;
                }else if(startY+M<N){
                    startY++;
                    startX=0;
                }else{
                    break;
                }
            }
            
            
            sb.append("#").append(t).append(" ").append(max).append('\n');
        }
        System.out.println(sb);

    }
}
