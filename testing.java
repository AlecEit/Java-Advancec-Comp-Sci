public class testing{
    public static void main(String[] args) {
        int a = 938;
        int full = a % 100;
        int answer = full - (a % 10);
        System.out.println(answer);
    }
}