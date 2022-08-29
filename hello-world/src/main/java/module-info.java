module club.smileboy.helloworld {
    requires javafx.controls;
    requires javafx.fxml;

    requires transitive sshd.core;
    requires transitive sshd.common;
    opens club.smileboy.helloworld to javafx.fxml;


    exports club.smileboy.helloworld;

}