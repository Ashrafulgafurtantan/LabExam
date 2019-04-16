package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class StudentController implements Initializable {

    @FXML
    TextField Pass;
    @FXML
    TextField name;
    @FXML
    Button ok;
    @FXML
    AnchorPane anchorPane;

    static String Name;



    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("in msg contrller");

    }

    public void OKButton(ActionEvent r)
    {

           Name=name.getText();
        String pass=Pass.getText();






        try {
            anchorPane.getChildren().clear();
            AnchorPane signupScreenPane = FXMLLoader.load(getClass().getResource("AccReqst.fxml"));

            anchorPane.getChildren().add(signupScreenPane);
            System.out.println("My Shit 3");
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }
}
