package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.VBox;
import java.io.IOException;

public class CharCtrl extends VBox {
    public CharCtrl() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(
                "gui/characteristics.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);

        try {
            fxmlLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException(exception);

        }
    }
}
