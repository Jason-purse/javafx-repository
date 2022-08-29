module club.smileboy.gradlehelloworld {
    requires javafx.controls;
    requires javafx.fxml;

    requires club.smileboy.sshd.util;
    opens club.smileboy.gradlehelloworld to javafx.fxml;
    exports club.smileboy.gradlehelloworld;
}