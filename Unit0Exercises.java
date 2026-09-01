public class Unit0Exercises{

    public static void main(String[] args) {
        System.out.println("--- Variable Snapshot ---");
        int score = 85;
        double price = 19.99;
        boolean isPassing = true;
        System.out.println("Score: " + score);
        System.out.println("Price: " + price);
        System.out.println("Passing: " + isPassing);
        System.out.println("--- After Updates ---");
        score = 90;
        price = 22.49;
        isPassing = false;
        System.out.println("Score: " + score);
        System.out.println("Price: " + price);
        System.out.println("Passing: " + isPassing);
    }

}