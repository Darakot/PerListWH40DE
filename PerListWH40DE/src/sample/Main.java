package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
//        Parent parent = FXMLLoader.load(getClass().getResource("sample.fxml"));
        CharCtrl carh = new CharCtrl();
        SkillsCtrl skills = new SkillsCtrl();
        InsCorrCtrl insCorr = new InsCorrCtrl();
        TalAndTrCtrl talAndTr = new TalAndTrCtrl();
        FlowPane  root = new FlowPane();
        root.setPadding(new Insets(5, 0, 5, 0));
        root.setVgap(2);
        root.setHgap(4);
        root.setPrefWrapLength(500);
        root.getChildren().add(carh);
        root.getChildren().add(skills);
        root.getChildren().add(insCorr);
        root.getChildren().add(talAndTr);


        primaryStage.setTitle("Start");
        primaryStage.setScene(new Scene(root, 1000, 950));
        primaryStage.show();
    }




    public static void main(String[] args) {
        launch(args);
    }
}
