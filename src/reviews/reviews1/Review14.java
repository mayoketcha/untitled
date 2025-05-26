package reviews.reviews1;

public class Review14 {
    public static void main(String[] args) {
        String color = "赤";
        if (color == "赤") {
            System.out.print("停止");
        } else if (color == "黄") {
            System.out.print("注意");
        } else if (color == "青") {
            System.out.print("進行");
        } else {
            System.out.print("無効な信号の色です。");
        }
    }
}
