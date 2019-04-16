package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class accRqstController implements Initializable {
    @FXML
    TextField bank,pass;
    @FXML
    Button ok;
    @FXML
    AnchorPane anchorPane;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("in rqstController contrller");


    }

    public void BankAcc(ActionEvent u)
    {

        System.out.println("entered ");

        String b=bank.getText();
        String p=pass.getText();
        if( CreatePersonController.BankMap.containsKey(b))
        {
            if( CreatePersonController.BankMap.containsValue(p))
            {
                Double t=CreatePersonController.map.get(StudentController.Name);
                if(t<100)
                {

                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setHeaderText("Not enough money.");
                    alert.show();


                }
                else
                {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setHeaderText("Permission granted");
                    alert.show();
                }

            }
        }


    }
}
