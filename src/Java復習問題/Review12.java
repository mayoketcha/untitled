package Java復習問題;

public class Review12 {
    public static void main(String[] args) {
        int age = 12;
        if (0 <= age && age <= 17) {
            System.out.print("未成年");
        } else if (18 <= age && age <= 64) {
            System.out.print("成人");
        } else if (age >= 65) {
            System.out.print("高齢者");
        } else {
            System.out.print("無効な年齢です。");
        }
    }
}
