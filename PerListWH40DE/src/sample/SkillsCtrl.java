package sample;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;


public class SkillsCtrl extends VBox {

    @FXML
    private Label acrobatics;

    @FXML
    private CheckBox acrobatics0;

    @FXML
    private CheckBox acrobatics10;

    @FXML
    private CheckBox acrobatics20;

    @FXML
    private CheckBox acrobatics30;

    @FXML
    private Label athletics;

    @FXML
    private CheckBox athletics0;

    @FXML
    private CheckBox athletics10;

    @FXML
    private CheckBox athletics20;

    @FXML
    private CheckBox athletics30;

    @FXML
    private Label awareness;

    @FXML
    private CheckBox awareness0;

    @FXML
    private CheckBox awareness10;

    @FXML
    private CheckBox awareness20;

    @FXML
    private CheckBox awareness30;

    @FXML
    private Label charm;

    @FXML
    private CheckBox charm0;

    @FXML
    private CheckBox charm10;

    @FXML
    private CheckBox charm20;

    @FXML
    private CheckBox charm30;

    @FXML
    private Label command;

    @FXML
    private CheckBox command0;

    @FXML
    private CheckBox command10;

    @FXML
    private CheckBox command20;

    @FXML
    private CheckBox command30;

    @FXML
    private Label commerce;

    @FXML
    private CheckBox commerce0;

    @FXML
    private CheckBox commerce10;

    @FXML
    private CheckBox commerce20;

    @FXML
    private CheckBox commerce30;

    @FXML
    private Label commonLore;

    @FXML
    private Label commonLoreA;

    @FXML
    private CheckBox commonLoreA0;

    @FXML
    private CheckBox commonLoreA10;

    @FXML
    private CheckBox commonLoreA20;

    @FXML
    private CheckBox commonLoreA30;

    @FXML
    private Label commonLoreB;

    @FXML
    private CheckBox commonLoreB0;

    @FXML
    private CheckBox commonLoreB10;

    @FXML
    private CheckBox commonLoreB20;

    @FXML
    private CheckBox commonLoreB30;

    @FXML
    private Label commonLoreC;

    @FXML
    private CheckBox commonLoreC0;

    @FXML
    private CheckBox commonLoreC10;

    @FXML
    private CheckBox commonLoreC20;

    @FXML
    private CheckBox commonLoreC30;

    @FXML
    private Label commonLoreD;

    @FXML
    private CheckBox commonLoreD0;

    @FXML
    private CheckBox commonLoreD10;

    @FXML
    private CheckBox commonLoreD20;

    @FXML
    private CheckBox commonLoreD30;

    @FXML
    private Label deceive;

    @FXML
    private CheckBox deceive0;

    @FXML
    private CheckBox deceive10;

    @FXML
    private CheckBox deceive20;

    @FXML
    private CheckBox deceive30;

    @FXML
    private Label dodge;

    @FXML
    private CheckBox dodge0;

    @FXML
    private CheckBox dodge10;

    @FXML
    private CheckBox dodge20;

    @FXML
    private CheckBox dodge30;

    @FXML
    private Label forbiddenLore;

    @FXML
    private Label forbiddenLoreA;

    @FXML
    private CheckBox forbiddenLoreA0;

    @FXML
    private CheckBox forbiddenLoreA10;

    @FXML
    private CheckBox forbiddenLoreA20;

    @FXML
    private CheckBox forbiddenLoreA30;

    @FXML
    private Label forbiddenLoreB;

    @FXML
    private CheckBox forbiddenLoreB0;

    @FXML
    private CheckBox forbiddenLoreB10;

    @FXML
    private CheckBox forbiddenLoreB20;

    @FXML
    private CheckBox forbiddenLoreB30;

    @FXML
    private Label forbiddenLoreC;

    @FXML
    private CheckBox forbiddenLoreC0;

    @FXML
    private CheckBox forbiddenLoreC10;

    @FXML
    private CheckBox forbiddenLoreC20;

    @FXML
    private CheckBox forbiddenLoreC30;

    @FXML
    private Label forbiddenLoreD;

    @FXML
    private CheckBox forbiddenLoreD0;

    @FXML
    private CheckBox forbiddenLoreD10;

    @FXML
    private CheckBox forbiddenLoreD20;

    @FXML
    private CheckBox forbiddenLoreD30;

    @FXML
    private Label inquiry;

    @FXML
    private CheckBox inquiry0;

    @FXML
    private CheckBox inquiry10;

    @FXML
    private CheckBox inquiry20;

    @FXML
    private CheckBox inquiry30;

    @FXML
    private Label interrogation;

    @FXML
    private CheckBox interrogation0;

    @FXML
    private CheckBox interrogation10;

    @FXML
    private CheckBox interrogation20;

    @FXML
    private CheckBox interrogation30;

    @FXML
    private Label intimidate;

    @FXML
    private CheckBox intimidate0;

    @FXML
    private CheckBox intimidate10;

    @FXML
    private CheckBox intimidate20;

    @FXML
    private CheckBox intimidate30;

    @FXML
    private Label linguistics;

    @FXML
    private Label linguisticsA;

    @FXML
    private CheckBox linguisticsA0;

    @FXML
    private CheckBox linguisticsA10;

    @FXML
    private CheckBox linguisticsA20;

    @FXML
    private CheckBox linguisticsA30;

    @FXML
    private Label linguisticsB;

    @FXML
    private CheckBox linguisticsB0;

    @FXML
    private CheckBox linguisticsB10;

    @FXML
    private CheckBox linguisticsB20;

    @FXML
    private CheckBox linguisticsB30;

    @FXML
    private Label logic;

    @FXML
    private CheckBox logic0;

    @FXML
    private CheckBox logic10;

    @FXML
    private CheckBox logic20;

    @FXML
    private CheckBox logic30;

    public SkillsCtrl() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(
                "gui/skills.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);

        try {
            fxmlLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException(exception);

        }
    }

    @FXML
    void initialize() {
        logic.setTextFill(Color.GREEN);
        logic0.setSelected(true);
        logic10.setSelected(true);
    }
}