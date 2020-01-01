import com.sun.xml.internal.ws.encoding.soap.SOAP12Constants;

import java.util.ArrayList;
import java.util.Scanner;

public class Algorithm_2_Student {
    /*
        �л� �������� �����ϰ�, �л��̸����� �˻����� �� �й��� ����ϴ� ���α׷� �ۼ�

        Student Ŭ���� ����
        name, no(�̸��� �й�)

        �л����� ArrayList�� ������ ���� ��� �˻��ϰڴ��� y -> �ݺ�
        �����ϰ� ������ n  -> ���α׷� ����

        �л� �̸��� �ִ� ��� �� �л��� �й��� ���
        �л� �̸��� ������, ���� �л��̸��̶�� ���
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

        students.add(new Student("�̺���", "870422"));
        students.add(new Student("�ѾƸ�", "871009"));

        while(true) {
            System.out.print("��� �˻��ϰ� ������ y, �����ϰ� ������ n");
            Scanner sc = new Scanner(System.in);
            String flag = sc.next();

            if(flag.equals("y")){
                System.out.print("�л� �̸��� �Է����ּ���");
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
                    System.out.printf("�й� : %s", student.no);
                    System.out.println("");
                }else {
                    System.out.println("���� �л��Դϴ�.");
                }

            }else{
                System.out.print("���α׷�����");
                break;
            }
        }

    }

}
