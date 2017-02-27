package config;

/**
 * Created by aworton on 26/02/17.
 */
public class Settings {

    private static String styleSheet = "css/dark.css";
    private static String centreNumber = "13340";

    public static String getStyleSheet(){
        return styleSheet;
    }

    public static String getCentreNumber(){
        return centreNumber;
    }
}
