package scenes;

import javafx.scene.layout.GridPane;

import static library.Scaling.getScalingValue;

/**
 * Created by aworton on 26/02/17.
 */
public class ContainerFactory {

    public static GridPane getRoot(){
        double scaling = getScalingValue();
        GridPane root = new GridPane();
        root.setId("root");
        root.setStyle("-fx-font-size:" + (scaling * 14) + ";");
        return root;
    }
}
