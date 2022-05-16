module com.example.tree {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tree to javafx.fxml;
    exports com.example.tree;
}