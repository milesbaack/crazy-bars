package com.crazybars.crazybars;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

import javafx.scene.shape.Line;

// Import JavaFX into Intellij via manual download
// Can change code to import intellij via code just search online if that's easier for you


public class CrazyBars extends Application {

    // Stores the rectangles calls it Bars
    private Rect[] Bars = new Rect[11];

    // The area where everything will be drawn
    private Pane pane = new Pane();

    // Size of each grid square
    private final int CELL_SIZE = 50;

    private MediaPlayer soundPlayer;

    @Override
    public void start(Stage stage) {
        Initialize();

        DrawBars();
        DrawGrid();

        Media sound = new Media(getClass().getResource("/sounds/crazy-frog.mp3").toExternalForm());
        soundPlayer = new MediaPlayer(sound);
        soundPlayer.setStopTime(Duration.seconds(5));

        // Create redraw button
        Button redrawButton = new Button("Redraw");
        // When button clicked: call DrawBars() to update bar heights/colors, and play the sound
        redrawButton.setOnAction(e -> {
            DrawBars();
            soundPlayer.stop();
            soundPlayer.play();
        });

        HBox buttonBox = new HBox(redrawButton);
        buttonBox.setAlignment(Pos.CENTER);
        buttonBox.setPadding(new Insets(10));

        BorderPane root = new BorderPane();
        root.setCenter(pane);
        root.setBottom(buttonBox);

        Scene scene = new Scene(root, 550, 600);

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

            int startY = i * CELL_SIZE;
            Line myRow = new Line(0, startY, 550, startY);
            pane.getChildren().add(myRow);

        }
        //Draw 11 Columns
        for (int i = 0; i <= 10; i++) {
            // create Line
            // set start/end coordinates
            // add line to pane
            int startX = i * CELL_SIZE;
            Line myColumn = new Line(startX, 0, startX, 550);
            pane.getChildren().add(myColumn);
        }

    }

    // FUNCTION: Manipulate each of the 10 bars Y Size to random integer, and assign the bar a new random color.
    private void DrawBars() {
        for (int i = 0; i < 11; i++) {

             //generate random height from 1-10
            int randomHeight = (int) (Math.random() * 10) + 1;
             //convert height into pixels
            double heightInPixels = randomHeight * CELL_SIZE;
             //change Bars[i] height
            Bars[i].setHeight(heightInPixels);
             //change Bars[i] Y position
            Bars[i].setY(500 - heightInPixels);

             //generate random color
            Color randomColor = Color.color(
                    Math.random(),
                    Math.random(),
                    Math.random()
            );
             //change Bars[i] color
            Bars[i].setColor(randomColor);
        }
  }

    //FUNCTION: Create 10 bars with correct X positional data, a standard size, then store into Bars Array.
    private void Initialize(){
        for (int i = 0; i < 11; i++) {
            Bars[i] = new Rect();

            // Set X position based on i
            Bars[i].setX(i * CELL_SIZE);
            // Set starting Y position
            Bars[i].setY(500);
            // Set starting width
            Bars[i].setWidth(CELL_SIZE);
            // Set starting height
            Bars[i].setHeight(0);
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



