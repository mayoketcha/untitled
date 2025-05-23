package reviews.reviews2;

public class Review17 {
    public static void main(String[] args) {
        int num = 17;
        int sum = 0 ;
        for (int i = 1; i <= num; i++){
            if (i % 2 == 0){
                sum = sum + i;
            }
        }
        System.out.print("結果: " + sum);
    }
}
