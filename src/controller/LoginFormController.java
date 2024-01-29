package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

/**
 * @Created By Ravindu Prathibha
 * @created 1/29/2024 - 1:00 PM
 * @project Final_Sample_JDBC
 */
public class LoginFormController {
    public AnchorPane contextLogin;
    public JFXTextField userNameContext;
    public JFXPasswordField passwordContext;
    public JFXButton btnLogin;


    public void openDashBoardForm(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/DashBoardForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window   = (Stage) contextLogin.getScene().getWindow();
        window.setScene(new Scene(load));
        window.setResizable(false);
        window.centerOnScreen();
    }


    public void goToPasswordOnAction(ActionEvent actionEvent) throws IOException {
        passwordContext.requestFocus();
    }

}
