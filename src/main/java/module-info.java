module com.ARS.jfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires decimal4j;

    opens com.ARS.jfx to javafx.fxml;
    exports com.ARS.jfx;
}