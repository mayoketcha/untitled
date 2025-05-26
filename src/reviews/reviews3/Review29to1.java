package reviews.reviews3;

public class Review29to1 {
    public static void main(String[] args) {
        Review29to2 review = new Review29to2();
        System.out.print("宛先を入力>");
        String to = review.readString();
        System.out.print("件名を入力>");
        String subject = review.readString();
        System.out.print("本文を入力>");
        String body = review.readString();
        System.out.println(to + "に以下のメールを送信しました。");
        System.out.println("件名: " + subject);
        System.out.println("本文: " + body);
    }
}
