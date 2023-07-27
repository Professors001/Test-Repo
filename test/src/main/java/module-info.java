module ku.lab.test {
    requires javafx.controls;
    requires javafx.fxml;


    opens ku.lab.test to javafx.fxml;
    exports ku.lab.test;
}