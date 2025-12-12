module com.example.audioplayer {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires javafx.media;

    opens com.example.audioplayer to javafx.fxml;
    exports com.example.audioplayer;
}