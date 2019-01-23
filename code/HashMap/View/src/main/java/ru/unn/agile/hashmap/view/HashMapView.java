package ru.unn.agile.hashmap.view;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import ru.unn.agile.hashmap.viewmodel.ViewModel;

public class HashMapView {
    @FXML
    private ViewModel viewModel;

    @FXML
    private Button AddButton;
    @FXML
    private Button GetButton;
    @FXML
    private Button DelButton;
    @FXML
    private TextField inputKeyForAdd;
    @FXML
    private TextField inputValueForAdd;
    @FXML
    private TextField inputKeyForGet;
    @FXML
    private TextField inputValueForGet;
    @FXML
    private TextField inputKeyForRemove;
    @FXML
    void initialize() {
        inputKeyForAdd.textProperty().bindBidirectional(viewModel.addingInputKeyProperty());
		inputValueForAdd.textProperty().bindBidirectional(viewModel.addingInputValueProperty());
		inputKeyForGet.textProperty().bindBidirectional(viewModel.gettingInputKeyProperty());
		inputValueForGet.textProperty().bindBidirectional(viewModel.gettingInputValueProperty());
		inputKeyForRemove.textProperty().bindBidirectional(viewModel.removingInputKeyProperty());

        DelButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(final ActionEvent event) {
                viewModel.delElement();
            }
        });
        GetButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(final ActionEvent event) {
                viewModel.getElement();
            }
        });
        AddButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(final ActionEvent event) {
                viewModel.addElement();
            }
        });
    }
}
