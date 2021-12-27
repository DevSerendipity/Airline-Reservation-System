module com.ARS {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires decimal4j;

    opens com.ARS to javafx.fxml;
    exports com.ARS;
    exports com.ARS.jfx;
    opens com.ARS.jfx to javafx.fxml;
    exports com.ARS.user.controller;
    opens com.ARS.user.controller to javafx.fxml;
    exports com.ARS.user.view;
    opens com.ARS.user.view to javafx.fxml;
    exports com.ARS.user;
    opens com.ARS.user to javafx.fxml;
}