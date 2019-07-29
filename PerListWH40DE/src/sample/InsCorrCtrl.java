package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class InsCorrCtrl extends VBox {
    public InsCorrCtrl() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(
                "gui/InsCorr.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);

        try {
            fxmlLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException(exception);

        }
    }
}
