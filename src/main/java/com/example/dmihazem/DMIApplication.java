package com.example.dmihazem;

import javafx.application.Application;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javafx.event.ActionEvent;
import java.util.Scanner;

public class DMIApplication extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(DMIApplication.class.getResource("DMIGUI.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}

    /*
    public static void insertWeatherData() {

        int counter = 0;
        try (Connection conn = DBConnection.getConnection()) {
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO WeatherData VALUES (?,?,?,?,?,?,?,?,?,?,?,?)");
            conn.setAutoCommit(false);

            Scanner sc = new Scanner(new File("C:\\Program Files\\Java\\jdk-19\\DMIProjekt\\src\\main\\resources\\com\\example\\dmiprojekt\\WeatherDataTableData.txt"));
            sc.useDelimiter("[\t\\n]");

            counter = 0;
            while (sc.hasNext()) {
                stmt.setString(1, sc.next());
                stmt.setString(2, sc.next());
                stmt.setString(3, sc.next());
                stmt.setString(4, sc.next());
                stmt.setString(5, sc.next());
                stmt.setString(6, sc.next());
                stmt.setString(7, sc.next());
                stmt.setString(8, sc.next());
                stmt.setString(9, sc.next());
                stmt.setString(10, sc.next());
                stmt.setString(11, sc.next());
                stmt.setString(12, sc.next());

                counter++;
                System.out.println(counter);

                stmt.addBatch();
            }
            stmt.executeBatch();
            conn.commit();
            System.out.println("Commit udført");
            sc.close();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void showData(ActionEvent actionEvent) {
    }
}

*/