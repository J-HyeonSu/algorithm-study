import java.util.Scanner;
public class SWEA_1210 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for(int num = 1; num <= 10; num++){
            num = sc.nextInt();

            int[][] arr = new int[100][100];
            int pointY=0;

            for(int x = 0; x < 100; x++) {
                for(int y = 0; y < 100; y++){
                    arr[x][y] = sc.nextInt();
                    if(arr[x][y] == 2){
                        pointY = y;
                    }
                }
            }
            
            
            for(int x = 99; x >= 0; x--) {
                if(pointY-1>=0 && arr[x][pointY-1] == 1) {
                    while(pointY-1>=0 && arr[x][pointY-1] == 1){
                        pointY--;
                    }
                }
                else if(pointY+1<100 && arr[x][pointY+1] == 1) {
                    while(pointY+1<100 && arr[x][pointY+1] == 1){
                        pointY++;
                    }
                }
            }


            System.out.println("#" + num + " "+pointY);
        }

        

    }
    
}
