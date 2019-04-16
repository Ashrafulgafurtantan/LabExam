package sample;

import javafx.animation.AnimationTimer;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable{


    @FXML
    Button Aca,Stu;
    @FXML
    private AnchorPane anchorPane;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("in msg contrller");


    }

    @FXML
    public void AcaButton(ActionEvent w)
    {
        try {
            anchorPane.getChildren().clear();
            AnchorPane signupScreenPane = FXMLLoader.load(getClass().getResource("Academic.fxml"));

            anchorPane.getChildren().add(signupScreenPane);
            System.out.println("My Shit 3");
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }


    public void StuButton(ActionEvent w1)
    {
        try {
            anchorPane.getChildren().clear();
            AnchorPane signupScreenPane = FXMLLoader.load(getClass().getResource("Student.fxml"));

            anchorPane.getChildren().add(signupScreenPane);
            System.out.println("My Shit 3");
        } catch (IOException e1) {
            e1.printStackTrace();
        }

    }












}
