import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * Created by aworton on 25/02/17.
 */
public class HelloFx extends Application{

    @Override
    public void start(Stage stage){
        stage.setTitle("Hello ScalaFX");
        Group group = new Group(new Label("Hello Label"));
        Scene scene = new Scene(group, 800, 600);
        stage.setScene(scene);
    }
}
