import java.util.InputMismatchException;
import java.util.Scanner;

public class EnvelopesTask implements Task {
    Scanner sc = new Scanner(System.in);

    public void run() {
            do {
                int a = getSide("Please enter number for envelope 1 length");
                int b = getSide("Please enter number for envelope 1 height");
                int c = getSide("Please enter number for envelope 2 height");
                int d = getSide("Please enter number for envelope 2 height");
                Envelope e1 = new Envelope(a, b);
                Envelope e2 = new Envelope(c, d);
                int result = e1.compareTo(e2);
                if (result == 0)
                    System.out.println("Envelope one fits into envelope two");
                else {
                    System.out.println("Envelope one can't fit into envelope two");
                }
                System.out.println("Type Yes to continue");
            } while (sc.next().equalsIgnoreCase("Yes"));
            sc.close();
    }

    private int getSide(String s) {
        try {
            System.out.println(s);
           return sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Please try again and enter integer value next time");
        }
        System.exit(0);
        return 0;
    }
}

