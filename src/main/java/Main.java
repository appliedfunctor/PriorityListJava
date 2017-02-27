import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

import static config.Settings.getCentreNumber;
import static config.Settings.getStyleSheet;
import static javafx.scene.input.KeyCombination.CONTROL_DOWN;
import static library.Scaling.getScalingValue;
import static scenes.ContainerFactory.getRoot;

/**
 * Created by aworton on 25/02/17.
 */
public class Main extends Application{

    @Override
    public void start(Stage primaryStage){
        double scaling = getScalingValue();
        primaryStage.setAlwaysOnTop(true);
        primaryStage.setTitle("Hello JavaFX");
        GridPane root = getRoot();
        root.getChildren().add(new Label("Centre: " + getCentreNumber()));

        Scene scene = new Scene(root, 400 * scaling, 500 * scaling);
        scene.getStylesheets().add(this.getClass().getResource(getStyleSheet()).toExternalForm());

        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setOnCloseRequest(e -> Platform.exit());

        //openNewWindow();
    }

    private void openNewWindow(){
        Stage stage = new Stage();
        stage.setTitle("My New Stage Title");
        GridPane root = getRoot();

        Parent content;
        try {
            content = FXMLLoader.load(getClass().getClassLoader().getResource("view/main.fxml"));
            root.getChildren().add(content);
        }
        catch(IOException e){
            e.printStackTrace();
        }


        stage.setScene(new Scene(root, 450, 450));
        stage.initStyle(StageStyle.UNDECORATED );
        stage.setFullScreen(true);
        stage.setAlwaysOnTop(false);
        stage.setFullScreenExitKeyCombination( new KeyCodeCombination(KeyCode.E, CONTROL_DOWN) );
        stage.show();
    }
}
