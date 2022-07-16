//import java.util.Scanner;
//
//// 음계 오름차순 내림차순 뽑아서 결과출력하기
//public class Main {
//
//    public static void distinct(int[] arr) {
//
//        boolean aFlag = true;
//        boolean bFlag = true;
//
//        if(arr[0] != 1){
//            aFlag = false;
//        }
//        for(int i =1; i<arr.length; i++){
//            if(arr[i] - arr[i-1] != 1){
//                aFlag = false;
//            }
//        }
//        if(arr[0] != 8){
//            bFlag = false;
//        }
//        for(int i =1; i<arr.length; i++){
//            if(arr[i] - arr[i-1] != -1){
//                bFlag = false;
//            }
//        }
//
//        if(aFlag){
//            System.out.println("오름차순!");
//        } else if (bFlag) {
//            System.out.println("내림차순!");
//        }else {
//            System.out.println("믹스");
//        }
//
//    }
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        int [] arr = new int [8];
//
//        for(int i =0; i<arr.length; i++){
//            arr[i] = sc.nextInt();
//        }
//        distinct(arr);
//
//    }
//}
