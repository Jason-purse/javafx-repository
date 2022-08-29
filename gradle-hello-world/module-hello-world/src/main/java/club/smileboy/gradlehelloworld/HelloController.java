package club.smileboy.gradlehelloworld;
import  club.smileboy.sshd.util.*;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        MySshClient instance = MySshClient.getInstance();
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}