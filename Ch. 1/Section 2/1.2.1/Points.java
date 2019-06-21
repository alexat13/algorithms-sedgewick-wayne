import java.lang.Math;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.StdRandom;

class Points {

    static int N = 10; //Number of points

    public static void findShortestDist(Point2D[] points) {

        Point2D point1 = new Point2D(0, 0);
        Point2D point2 = new Point2D(0, 0);

        double distance;
        double shortestDistance = Double.MAX_VALUE;
        int c = 0;

        int count = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 1 + c; j < N; j++) {

                distance = points[i].distanceTo(points[j]);

                if (distance < shortestDistance) {
                    shortestDistance = distance;
                    point1 = points[i];
                    point2 = points[j];
                }

            }
            c++;
        }

        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.point(point1.x(), point1.y());
        StdDraw.point(point2.x(), point2.y());
        StdDraw.setPenRadius(.002);
        StdDraw.line(point1.x(), point1.y(), point2.x(), point2.y());

        System.out.println("count: " + count);

    }



    public static void main(String[] args) {

        StdDraw.setCanvasSize(500, 500);
        StdDraw.setPenRadius(.015);
        StdDraw.setXscale(0, 1);
        StdDraw.setYscale(0, 1);
        StdDraw.setPenColor(StdDraw.BLUE);

        Point2D[] points = new Point2D[N];

        for (int i = 0; i < N; i++) {

            double xCorrdinate = StdRandom.uniform();
            double yCoordinate = StdRandom.uniform();

            points[i] = new Point2D(xCorrdinate, yCoordinate);

            StdDraw.point(points[i].x(), points[i].y());

        }

        findShortestDist(points);

    }
}