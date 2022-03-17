import java.util.Scanner;
public class SWEA_1954 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int num = 1; num <= T; num++){
            int N = sc.nextInt();
            int arr[][] = new int[N][N];
            
            int count=1;
            int x=0, y=0;
            arr[x][y] = count;
            while(count < N*N){
                while(y+1<N && arr[x][y+1]==0){ 
                    y++;    
                    count++;
                    arr[x][y]=count;
                }
                while(x+1<N && arr[x+1][y]==0){
                    x++;
                    count++; 
                    arr[x][y]=count;
                }
                while(y-1>=0 && arr[x][y-1]==0){
                    y--;
                    count++;
                    arr[x][y]=count;
                }
                while(x-1>=0 && arr[x-1][y]==0){
                    x--;
                    count++;
                    arr[x][y]=count;
                }

            }
            System.out.println("#" + num);
            for(int i=0; i<N; i++){
                for(int j=0; j<N; j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
        }

        

    }
}
