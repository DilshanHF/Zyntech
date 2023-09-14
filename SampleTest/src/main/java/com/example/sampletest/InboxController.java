package com.example.sampletest;

import com.example.sampletest.tm.InboxDataTm;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class InboxController implements Initializable {

    @FXML
    private TableColumn<?, ?> colDate;

    @FXML
    private TableColumn<?, ?> colId;

    @FXML
    private TableColumn<?, ?> colName;

    @FXML
    private TableColumn<?, ?> colUnit;

    @FXML
    private TableView<InboxDataTm> tblData;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        colId.setCellValueFactory(new PropertyValueFactory<>("id"));
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colDate.setCellValueFactory(new PropertyValueFactory<>("date"));
        colUnit.setCellValueFactory(new PropertyValueFactory<>("unit"));

        refresh();
    }

    void refresh() {
        ObservableList<InboxDataTm> list = FXCollections.observableArrayList();
        list.add(new InboxDataTm("fghj", "dfghj", "fghj", "fghj"));
        list.add(new InboxDataTm("fghj", "dfghj", "fghj", "fghj"));
        list.add(new InboxDataTm("fghj", "dfghj", "fghj", "fghj"));
        list.add(new InboxDataTm("fghj", "dfghj", "fghj", "fghj"));
        list.add(new InboxDataTm("fghj", "dfghj", "fghj", "fghj"));
        tblData.setItems(list);
    }
}
