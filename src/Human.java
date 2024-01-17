//메인메소드가 포함된 파일이 아니라면 static 안붙이고 메소드 만들 수 있음
public class Human {
    int age = 20;
    String name = "고라니";
    double heigth = 180.3;
    String gender = "여자";

    public void display() {
        System.out.println("나이: " + age);
        System.out.println("이름: " + name);
        System.out.println("키: " + heigth);
        System.out.println("성별: " + gender);
    }
    public void walk() {
        System.out.println("사람이 걷는다");
    }
    public void run() {
        System.out.println("사람이 뛴다");
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", heigth=" + heigth +
                ", gender='" + gender + '\'' +
                '}';
    }
}
