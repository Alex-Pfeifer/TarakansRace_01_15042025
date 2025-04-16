import java.util.Scanner;

public class Play {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter number of Tarakan: ");
        int numerOfTarakans = scanner.nextInt();

        System.out.print("Please enter a distance: ");
        int distance = scanner.nextInt();


        for (int i = 1; i <= numerOfTarakans; i++) {
            new Thread(new TarakansRace.Tarakan(i, distance)).start();
        }
    }
}
