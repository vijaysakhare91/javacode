module org.java.java {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.java.java to javafx.fxml;
    exports org.java.java;
}