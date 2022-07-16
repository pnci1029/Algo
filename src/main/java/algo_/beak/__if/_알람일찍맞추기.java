//import java.util.Scanner;
//
//// 알람 45분 일찍맞추기
//public class Main {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        int hour = sc.nextInt();
//        int min = sc.nextInt();
//
//        if(min>45 ){
//            System.out.printf("hour: %3d, min: %3d", hour,min-45);
//        }else if(min<45){
//            if(hour==0){
//                System.out.printf("hour: %3d, min: %3d", 23,60-(45-min)); // 2시 44분일때 1시 59분
//            }else{
//                System.out.printf("hour: %3d, min: %3d", hour-1,60-(45-min));
//            }
//        }
//
//    }
//}
