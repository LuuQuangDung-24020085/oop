import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;

public class RandomWalk {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        StdDraw.setScale(-n - 0.5, n + 0.5);
        StdDraw.clear(StdDraw.GRAY);
        StdDraw.enableDoubleBuffering();

        int x = 0, y = 0;
        int steps = 0;
        int stepSize = 1;
        while (Math.abs(x) < n && Math.abs(y) < n) {
            // sang phải stepSize bước
            for (int i = 0; i < stepSize && Math.abs(x) < n && Math.abs(y) < n; i++) {
                StdDraw.setPenColor(StdDraw.WHITE);
                StdDraw.filledSquare(x, y, 0.45);
                StdDraw.show();
                StdDraw.pause(40);
                x++;
                steps++;
            }
            // lên stepSize bước
            for (int i = 0; i < stepSize && Math.abs(x) < n && Math.abs(y) < n; i++) {
                StdDraw.setPenColor(StdDraw.WHITE);
                StdDraw.filledSquare(x, y, 0.45);
                StdDraw.show();
                StdDraw.pause(40);
                y++;
                steps++;
            }
            stepSize++; // tăng bước

            // sang trái stepSize bước
            for (int i = 0; i < stepSize && Math.abs(x) < n && Math.abs(y) < n; i++) {
                StdDraw.setPenColor(StdDraw.WHITE);
                StdDraw.filledSquare(x, y, 0.45);
                StdDraw.show();
                StdDraw.pause(40);
                x--;
                steps++;
            }
            // xuống stepSize bước
            for (int i = 0; i < stepSize && Math.abs(x) < n && Math.abs(y) < n; i++) {
                StdDraw.setPenColor(StdDraw.WHITE);
                StdDraw.filledSquare(x, y, 0.45);
                StdDraw.show();
                StdDraw.pause(40);
                y--;
                steps++;
            }
            stepSize++;
        }
        StdOut.println("Total steps = " + steps);
    }

}