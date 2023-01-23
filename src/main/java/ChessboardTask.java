import java.util.Scanner;

public class ChessboardTask implements Task {

    public void run() {
        Scanner sc = new Scanner(System.in);
        int width = sc. nextInt();
        Chessboard chessboard = new Chessboard(width, 8);
        System.out.println(chessboard.toString()); //strokove predstavlenna objectu
    }
}
