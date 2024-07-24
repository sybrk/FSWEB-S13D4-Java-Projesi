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
        return Math.sqrt(((_x - x) * (_x - x) + (_y - y) * (_y - y)));
    }
    public double distance() {
        return distance(0, 0);
    }

    public double distance(Point p) {
        return distance(p.x, p.y);
    }
}
