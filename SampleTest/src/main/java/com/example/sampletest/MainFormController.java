package com.example.sampletest;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class MainFormController {


    public Button nextBtn;
    @FXML
    private Button accbtn;

    @FXML
    private Button btnNext;

    @FXML
    private Button btnevt;

    @FXML
    private Button empbtn;

    @FXML
    private Button inbxbtn;

    @FXML
    private AnchorPane mainPanel1;

    @FXML
    private Button nursbtn;

    @FXML
    private Button rptbtn;

    @FXML
    private AnchorPane subPanel1;

    @FXML
    private AnchorPane subPanel2;

    @FXML
    private ImageView noyonLanka;

    @FXML
    private ImageView welcomePic;

    @FXML
    void btnAccountOnclick(ActionEvent event) throws IOException {
        subPanel2.getChildren().clear();
        subPanel2.getChildren().add(FXMLLoader.load(getClass().getResource("Account.fxml")));
    }

    @FXML
    void btnNextOnClick(ActionEvent event) {

    }

    @FXML
    void btnOnInbox(ActionEvent event)throws IOException {
        subPanel2.getChildren().clear();
        subPanel2.getChildren().add(FXMLLoader.load(getClass().getResource("Inbox.fxml")));

    }

    @FXML
    void btnOnNurse(ActionEvent event) throws IOException {
        subPanel2.getChildren().clear();
        subPanel2.getChildren().add(FXMLLoader.load(getClass().getResource("Nurse.fxml")));
    }

    @FXML
    void btnOnEmp(ActionEvent event) throws IOException{

        subPanel2.getChildren().clear();
        subPanel2.getChildren().add(FXMLLoader.load(getClass().getResource("Employee.fxml")));

    }

    @FXML
    void btnOnEvent(ActionEvent event) throws IOException{

        subPanel2.getChildren().clear();
        subPanel2.getChildren().add(FXMLLoader.load(getClass().getResource("Event.fxml")));
    }

    @FXML
    void btnOnReport(ActionEvent event) throws IOException {
        subPanel2.getChildren().clear();
        subPanel2.getChildren().add(FXMLLoader.load(getClass().getResource("Report.fxml")));

    }

    public void btnNextOnlogOut(ActionEvent actionEvent) {


    }

    public void nextONclick(ActionEvent actionEvent)  throws IOException{
        mainPanel1.getChildren().clear();
        mainPanel1.getChildren().add(FXMLLoader.load(getClass().getResource("MainForm.fxml")));
    }
}
