package controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import model.database.Authenticator;
import model.database.FirebaseAuthenticator;


public class LoginController {

    private Authenticator auth = FirebaseAuthenticator.getInstance();

    @FXML
    public TextField email;

    @FXML
    public TextField password;

    @FXML
    public void logInButtonPress() {
        String email = this.email.getText();
        String password = this.password.getText();

        if (auth.authenticate(email, password)) {
            // TODO Launch the Shelter List
        } else {

        }
    }
}
