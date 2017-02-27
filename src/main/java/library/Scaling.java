package library;

import javafx.stage.Screen;
import java.util.Optional;
import javafx.scene.text.Font;

/**
 * Created by aworton on 26/02/17.
 */
public class Scaling {

    private static double baseDpi = 96.0;
    private static double dpi = Screen.getPrimary().getDpi();
    private static String osName = System.getProperty("os.name");

    public static double getScalingValue(){
        if(osName.startsWith("Linux")){
            return getScalingValueFromDpi().orElse(1D);
        }
        return getScalingValueFromDpi().orElse(1D);
    }

    private static Optional<Double> getScalingValueFromDpi() {
        if(dpi > 0){
            return Optional.of(dpi / baseDpi);
        }
        return Optional.empty();
    }
}
