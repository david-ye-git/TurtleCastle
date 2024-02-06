import java.util.List;

public class Medieval {
    
    private static int DEFAULT_WORLD_HEIGHT = 370;
    private static int DEFAULT_WORLD_WIDTH = 610;
    private static final double CIRCLE_RADIUS = 360;
    private static final TurtleWorld MEDIEVAL_WORLD =
        new TurtleWorld(DEFAULT_WORLD_WIDTH, DEFAULT_WORLD_HEIGHT, true);
    
    public static TurtleWorld getMedievalWorld () {
        return MEDIEVAL_WORLD;
    }
    
    public static void drawTown (Turtle turtle) {

        int[][] starCoordinates = new int[][]{
            {40, 50}, {80, 90}, {40, 130}, {10, 210},
            {80, 250}, {30, 380}, {90, 440}, {40, 520}
        };

        drawStars(turtle, starCoordinates);

        int[][] hillCoordinates = new int[][]{
            {200, 0}, {160, 180}, {180, 390}
        };

        drawMountains(turtle, hillCoordinates);
    }
    
    private static void drawStars (Turtle turtle, int[][] coordinates) {
        for (int[] coordinate : coordinates) {
            turtle.teleport(coordinate[1], coordinate[0]);
            double turnDegrees = CIRCLE_RADIUS / 8;
            for (int i = 0; i < 8; i++) {
                double rayLength = ((i % 2) == 0) ? 10 : 9;
                turtle.forward(rayLength);
                turtle.backward(rayLength);
                turtle.right(turnDegrees);
            }
        }
    }
    
    private static void drawMountains (Turtle turtle, int[][] coordinates) {
        for (int[] coordinate : coordinates) {
            double base = 160;
            double perpendicular = 80;
            double hypotenuse = Math.hypot(base, perpendicular);
            double turnDegrees = Math.toDegrees(Math.tan(perpendicular / base));

            turtle.teleport(coordinate[1], coordinate[0]);
            turtle.left(turnDegrees);
            turtle.forward(hypotenuse);
            turtle.right(turnDegrees);

            base = 140;
            perpendicular = 60;
            hypotenuse = Math.hypot(base, perpendicular);
            turnDegrees = 90 - Math.toDegrees(Math.tan(perpendicular / base));

            turtle.right(turnDegrees);
            turtle.forward(hypotenuse);
        }
    }

    private static void drawTower () {
        
    }
    
    private static void drawTree () {
        
    }
    
    private static void drawWall () {
        
    }
    
    private static void drawArch () {
        
    }
}
