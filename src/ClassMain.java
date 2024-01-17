public class ClassMain {
    public static void main(String[] args) {
        // 클래스이름 객체명 = new 생성자;
        Human h1 = new Human();
        h1.age = 20;
        h1.gender = "여자";
        h1.heigth = 180.3;
        h1.name = "고라니";

//        h1.display();

        h1.walk();
        h1.run();
        System.out.println(h1.toString());


    }
}
