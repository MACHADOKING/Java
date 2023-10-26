module com.javafxprojeto01.javafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.javafxprojeto01.javafx to javafx.fxml;
    exports com.javafxprojeto01.javafx;
    exports com.javafxprojeto01.javafx.model.entities;
    opens com.javafxprojeto01.javafx.model.entities to javafx.fxml;
}