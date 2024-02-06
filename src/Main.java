import java.util.Arrays;

public class Main {
    private static final double CIRCLE_RADIUS = 360;
    public static void main (String[] args) {
//        Turtle turtle = new Turtle();
        Turtle turtle = new Turtle(Medieval.getMedievalWorld());

        // Problem 2
        Medieval.drawTown(turtle);

        
        // Problem 3
//        polyspiral(turtle, 3, 20, 5);
//        polyspiral(turtle, 5, 10, 4);
//        polyspiral(turtle, 8, 5, 3);
        
        // Problem 4
//        polywheel(turtle, 3, 70);
//        polywheel(turtle, 4, 50);
//        polywheel(turtle, 5, 40);
//        polywheel(turtle, 6, 30);
//        polywheel(turtle, 12, 15);
        
        // Problem 5
//        multistar(turtle, 7, 100);
//        multistar(turtle, 10, 70);
//        multistar(turtle, 25, 120);

        // Problem 6
//        pyramid(turtle, 200, 5);
//        pyramid(turtle, 200, 10);
//        pyramid(turtle, 300, 10);
    }

    private static void polyspiral (Turtle turtle, int n, double base, int rounds) {
        double turnDegree = CIRCLE_RADIUS / n;
        double incrementedBase = base;
        for (int i = 0; i < rounds; i ++) {
            for (int j = 0; j < n; j ++) {
                turtle.forward(incrementedBase);
                turtle.right(turnDegree);
                incrementedBase = incrementedBase + (base / 2);
            }
        }
    }
    
    private static void polywheel (Turtle turtle, int numSides, double length) {
        double turnDegree = CIRCLE_RADIUS / numSides;
        for (int k = 0; k < numSides; k ++) {
            for (int i = 0; i < numSides; i++) {
                turtle.forward(length);
                turtle.left(turnDegree);
            }
            turtle.forward(length);
            turtle.right(turnDegree);
        }
    }
    
    private static void multistar (Turtle turtle, int n, double length) {
        double turnDegree = CIRCLE_RADIUS / n;
        double shortRayLength = length / 4;
        for (int i = 0; i < n; i ++) {
            turtle.forward(length);
            for (int k = 0; k < n; k ++) {
                turtle.forward(shortRayLength);
                turtle.backward(shortRayLength);
                turtle.right(turnDegree);
            }
            turtle.backward(length);
            turtle.right(turnDegree);
        }
    }
    
    private static void pyramid (Turtle turtle, double base, int levels) {
        double blocksToCreate = (levels * 2) - (double) 1;
        double sideLength = base / (levels * 2) - 1;
        for (int j = levels; j > 0; j--) {
            turtle.left(90);
            turtle.forward(sideLength);
            turtle.right(90);
            for (int i = 0; i < blocksToCreate; i++) {
                createPyramidBlocks(turtle, sideLength);
                turtle.forward(sideLength);
            }
            turtle.backward((sideLength * ((j - 1) * 2)));
            blocksToCreate = blocksToCreate - 2;
        }
    }
    
    private static void createPyramidBlocks (Turtle turtle, double length) {
        for (int i = 0; i < 4; i ++) {
            turtle.forward(length);
            turtle.right(90);
        }
    }
}


