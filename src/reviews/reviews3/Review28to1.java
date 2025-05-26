package reviews.reviews3;

import java.io.*;

public class Review28to1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("宛先を入力>");
        String to = br.readLine();
        System.out.print("件名を入力>");
        String subject = br.readLine();
        System.out.print("本文を入力>");
        String body = br.readLine();
        Review28to2 review = new Review28to2();
        if (subject.isEmpty()) {
            review.send(to, body);
        } else  {
            review.send(to, subject, body);
        }
    }
}
