package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ControllerMochila {

    private ControllerPantallaInicial ControllerPantallaInicial;

    @FXML
    private Button buttonVolver;


    @FXML
    public void onButtonVolver(ActionEvent actionEvent) {
        Stage stage = (Stage) buttonVolver.getScene().getWindow();
        stage.close();
    }


    public void mandarInfoDesdeControllerPantallaInicial(String info){ System.out.println("Información enviada: " + info);

    }

    public void setPantallaInicial(ControllerPantallaInicial PantallaInicial) {
        ControllerPantallaInicial = PantallaInicial;
        ControllerPantallaInicial.recibirInformacion("JAJAJAJJAJA");
        
    }



}
