/*
 NAME: ADVIT VERMA
 STUDENT ID: 991543828
 ASSIGNMENT 2
 DATE: 3/01/2020
 */
package orderfx;

import content.DisplayOrder;
import content.Order;
import javafx.application.Application;

import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

import javafx.stage.Stage;

/**
 *
 * @author Advit
 */
public class OrderFx extends Application {

    private Label lblFirstName = new Label(" First NAME: ");
    private TextField txtFName = new TextField();
    private Label lblLastName = new Label(" Last NAME: ");
    private TextField txtLName = new TextField();
    private Label lblCity = new Label("CITY: ");
    private TextField txtCity = new TextField();

    private Label lblOrderId = new Label(" Order Id: ");
    private TextField txtOrderId = new TextField();

    private Button btnDisplay = new Button("Click To Order: ");
    private Order one = new Order();

    @Override
    public void start(Stage primaryStage) {

        primaryStage.setTitle("FxImage Example!");

        primaryStage.show();

        btnDisplay.setOnAction((e) -> {

            process();
            DisplayOrder ds = new DisplayOrder(one);
            ds.show();
        });

        primaryStage.show();
        Scene scene = new Scene(getGrid(), 1200, 550);
        primaryStage.setScene(scene);

        primaryStage.setOnCloseRequest((e) -> {
            Alert dlgInfo = new Alert(Alert.AlertType.CONFIRMATION);
            dlgInfo.setHeaderText("Closing Aplication");
            dlgInfo.show();

        });
    }

    private void process() {

        String fname = txtFName.getText();
        String lname = txtLName.getText();
        String city = txtCity.getText();
        String OrderId = txtOrderId.getText();
        one.setFirstName(fname.toUpperCase());
        one.setLastName(lname.toUpperCase());//one.setName(txtName.getText);
        one.setCity(city.toUpperCase());
        one.setOrderId(OrderId);

    }

    private GridPane getGrid() {

        GridPane pane = new GridPane();

        ImageView iTim = new ImageView("Images/tim.jpeg");

        ImageView iMuffin = new ImageView("Images/muffin.jpeg");

        ImageView iDoughnut = new ImageView("Images/dounut.jpeg");

        ImageView iCookie = new ImageView("Images/cookie.jpeg");

        iTim.setFitHeight(200);

        iTim.setFitWidth(200);
        iMuffin.setFitHeight(200);

        iMuffin.setFitWidth(200);

        iDoughnut.setFitHeight(200);

        iDoughnut.setFitWidth(200);

        iCookie.setFitHeight(200);

        iCookie.setFitWidth(200);

        Pane tim = new Pane(iTim);

        Pane muffin = new Pane(iMuffin);

        Pane doughnut = new Pane(iDoughnut);

        Pane cookie = new Pane(iCookie);

        pane.add(tim, 1, 0);
        pane.add(muffin, 3, 0);
        pane.add(doughnut, 5, 0);
        pane.add(cookie, 7, 0);
        pane.add(lblFirstName, 0, 1);
        pane.add(txtFName, 1, 1);
        pane.add(lblLastName, 0, 3);
        pane.add(txtLName, 1, 3);
        pane.add(lblCity, 0, 5);
        pane.add(txtCity, 1, 5);
        pane.add(lblOrderId, 0, 7);
        pane.add(txtOrderId, 1, 7);
        pane.add(btnDisplay, 0, 9);

        return pane;

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
