package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

public class CreatePersonController implements Initializable {
    static         Map<String,Double>map= new HashMap<String,Double>();
    static ArrayList<String> array=new ArrayList<>();
    static         Map<String,String>BankMap= new HashMap<>();



    @FXML
    Button Create;
    @FXML
    private AnchorPane anchorPane;
    @FXML
    PasswordField Pass;
    @FXML
    TextField name,BankAccNo,balance;

    @FXML
    PasswordField  bankPass;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("in createController");

    }
    @FXML
    public void CreateButtonAction(ActionEvent e)
    {
        String n=name.getText();
        String p=Pass.getText();
        String ff=balance.getText();



        String amount = balance.getText();
        double subtotal = Double.parseDouble(amount);
        String bNam=BankAccNo.getText();
        String bPass=bankPass.getText();
        BankMap.put(bNam,bPass);
        map.put(n,subtotal);
        array.add(p);
        System.out.println("inserted..");

    }
}
