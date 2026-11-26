module org.example {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires java.sql;
    requires java.sql;
    requires com.mysql.cj;

    opens org.example to javafx.fxml;
    opens org.example.controller to javafx.fxml;
    exports org.example;
    exports org.example.controller;
}
