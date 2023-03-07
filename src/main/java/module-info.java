module com.example.dmihazem {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.dmihazem to javafx.fxml;
    exports com.example.dmihazem;
    requires java.naming;
    requires mssql.jdbc;
}