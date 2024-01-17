import java.util.Scanner;

public class ClassMain2 {
    public static void main(String[] args) {
        Monster m1 = new Monster();
        Scanner scan = new Scanner(System.in);

        m1.age = scan.nextInt();
        m1.heigth = scan.nextInt();
        m1.gender = scan.nextLine();

        System.out.println(m1.toString());
    }
}
