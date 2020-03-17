package ba.unsa.etf.rs.tut2zad1;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class Controller {
    public Label helloWorld;


    public void promjenaNaziva(ActionEvent actionEvent) {
        helloWorld.setText("Hello World!");
    }
}
