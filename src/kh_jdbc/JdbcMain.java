package kh_jdbc;

import kh_jdbc.dao.EmpDao;
import kh_jdbc.vo.EmpVo;

import java.util.Scanner;
import java.util.List;

public class JdbcMain {
    public static void main(String[] args) {
        menuList();
    }
    public static void menuList() {
        Scanner sc = new Scanner(System.in);
        EmpDao dao = new EmpDao();

        while(true) {
            System.out.println("=".repeat(5) + "EMP TABLE" + "=".repeat(5));
            System.out.print("메뉴는 선택하세요 : [1]SELECT, [2]INSERT, [3]UPDATE, [4]DELETE, [5]QUIT : ");
            int sel = sc.nextInt();
            switch (sel) {
                case 1 :
                    List<EmpVo> list = dao.empSelect();
                    dao.empSelectPrint(list);
                    break;
                case 2 :
                    dao.empInsert();
                    break;
                case 3 :
                case 4 :
                case 5 :
                    System.out.println("메뉴를 종료 합니다.");
                    return;
            }
        }
    }
}
