//// 거꾸로 읽고 큰수구하기
//public class Main {
//    public static void main(String[] args) {
//
//        int inputNumb1 = 734;
//        int inputNumb2 = 893;
//        int result1 = 0;
//        int result2 = 0;
//
//        int [] arr1 = new int [3];
//        int [] arr2 = new int [3];
//
//        int i =0;
//        do{
//            arr1[i]= inputNumb1 %10;
//            arr2[i] = inputNumb2%10;
//            inputNumb1 /=10;
//            inputNumb2 /=10;
//            i++;
//        }while(inputNumb1 >0 && inputNumb2>0);
//
//        for(int j = 0; j<arr1.length; j++){
//            result1 *= 10;
//            result1 += arr1[j];
//        }
//        for(int j = 0; j<arr2.length; j++){
//            result2 *= 10;
//            result2 += arr2[j];
//        }
//
//        System.out.println(result1+"   "+result2);
//
//    }
//}
