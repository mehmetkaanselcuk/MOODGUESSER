import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Let's guess your mood today.");
        System.out.print("Can you tell me how long you slept?");
        int sleep = sc.nextInt();
        sc.nextLine();
        System.out.print("Did you drink coffee? (yes or no): ");
        String coffee = sc.nextLine().toLowerCase();
        System.out.print("How did your day start? (happy, tired or stressed): ");
        String start = sc.nextLine().toLowerCase();
        String mood;
        if (sleep >= 7 && coffee.equals("yes") && start.equals("happy")) {
            mood = "You're feeling great!";
        } else if (sleep < 5 || start.equals("stressed")) {
            mood = "It seems like today won’t be the easiest.";
        } else if (coffee.equals("no")) {
            mood = "Maybe some coffee would help.";
        } else {
            mood = "Today might have its ups and downs, but you’ve got this.";
        }
        System.out.println("\nMood guess: " + mood);
    }
}