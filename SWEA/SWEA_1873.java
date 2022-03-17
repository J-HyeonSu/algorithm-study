import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class SWEA_1873 {

    static int[] dx = { -1, 1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T  = Integer.parseInt(bf.readLine());

        for(int t = 1; t <= T; t++){
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            char map[][] = new char[H][W];
            int x=0,y=0;

            for(int i =0; i< map.length; i++){
                String s = bf.readLine();
                for(int j = 0; j < map[i].length; j++){
                    map[i][j] = s.charAt(j);
                    switch(map[i][j]){
                        case '^': case 'v': case '<': case '>':
                        x=i;
                        y=j;
                        break;
                    }

                }
            }
            
            int commandN = Integer.parseInt(bf.readLine());
            String commandStr = bf.readLine();

            int next = 0;
			int nx = 0;
			int ny = 0;
			int d = state(map[x][y]);

            for(int i = 0; i < commandN; i++){
                char cmd = commandStr.charAt(i);

                switch(cmd){
                    case 'U': {
                        d = 0;
                        map[x][y] = '^';
                        int hx = x + dx[0];
                        int hy = y + dy[0];
    
                        if (rangeIn(hx, hy, map) && map[hx][hy] == '.') {
                            map[hx][hy] = '^';
                            map[x][y] = '.';
                            x = hx;
                            y = hy;
                        }
    
                        break;
                    }
                    case 'D': {
                        d = 1;
                        map[x][y] = 'v';
                        int hx = x + dx[1];
                        int hy = y + dy[1];
    
                        if (rangeIn(hx, hy, map) && map[hx][hy] == '.') {
                            map[hx][hy] = 'v';
                            map[x][y] = '.';
                            x = hx;
                            y = hy;
                        }
                        break;
                    }
                    case 'L': {
                        d = 2;
                        map[x][y] = '<';
                        int hx = x + dx[2];
                        int hy = y + dy[2];
    
                        if (rangeIn(hx, hy, map) && map[hx][hy] == '.') {
                            map[hx][hy] = '<';
                            map[x][y] = '.';
                            x = hx;
                            y = hy;
                        }
                        break;
                    }
                    case 'R': {
                        d = 3;
                        map[x][y] = '>';
                        int hx = x + dx[3];
                        int hy = y + dy[3];
    
                        if (rangeIn(hx, hy, map) && map[hx][hy] == '.') {
                            map[hx][hy] = '>';
                            map[x][y] = '.';
                            x = hx;
                            y = hy;
                        }
                        break;
                    }
                    case 'S': {
                        int sx = x;
                        int sy = y;
    
                        while (rangeIn(sx, sy, map)) {
                            sx += dx[d];
                            sy += dy[d];
                            if (rangeIn(sx, sy, map)) {
                                next = map[sx][sy];
                                if (next == '*') {
                                    map[sx][sy] = '.';
                                    break;
                                } else if (next == '#') {
                                    break;
                                } else if (next == '.' || next == '-') {
                                    continue;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    default: {
                        break;
                    }
                    
                }
            }
            sb.append("#").append(t).append(" ");
			for (int i = 0; i < map.length; i++) {
				for (int j = 0; j < map[i].length; j++) {
					sb.append(map[i][j]);
				}
				sb.append("\n");
			}
        }
        System.out.println(sb);
    }

    static int state(char c) {
		if (c == '^') {
			return 0;
		} else if (c == 'v') {
			return 1;
		} else if (c == '<') {
			return 2;
		} else if (c == '>') {
			return 3;
		}
		return -1;
	}

	static boolean rangeIn(int x, int y, char[][] map) {
		if (x >= 0 && x < map.length && y >= 0 && y < map[x].length) {
			return true;
		} else
			return false;
	}
}
