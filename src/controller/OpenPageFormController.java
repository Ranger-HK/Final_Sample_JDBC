package controller;

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
 * @created 1/29/2024 - 12:59 PM
 * @project Final_Sample_JDBC
 */
public class OpenPageFormController {


    public AnchorPane contextId;


    public void openLoginOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/LoginForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) contextId.getScene().getWindow();
        window.setScene(new Scene(load));
        window.centerOnScreen();

    }
}
