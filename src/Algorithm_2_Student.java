import com.sun.xml.internal.ws.encoding.soap.SOAP12Constants;

import java.util.ArrayList;
import java.util.Scanner;

public class Algorithm_2_Student {
    /*
        학생 정보들을 저장하고, 학생이름으로 검색했을 때 학번을 출력하는 프로그램 작성

        Student 클래스 생성
        name, no(이름과 학번)

        학생들을 ArrayList에 저장한 이후 계속 검색하겠느냐 y -> 반복
        종료하고 싶으면 n  -> 프로그램 종료

        학생 이름이 있는 경우 그 학생의 학번을 출력
        학생 이름이 없으면, 없는 학생이름이라고 출력
     */

    static class Student {
        private String name;
        private String no;

        public Student(String name, String no){
            this.name = name;
            this.no = no;
        }
    }
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("이복음", "870422"));
        students.add(new Student("한아름", "871009"));

        while(true) {
            System.out.print("계속 검색하고 싶으면 y, 종료하고 싶으면 n");
            Scanner sc = new Scanner(System.in);
            String flag = sc.next();

            if(flag.equals("y")){
                System.out.print("학생 이름을 입력해주세요");
                sc = new Scanner(System.in);
                String name = sc.next();
                Student student= null;
                for (Student s :students ) {
                    if (s.name.equals(name)) {
                        student = s;
                        break;
                    }
                }

                if(student != null){
                    System.out.printf("학번 : %s", student.no);
                    System.out.println("");
                }else {
                    System.out.println("없는 학생입니다.");
                }

            }else{
                System.out.print("프로그램종료");
                break;
            }
        }

    }

}
