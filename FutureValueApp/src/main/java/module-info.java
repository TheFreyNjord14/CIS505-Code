module com.cis505 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    opens com.cis505 to javafx.fxml;
    exports com.cis505;
}