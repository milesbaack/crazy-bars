import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
// Import JavaFX into Intellij via manual download
// Can change code to import intellij via code just search online if that's easier for you

import java.util.Random;

public class CrazyBars extends Application {

    // Stores the rectangles calls it Bars
    private Rect[] Bars = new Rect[10];

    // The area where everything will be drawn
    private Pane pane = new Pane();

    // Size of each grid square
    private final int CELL_SIZE = 50;

    @Override
    public void start(Stage stage) {
        Initialize();

        // Create redraw button
        // When button clicked:
        // DrawBars();

        DrawGrid();

        // Give Bars[] random values
        DrawBars();

        Scene scene = new Scene(pane, 550, 550);

        stage.setTitle("Crazy Bars");
        stage.setScene(scene);
        stage.show();
    }

    // FUNCTION: Draw grid when called.
    // Draw 11 Horizontal (Row) lines 0-10 | 0 is top boundary line, 10 is bottom boundary line
    // Draw 11 Vertical (Column) lines 0-10 | 0 is left boundary line, 10 is right boundary line
    // NOTE: FOR ROWS AND COLUMNS, THERE IS A TOTAL OF 11 LINES BECAUSE OF BOUNDARY!
    // JAVA INDEXES AT 0
    private void DrawGrid() {
        // Draw 11 Rows
        // Note its i<=10 instead of i < 10 since we want 11 lines, might be cleaner to do i<11 but personal preference
        for (int i = 0; i <= 10; i++) {
            // create Line
            // set start/end coordinates
            // add line to pane
        }
        //Draw 11 Columns
        for (int i = 0; i <= 10; i++) {
            // create Line
            // set start/end coordinates
            // add line to pane
        }

    }

    // FUNCTION: Manipulate each of the 10 bars Y Size to random integer, and assign the bar a new random color.
    private void DrawBars() {
        for (int i = 0; i < 10; i++) {

            // generate random height from 1-10

            // convert height into pixels

            // change Bars[i] height

            // change Bars[i] Y position
            // Y = bottom of graph - height

            // generate random color

            // change Bars[i] color
        }
    }

    //FUNCTION: Create 10 bars with correct X positional data, a standard size, then store into Bars Array.
    private void Initialize(){
        for (int i = 0; i < 10; i++) {
            Bars[i] = new Rect();

            // Set X position based on i

            // Set starting Y position

            // Set starting width

            // Set starting height

            // Add actual Rectangle to pane:
            pane.getChildren().add(
                    Bars[i].getRectangle()
            );

            //Please look at Rect Class
        }




    }

    public static void main(String[] args) {
        launch(args);


    }
}

class Rect {
    private Rectangle rectangle;

    public Rect() {
        rectangle = new Rectangle();
    }

    public void setX(double x) {
        rectangle.setX(x);
    }

    public void setY(double y) {
        rectangle.setY(y);
    }

    public double getX() {
        return rectangle.getX();
    }

    public double getY() {
        return rectangle.getY();
    }

    public void setWidth(double width) {
        rectangle.setWidth(width);
    }

    public void setHeight(double height) {
        rectangle.setHeight(height);
    }

    public double getWidth() {
        return rectangle.getWidth();
    }

    public double getHeight() {
        return rectangle.getHeight();
    }

    public Rectangle getRectangle() {
        return rectangle;
    }

    public void setColor(Color color) {
        rectangle.setFill(color);
    }


}



