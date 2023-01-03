package com.example.demo1;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController {

    @FXML
    private ComboBox<Integer> cantidadJugadores;

    @FXML
    private Button iniciarPartida;

    @FXML
    void onHelloButtonClick(ActionEvent event) throws IOException {
        Integer a = cantidadJugadores.getValue();

        try {
            System.out.println(a);

            FXMLLoader loader = new FXMLLoader(getClass().getResource("partida.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        catch (Exception e) {
            System.out.println(e);
        }

    }

    ObservableList<Integer> options = FXCollections.observableArrayList(2,3,4);

    @FXML
    public void initialize() {
        cantidadJugadores.setItems(options);
        cantidadJugadores.setValue(2);
    }

}