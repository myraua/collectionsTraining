public class Chessboard {

    private int width; //primitive data type  /Integer wrapper class
    private int height;

    public Chessboard(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                if ((i + j) % 2 != 0) {
                    sb.append("*");
                } else {
                    sb.append(" ");
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
