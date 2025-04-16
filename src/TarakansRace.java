import java.util.Random;
import java.util.Scanner;

public class TarakansRace {

    static class Tarakan implements Runnable {

        private static volatile boolean raceOver = false;
        private final int tarakanNumber;
        private final int distance;
        private static final int MIN_SLEEP = 2;
        private static final int MAX_SLEEP = 5;
        private final Random random = new Random();

        public Tarakan(int tarakanNumber, int distance) {
            this.tarakanNumber = tarakanNumber;
            this.distance = distance;
        }

        public void run() {
            for (int i = 0; i < distance; i++) {
                if (raceOver) return;

                System.out.println("Taracen number " + tarakanNumber + " was a round " + (i + 1));

                try {
                    Thread.sleep(MIN_SLEEP + random.nextInt(MAX_SLEEP - MIN_SLEEP + 1));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            if (!raceOver) {
                raceOver = true;
                System.out.println("Congratulations to tarakan #" + tarakanNumber + " (winner)");
            }
        }

//        public static void main(String[] args) {
//            Scanner scanner = new Scanner(System.in);
//
//            System.out.print("Please enter number of Tarakan: ");
//            int numerOfTarakans = scanner.nextInt();
//
//            System.out.print("Please enter a distance: ");
//            int distance = scanner.nextInt();
//
//
//            for (int i = 1; i <= numerOfTarakans; i++) {
//                new Thread(new Tarakan(i, distance)).start();
//            }
//        }



    }
}
