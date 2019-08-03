package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import sample.equip.Armor;
import sample.equip.MeleeWeapons;
import sample.equip.RangedWeapons;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class CharCtrl extends VBox {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextArea ws;

    @FXML
    private TextField wsParam;

    @FXML
    private Circle wsUsed1;

    @FXML
    private Circle wsUsed2;

    @FXML
    private Circle wsUsed3;

    @FXML
    private Circle wsUsed4;

    @FXML
    private Circle wsUsed5;

    @FXML
    private TextArea bs;

    @FXML
    private TextField bsParam;

    @FXML
    private TextArea str;

    @FXML
    private TextField strParam;

    @FXML
    private TextArea tgh;

    @FXML
    private TextField tghParam;

    @FXML
    private TextArea ag;

    @FXML
    private TextField agParam;

    @FXML
    private TextArea intl;

    @FXML
    private TextField intlParam;

    @FXML
    private TextArea per;

    @FXML
    private TextField perParam;

    @FXML
    private TextArea wp;

    @FXML
    private TextField wpParam;

    @FXML
    private TextArea fel;

    @FXML
    private TextField felParam;

    @FXML
    private TextArea ifl;

    @FXML
    private TextField iflParam;

    @FXML
    private TextField expToSpend;

    @FXML
    private TextField totalExp;

    @FXML
    private TextField thFp;

    @FXML
    private TextField curFp;

    @FXML
    private Pane temp;

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

    @FXML
    void addWs(MouseEvent event) {
        System.out.println(event.getButton());
        System.out.println(event.getClickCount());
        System.out.println(event.getSource());
        int resultWs = Integer.parseInt(wsParam.getText()) + 5;
        wsParam.setText(String.valueOf(resultWs));
        wsUsed1.setFill(Color.BLACK);
    }

    @FXML
    void initialize() {

        MeleeWeapons mW = new MeleeWeapons("Chainsword");
        System.out.println(mW.getNameAm());
        System.out.println(mW.getClassWeapons());
        System.out.println(mW.getRange());
        System.out.println(mW.getDamage());

        System.out.println("");

        RangedWeapons rW = new RangedWeapons("Boltgun");
        System.out.println(rW.getNameAm());
        System.out.println(rW.getClassWeapons());
        System.out.println(rW.getRange());
        System.out.println(rW.getDamage());

        wsParam.setText("39");
        ws.setStyle("-fx-control-inner-background: #1effb6;");

    }
}
