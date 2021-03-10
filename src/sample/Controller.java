package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;

public class Controller {

    @FXML
    AnchorPane pokemon1;

    @FXML
    AnchorPane pokemon2;

    @FXML
    AnchorPane pokemon3;

    @FXML
    AnchorPane pokemon4;

    @FXML
    AnchorPane pokemon5;

    @FXML
    AnchorPane pokemon6;


    public void click1(MouseEvent mouseEvent) {
        pokemon1.setStyle("-fx-background-color: #D35400");
        pokemon2.setStyle("-fx-background-color: #E9F5EC");
        pokemon3.setStyle("-fx-background-color: #E9F5EC");
        pokemon4.setStyle("-fx-background-color: #E9F5EC");
        pokemon5.setStyle("-fx-background-color: #E9F5EC");
        pokemon6.setStyle("-fx-background-color: #E9F5EC");
    }

    public void click2(MouseEvent mouseEvent) {
        pokemon1.setStyle("-fx-background-color: #E9F5EC");
        pokemon2.setStyle("-fx-background-color: #D35400");
        pokemon3.setStyle("-fx-background-color: #E9F5EC");
        pokemon4.setStyle("-fx-background-color: #E9F5EC");
        pokemon5.setStyle("-fx-background-color: #E9F5EC");
        pokemon6.setStyle("-fx-background-color: #E9F5EC");

    }

    public void click3(MouseEvent mouseEvent) {
        pokemon1.setStyle("-fx-background-color: #E9F5EC");
        pokemon2.setStyle("-fx-background-color: #E9F5EC");
        pokemon3.setStyle("-fx-background-color: #D35400");
        pokemon4.setStyle("-fx-background-color: #E9F5EC");
        pokemon5.setStyle("-fx-background-color: #E9F5EC");
        pokemon6.setStyle("-fx-background-color: #E9F5EC");
    }

    public void click4(MouseEvent mouseEvent) {
        pokemon1.setStyle("-fx-background-color: #E9F5EC");
        pokemon2.setStyle("-fx-background-color: #E9F5EC");
        pokemon3.setStyle("-fx-background-color: #E9F5EC");
        pokemon4.setStyle("-fx-background-color: #D35400");
        pokemon5.setStyle("-fx-background-color: #E9F5EC");
        pokemon6.setStyle("-fx-background-color: #E9F5EC");

    }

    public void click5(MouseEvent mouseEvent) {
        pokemon1.setStyle("-fx-background-color: #E9F5EC");
        pokemon2.setStyle("-fx-background-color: #E9F5EC");
        pokemon3.setStyle("-fx-background-color: #E9F5EC");
        pokemon4.setStyle("-fx-background-color: #E9F5EC");
        pokemon5.setStyle("-fx-background-color: #D35400");
        pokemon6.setStyle("-fx-background-color: #E9F5EC");
    }

    public void click6(MouseEvent mouseEvent) {
        pokemon1.setStyle("-fx-background-color: #E9F5EC");
        pokemon2.setStyle("-fx-background-color: #E9F5EC");
        pokemon3.setStyle("-fx-background-color: #E9F5EC");
        pokemon4.setStyle("-fx-background-color: #E9F5EC");
        pokemon5.setStyle("-fx-background-color: #E9F5EC");
        pokemon6.setStyle("-fx-background-color: #D35400");
    }

    @FXML
    public void onButtonmochila(ActionEvent actionEvent) {
        try {
            Stage stage = new Stage();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Mochila.fxml"));
            Pane root = (Pane) loader.load();
            Scene scene = new Scene(root, 450, 410);
            stage.setScene(scene);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
