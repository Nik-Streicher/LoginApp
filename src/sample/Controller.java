package sample;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import core.Login;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private PasswordField passwordField;

    @FXML
    private TextField nameField;

    @FXML
    private Label accessResultLabel;

    private Login login;

    @FXML
    void loginIn(ActionEvent event) throws IOException {

        if (login.checkLogin(passwordField.getText(), nameField.getText())) {
            Parent second = FXMLLoader.load(getClass().getResource("../secondWindow/sample2.fxml"));
            Scene scene2 = new Scene(second);
            Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
            window.setScene(scene2);
            window.show();

        } else accessResultLabel.setText("Access denied");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        this.login = new Login();
    }
}
