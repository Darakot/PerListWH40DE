package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class TalAndTrCtrl extends VBox {
    public TalAndTrCtrl() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(
                "gui/talAndTr.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);

        try {
            fxmlLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException(exception);

        }
    }
}
