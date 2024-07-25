public class Point {
    private int x;
    private int y;

    public Point(int _x, int _y) {
        x = _x;
        y = _y;
    }
    public int getX () {
        return x;
    }

    public int getY () {
        return y;
    }
    public void setX(int _x) {
        x = _x;
    }
    public void setY(int _y) {
        y = _y;
    }

    public double distance(int _x, int _y) {
        int xDiff = _x - x;
        int yDiff = _y - y;
        double xPow = Math.pow(xDiff, 2);
        double yPow = Math.pow(yDiff, 2);
        return Math.sqrt(xPow + yPow);
    }
    public double distance() {
        return distance(0, 0);
    }

    public double distance(Point p) {
        return distance(p.getX(), p.getY());
    }
}
