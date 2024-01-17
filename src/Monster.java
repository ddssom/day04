import java.util.Scanner;

public class Monster {
    int age = 30;
    double heigth = 150.6;
    String gender = "여자";

    public void display() {
        System.out.println("나이 : " + age);
        System.out.println("키 : "  + heigth);
        System.out.println("성별 : " + gender);
    }
//    public void attack() {
//        System.out.println("몬스터가 공격한다");


    @Override
    public String toString() {
        return "Monster{" +
                "age=" + age +
                ", heigth=" + heigth +
                ", gender='" + gender + '\'' +
                '}';
    }
}
}
}
