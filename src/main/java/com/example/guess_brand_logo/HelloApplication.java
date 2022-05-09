package com.example.guess_brand_logo;

import javafx.application.Application;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.function.Predicate;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("Guess The Brand Logo");
        stage.setScene(new Scene(Structure()));
        stage.show();
    }

    private Parent Structure() throws FileNotFoundException {
        var textbox = new CheckGuess(input -> input.matches("Pepsi") || input.matches("pepsi"));
        textbox.setText("Enter Guess");
        textbox.setFocusTraversable(false);
        textbox.setAlignment(Pos.CENTER);
        textbox.setMaxWidth(100.0);
        textbox.setMaxHeight(35.0);
        //
        var button = new Button("Next Level ->");
        button.disableProperty().bind(textbox.isCorrect.not());
        Label title = new Label("Level 1");
        title.setFont(new Font("Times New Roman", 25.0));
        //Logo
        Image logo1 = new Image(new FileInputStream("C:\\Users\\Nadolf\\Projects\\Guess_Brand_Logo\\src\\main\\java\\com\\example\\guess_brand_logo\\pepsi-logo-symbol.png"));
        ImageView imageView = new ImageView(logo1);
        //Button
        StackPane.setAlignment(title, Pos.TOP_CENTER);
        StackPane.setAlignment(textbox, Pos.BOTTOM_CENTER);
        StackPane.setAlignment(button, Pos.BOTTOM_RIGHT);
        StackPane.setMargin(title,new Insets(10));
        StackPane.setMargin(textbox,new Insets(15));
        StackPane.setMargin(button,new Insets(15));
        StackPane.setMargin(imageView,new Insets(75,75,75,75));
        return new StackPane(textbox,title,imageView,button);
    }

    private static class CheckGuess extends TextField {
        private final Predicate<String> answer;
        private BooleanProperty isCorrect = new SimpleBooleanProperty();

        CheckGuess(Predicate<String> answer) {
            this.answer = answer;

            textProperty().addListener((o, oldValue, newText) -> {
                isCorrect.set(answer.test(newText));
            });

            isCorrect.set(answer.test(""));
        }
    }


    public static void main(String[] args) {
        launch(args);
    }
}