module com.javafxprojeto01.javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.javafxprojeto01.javafx to javafx.fxml;
    exports com.javafxprojeto01.javafx;
}