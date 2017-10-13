package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import javax.security.auth.callback.TextOutputCallback;
import javax.xml.soap.Text;
import java.awt.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");

        //Create Layout
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        //Zeilenabstand
        grid.setHgap(10);
        grid.setVgap(10);

        grid.setPadding(new Insets(25,25,25,25));
        Scene scene = new Scene(grid,300,275);

        javafx.scene.control.Label input = new javafx.scene.control.Label("Eingabe: ");
        grid.add(input,0,1);

        javafx.scene.control.TextField inputTextField = new javafx.scene.control.TextField();
        grid.add(inputTextField,1,1);

        javafx.scene.text.Text outputTitle = new javafx.scene.text.Text();
        outputTitle.setFont(Font.font("Calibri", FontWeight.NORMAL, 20));
        grid.add(outputTitle,0,2);

        javafx.scene.control.Label valueLabel = new javafx.scene.control.Label("Wert: ");
        grid.add(valueLabel,0,3);

        javafx.scene.control.Label calculatedLabel = new javafx.scene.control.Label("0");
        grid.add(calculatedLabel,1,3);

        javafx.scene.control.Label mwstLabel = new javafx.scene.control.Label("MwSt: ");
        grid.add(mwstLabel,0,4);

        javafx.scene.control.Label calculatedMWST = new javafx.scene.control.Label("0");
        grid.add(calculatedMWST,1,3);

        javafx.scene.control.Button btn = new javafx.scene.control.Button("Berechne");
        grid.add(btn,1,5);

        primaryStage.setScene(scene);
        primaryStage.show();
        }


    public static void main(String[] args) {
        launch(args);
    }
}
