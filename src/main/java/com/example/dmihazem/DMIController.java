package com.example.dmihazem;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.AreaChart;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class DMIController {

    @FXML
    private AreaChart<?, ?> areaChart;

    @FXML
    private Label dateTimeEndLabel;

    @FXML
    private Label dateTimeStartLabel;

    @FXML
    private ComboBox<?> endDateCB;

    @FXML
    private Label endDateLabel;

    @FXML
    private Label endHourLabel;

    @FXML
    private ComboBox<?> hourEndCB;

    @FXML
    private ComboBox<?> hourStartCB;

    @FXML
    private Button showDataButton;

    @FXML
    private ComboBox<?> startDateCB;

    @FXML
    private Label startDateLabel;

    @FXML
    private Label startHourLabel;

    @FXML
    private ComboBox<?> stationCB;

    @FXML
    private Label titleLabel;

    @FXML
    private ComboBox<?> weatherDataCB;

    @FXML
    private Label weatherDataLabel;

    @FXML
    void showData(ActionEvent event) {

    }

}
