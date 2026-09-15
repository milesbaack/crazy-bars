CRAZYBARS DOCUMENTATION
Program Flow:
Program Starts -> Initialize() -> Create 10 Rect Objects -> Add them to Pane - > DrawGrid() ->
DrawBars() - > User Clicks Redraw - > DrawBars() -> Changes existing Rect Objects
start()
Calls Initialize, DrawGrid, DrawBars, Makes redraw button with event and creates Scene.
Start calls DrawBars once so that the game starts off with 10 already random bars
Initialize()
Initialize the board and create 10 Rect Objects with starting positional data
DrawGrid()
Draw the background lines
DrawBars()
Manipulates the Y Values of each Rect Object and their color to a random value
Class Rect{}
Class for the Rect object for easy OOP manipulation of each Rect object that is used by
DrawBars without directly managing every JavaFX Rectangle property.
ACTION DELIVERABLES:
TEAM MEMBER 1 - Grid + Window Setup: Create the JavaFX window, Pane, Scene, and
draw the 10×10 grid with the 11 horizontal and 11 vertical boundary/grid lines.
TEAM MEMBER 2 - Bar Objects + Randomization: Build the Rect class, create/store the 10
bars in the Rect[] Bars array, and implement DrawBars() so each bar gets a random height and
random color.
TEAM MEMBER 3 - Redraw Button + User Interaction: Create the redraw button, connect its
click event, and make it call DrawBars() so the existing bars update to new heights and colors.
