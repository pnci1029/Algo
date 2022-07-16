//import java.lang.reflect.Array;
//import java.util.ArrayList;
//
//// 최빈수 구하기
//public class Main {
//    public static void main(String[] args) {
//        // 1 2 2 3 1 4 2 2 4 3 5 4 2
//
//        int[] arr = {1, 2, 2, 3, 1, 4, 2, 2, 4, 3, 5, 4, 2};
//        int count1 = 0;
//        int count2 = 0;
//        int count3 = 0;
//        int count4 = 0;
//        int count5 = 0;
//
//        for(int i = 0; i <arr.length; i++){
//            if(arr[i] ==1){
//                count1 += 1;
//            } else if(arr[i] ==2){
//                count2 += 1;
//            }
//            else if(arr[i] ==3){
//                count3 += 1;
//            }
//            else if(arr[i] ==4){
//                count4 += 1;
//            }
//            else if(arr[i] ==5){
//                count5 += 1;
//            }
//        }
//
//        int[] count = {0,count1, count2, count3, count4, count5};
//        int max = 0;
//        int countNum = 0;
//        for(int j = 1; j <count.length; j++){
//            if(max <count[j]){
//                max = count[j];
//                countNum = j;
//            }
//        }
//        System.out.println(max+""+countNum);
//    }
//}
