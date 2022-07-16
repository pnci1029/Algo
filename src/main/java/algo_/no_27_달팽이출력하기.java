//// 달팽이 구하기
//public class Main {
//    public static void main(String[] args) {
//        int n = 5;
//        int len = n;
//        int[][] arr = new int[10][10];
//        int x = 0;
//        int y = 0;
//        int numb = 1;
//        int f = n;
//        /*
//            1  2  3  4  5
//            16 17 18 19 6
//            15 24 25 20 7
//            14 23 22 21 8
//            13 12 11 10 9
//         */
//
//        for(int i =0; i<n*2-1; i++){
//            switch(i%4){
//                case 0:  // right way
//                    for(int j =0; j<f; j++){
//                        arr[y][x] = numb ;
//                        numb++;
//                        x++;
//                    }
//                    y++;
//                    x--;
//                    f--;
//                    break;
//                case 1: // under way
//                    for(int j =0; j<f; j++){
//                        arr[y][x] = numb ;
//                        numb++;
//                        y++;
//                    }
//                    y--;
//                    x--;
//                    break;
//                case 2: // left way
//                    for(int j =0; j<f; j++){
//                        arr[y][x] = numb ;
//                        numb++;
//                        x--;
//                    }
//                    y--;
//                    x++;
//                    f--;
//                    break;
//                case 3: // upper way
//                    for(int j =0; j<f; j++){
//                        arr[y][x] = numb ;
//                        numb++;
//                        y--;
//                    }
//                    y++;
//                    x++;
//                    break;
//            }
//        }
//                for(int i =0; i<n; i++){
//                    for(int j =0; j<n; j++){
//                        System.out.printf("%3d",arr[i][j]);
//                    }
//                    System.out.println();
//                }
//
//
//    }
//}
