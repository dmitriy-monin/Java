package GeekBrains.Homework.Seminar_6;

public class Wave {

        public static void main(String[] args) {
            int[][] pole = new int[10][10];
            boolean stop;
            int dx[] = {1,0,-1,0};
            int dy[] = {0,1,0,-1};
            int d = 0;
            for(int ts=0; ts<10; ts++){
                for(int ts2=0; ts2<10; ts2++){
                    pole[ts][ts2]=-2;
                    pole[0][ts2]=-1;
                    pole[9][ts2]=-1;
                }
                pole[ts][0]=-1;
                pole[ts][9]=-1;
            }
            pole[1][1]=0;
            do{
                stop=true;
                for(int y = 0; y<10;++y)
                    for(int x = 0; x<10;++x)
                        if (pole[y][x]==d)
                        {
                            for (int k = 0; k<4; k++)
                                if (pole[y+dy[k]][x+dx[k]]==-2){
                                    stop=false;
                                    pole[y+dy[k]][x+dx[k]] = d+1;
                                }
                        }
                d++;
            }
            while (!stop && pole[8][8]==-2);
            for(int ts=0; ts<10; ts++){
                for(int ts2=0; ts2<10; ts2++)
                    System.out.print(pole[ts2][ts]);
                System.out.println();
            }
        }
}
