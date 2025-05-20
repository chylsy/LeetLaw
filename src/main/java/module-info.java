module com.example.leetlaw {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.leetlaw to javafx.fxml;
    exports com.example.leetlaw;
}