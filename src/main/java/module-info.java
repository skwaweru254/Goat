module com.example.goat {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.goat to javafx.fxml;
    exports com.example.goat;
}