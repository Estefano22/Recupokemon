package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;

public class ControllerPantallaInicial {

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
    private Button buttonSalir;
    @FXML
    public void onButtonmochila(ActionEvent event) {
        try {
            Stage stage = new Stage();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Mochila.fxml"));
            Pane root = (Pane) loader.load();
            Scene scene = new Scene(root, 800, 550);
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();

            ControllerMochila controller = loader.getController();
            controller.mandarInfoDesdeControllerPantallaInicial("");
            controller.setPantallaInicial(this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void recibirInformacion(String info){
        System.out.println("Informacion recibida en PantallaInicial de la Mochila = " + info);
    }

    public void onButtonSalir(ActionEvent actionEvent){ System.exit(0); } {

    }
}
