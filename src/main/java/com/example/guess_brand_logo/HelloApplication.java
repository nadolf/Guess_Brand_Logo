package com.example.guess_brand_logo;

import javafx.application.Application;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.function.Predicate;

public class HelloApplication extends Application {
    private Stage Level1;
    private Scene scene1;
    private StackPane stackPane1;
    private Button button1;

    private Stage Level2;
    private Scene scene2;
    private StackPane stackPane2;
    private Button button2;

    private Stage Level3;
    private Scene scene3;
    private StackPane stackPane3;
    private Button button3;

    private Stage Level4;
    private Scene scene4;
    private StackPane stackPane4;
    private Button button4;

    private Stage Level5;
    private Scene scene5;
    private StackPane stackPane5;
    private Button button5;

    private Stage theEnd;
    private Scene scene6;
    private StackPane stackPane6;
    private Button button6;
    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("Guess The Brand Logo");
        stage.setScene(scene1);
        Level1 = levelOneStage();
        Level2 = levelTwoStage();
        Level3 = levelThreeStage();
        Level4 = levelFourStage();
        Level5 = levelFiveStage();
        theEnd= gameEnd();
        Level1.show();
    }
    private Stage levelOneStage() throws FileNotFoundException {
        Image logo1 = new Image(new FileInputStream("C:\\Users\\Nadolf\\Projects\\Guess_Brand_Logo\\src\\main\\java\\Logos\\mcdonalds-logo.png"));
        ImageView imageView = new ImageView(logo1);
        Level1 = new Stage(StageStyle.DECORATED);
        Level1.setTitle("Guess the Brand Logo");
        
        Label title=new Label("Level 1");
        title.setFont(new Font("Times New Roman", 25.0));

        TextField textBox = new CheckGuess(input -> input.matches("Mcdonalds") || input.matches("mcdonalds"));
        textBox.setText("Enter Guess");
        textBox.setFocusTraversable(false);
        textBox.setAlignment(Pos.CENTER);
        textBox.setMaxWidth(100.0);
        textBox.setMaxHeight(35.0);

        button1 = new Button("Check Answer");
        button1.disableProperty().bind(((CheckGuess) textBox).ifCorrect.not());
        button1.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                title.setTextFill(Color.GREEN);
                title.setText("Correct!");
                button1.setText("Next Level ->");
                button1.setOnAction(e -> Level2.show());
            }
        });

        stackPane1 = new StackPane(title,imageView,textBox,button1);
        stackPane1.setAlignment(title,Pos.TOP_CENTER);
        stackPane1.setAlignment(textBox,Pos.BOTTOM_CENTER);
        stackPane1.setAlignment(button1,Pos.BOTTOM_RIGHT);
        stackPane1.setMargin(title,new Insets(10));
        stackPane1.setMargin(textBox,new Insets(15));
        stackPane1.setMargin(button1,new Insets(15));
        stackPane1.setMinWidth(400);
        stackPane1.setMinHeight(400);
        stackPane1.setStyle("-fx-background-color: white");
        scene1 = new Scene(stackPane1);
        Level1.setScene(scene1);

        return Level1;
    }

    private Stage levelTwoStage() throws FileNotFoundException {
        Image logo2 = new Image(new FileInputStream("C:\\Users\\Nadolf\\Projects\\Guess_Brand_Logo\\src\\main\\java\\Logos\\snapchat-logo.png"));
        ImageView imageView = new ImageView(logo2);
        Level2 = new Stage(StageStyle.DECORATED);
        Level2.setTitle("Guess the Brand Logo");

        Label title=new Label("Level 2");
        title.setFont(new Font("Times New Roman", 25.0));

        TextField textBox = new CheckGuess(input -> input.matches("Snapchat") || input.matches("snapchat"));
        textBox.setText("Enter Guess");
        textBox.setFocusTraversable(false);
        textBox.setAlignment(Pos.CENTER);
        textBox.setMaxWidth(100.0);
        textBox.setMaxHeight(35.0);

        button2 = new Button("Check Answer");
        button2.disableProperty().bind(((CheckGuess) textBox).ifCorrect.not());
        button2.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                title.setTextFill(Color.GREEN);
                title.setText("Correct!");
                button2.setText("Next Level ->");
                button2.setOnAction(e -> Level3.show());
            }
        });

        stackPane2 = new StackPane(title,imageView,textBox,button2);
        stackPane2.setAlignment(title,Pos.TOP_CENTER);
        stackPane2.setAlignment(textBox,Pos.BOTTOM_CENTER);
        stackPane2.setAlignment(button2,Pos.BOTTOM_RIGHT);
        stackPane2.setMargin(title,new Insets(10));
        stackPane2.setMargin(textBox,new Insets(15));
        stackPane2.setMargin(button2,new Insets(15));
        stackPane2.setMinWidth(400);
        stackPane2.setMinHeight(400);
        stackPane2.setStyle("-fx-background-color: white");
        scene2 = new Scene(stackPane2);
        Level2.setScene(scene2);

        return Level2;
    }
    private Stage levelThreeStage() throws FileNotFoundException {
        Image logo3 = new Image(new FileInputStream("C:\\Users\\Nadolf\\Projects\\Guess_Brand_Logo\\src\\main\\java\\Logos\\pepsi-logo-symbol.png"));
        ImageView imageView = new ImageView(logo3);
        Level3 = new Stage(StageStyle.DECORATED);
        Level3.setTitle("Guess the Brand Logo");

        Label title=new Label("Level 3");
        title.setFont(new Font("Times New Roman", 25.0));

        TextField textBox = new CheckGuess(input -> input.matches("Pepsi") || input.matches("pepsi"));
        textBox.setText("Enter Guess");
        textBox.setFocusTraversable(false);
        textBox.setAlignment(Pos.CENTER);
        textBox.setMaxWidth(100.0);
        textBox.setMaxHeight(35.0);

        button3 = new Button("Check Answer");
        button3.disableProperty().bind(((CheckGuess) textBox).ifCorrect.not());
        button3.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                title.setTextFill(Color.GREEN);
                title.setText("Correct!");
                button3.setText("Next Level ->");
                button3.setOnAction(e -> Level4.show());
            }
        });
        stackPane3 = new StackPane(title,imageView,textBox,button3);
        stackPane3.setAlignment(title,Pos.TOP_CENTER);
        stackPane3.setAlignment(textBox,Pos.BOTTOM_CENTER);
        stackPane3.setAlignment(button3,Pos.BOTTOM_RIGHT);
        stackPane3.setMargin(title,new Insets(10));
        stackPane3.setMargin(textBox,new Insets(15));
        stackPane3.setMargin(button3,new Insets(15));
        stackPane3.setMinWidth(400);
        stackPane3.setMinHeight(400);
        stackPane3.setStyle("-fx-background-color: white");
        scene3 = new Scene(stackPane3);
        Level3.setScene(scene3);

        return Level3;
    }
    private Stage levelFourStage() throws FileNotFoundException {
        Image logo4 = new Image(new FileInputStream("C:\\Users\\Nadolf\\Projects\\Guess_Brand_Logo\\src\\main\\java\\Logos\\gucci-logo.png"));
        ImageView imageView = new ImageView(logo4);
        Level4 = new Stage(StageStyle.DECORATED);
        Level4.setTitle("Guess the Brand Logo");

        Label title=new Label("Level 4");
        title.setFont(new Font("Times New Roman", 25.0));

        TextField textBox = new CheckGuess(input -> input.matches("Gucci") || input.matches("gucci"));
        textBox.setText("Enter Guess");
        textBox.setFocusTraversable(false);
        textBox.setAlignment(Pos.CENTER);
        textBox.setMaxWidth(100.0);
        textBox.setMaxHeight(35.0);

        button4 = new Button("Check Answer");
        button4.disableProperty().bind(((CheckGuess) textBox).ifCorrect.not());
        button4.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                title.setTextFill(Color.GREEN);
                title.setText("Correct!");
                button4.setText("Next Level ->");
                button4.setOnAction(e -> Level5.show());
            }
        });
        stackPane4 = new StackPane(title,imageView,textBox,button4);
        stackPane4.setAlignment(title,Pos.TOP_CENTER);
        stackPane4.setAlignment(textBox,Pos.BOTTOM_CENTER);
        stackPane4.setAlignment(button4,Pos.BOTTOM_RIGHT);
        stackPane4.setMargin(title,new Insets(10));
        stackPane4.setMargin(textBox,new Insets(15));
        stackPane4.setMargin(button4,new Insets(15));
        stackPane4.setMinWidth(400);
        stackPane4.setMinHeight(400);
        stackPane4.setStyle("-fx-background-color: white");
        scene4 = new Scene(stackPane4);
        Level4.setScene(scene4);

        return Level4;
    }
    private Stage levelFiveStage() throws FileNotFoundException {
        Image logo5 = new Image(new FileInputStream("C:\\Users\\Nadolf\\Projects\\Guess_Brand_Logo\\src\\main\\java\\Logos\\android-logo.png"));
        ImageView imageView = new ImageView(logo5);
        Level5 = new Stage(StageStyle.DECORATED);
        Level5.setTitle("Guess the Brand Logo");

        Label title=new Label("Level 5");
        title.setFont(new Font("Times New Roman", 25.0));

        TextField textBox = new CheckGuess(input -> input.matches("Android") || input.matches("android"));
        textBox.setText("Enter Guess");
        textBox.setFocusTraversable(false);
        textBox.setAlignment(Pos.CENTER);
        textBox.setMaxWidth(100.0);
        textBox.setMaxHeight(35.0);

        button5 = new Button("Check Answer");
        button5.disableProperty().bind(((CheckGuess) textBox).ifCorrect.not());
        button5.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                title.setTextFill(Color.GREEN);
                title.setText("Correct!");
                button5.setText("Next Level ->");
                button5.setOnAction(e -> theEnd.show());
            }
        });
        stackPane5 = new StackPane(title,imageView,textBox,button5);
        stackPane5.setAlignment(title,Pos.TOP_CENTER);
        stackPane5.setAlignment(textBox,Pos.BOTTOM_CENTER);
        stackPane5.setAlignment(button5,Pos.BOTTOM_RIGHT);
        stackPane5.setMargin(title,new Insets(10));
        stackPane5.setMargin(textBox,new Insets(15));
        stackPane5.setMargin(button5,new Insets(15));
        stackPane5.setMinWidth(400);
        stackPane5.setMinHeight(400);
        stackPane5.setStyle("-fx-background-color: white");
        scene5 = new Scene(stackPane5);
        Level5.setScene(scene5);

        return Level5;
    }
    private Stage gameEnd() throws FileNotFoundException {
        Image logo6 = new Image(new FileInputStream("C:\\Users\\Nadolf\\Projects\\Guess_Brand_Logo\\src\\main\\java\\com\\example\\guess_brand_logo\\confetti.png"));
        ImageView imageView = new ImageView(logo6);
        theEnd = new Stage(StageStyle.DECORATED);
        theEnd.setTitle("Guess the Brand Logo");

        Label title=new Label("Congratulations, You've Finished All the Levels");
        title.setFont(new Font("Times New Roman", 25.0));

        button6 = new Button("Close");
        button6.setOnAction(e -> {Level1.close();Level2.close();Level3.close();Level4.close();Level5.close();theEnd.close();});

        stackPane6 = new StackPane(title,imageView,button6);
        stackPane6.setAlignment(title,Pos.CENTER);
        stackPane6.setAlignment(imageView,Pos.TOP_CENTER);
        stackPane6.setAlignment(button6,Pos.BOTTOM_CENTER);
        stackPane6.setMargin(title,new Insets(10));
        stackPane6.setMargin(button6,new Insets(15));
        stackPane6.setMinWidth(400);
        stackPane6.setMinHeight(400);
        stackPane6.setStyle("-fx-background-color: white");
        scene6 = new Scene(stackPane6);
        theEnd.setScene(scene6);

        return theEnd;
    }
    private static class CheckGuess extends TextField {
        private final Predicate<String> answer;
        private BooleanProperty ifCorrect = new SimpleBooleanProperty();

        CheckGuess(Predicate<String> answer) {
            this.answer = answer;

            textProperty().addListener((o, oldValue, newText) -> {
                ifCorrect.set(answer.test(newText));
            });

            ifCorrect.set(answer.test(""));
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}