module com.ARS {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires decimal4j;

    opens com.ARS to javafx.fxml;
    exports com.ARS;
    exports com.ARS.jfx;
    opens com.ARS.jfx to javafx.fxml;
}