// 학생 이름 구하기 yse or no & 학생 이름 검색하기
// package algo_;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class no_1 {
//
//    import java.util.ArrayList;
//import java.util.Scanner;
//
//    public class Main {
//        public static void main(String[] args) {
//
//            algo_.Student st1 = new algo_.Student("손오공", "12123");
//            algo_.Student st2 = new algo_.Student("저팔계", "28461");
//            algo_.Student st3 = new algo_.Student("사오정", "30416");
//
//            ArrayList<algo_.Student> list = new ArrayList<>();
//
//            list.add(st1);
//            list.add(st2);
//            list.add(st3);
//
//            System.out.println("검색을 하시겠습니까?Y or N");
//            Scanner sc = new Scanner(System.in);
//
//            while(true){
//                System.out.println("계속 검색을 원하십니까?");
//                String input = sc.next();
//
//                if(input.equals("y")){
//                    System.out.println("학생 이름을 입력하시오");
//                    System.out.println("검색을 시작합니다.");
//                    String name = sc.next();
//                    for(algo_.Student stu:list){
//                        if(stu.getName().equals(name)){
//                            System.out.println("해당 학생의 학번은: "+stu.getNo());
//                        }
//                    }
//                }
//                else if(input.equals("n")){
//                    break;
//                }
//            }
//            System.out.println("검색을 종료합니다.");
//        }
//
//    }
//
//}
