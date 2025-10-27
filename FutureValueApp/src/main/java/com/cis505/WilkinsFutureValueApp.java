/* 
    Wilkins, S (2025). CIS 505 Intermediate Java Programming. Bellevue University.
*/
package com.cis505;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class WilkinsFutureValueApp extends Application {
    private TextField fieldOne = new TextField();
    private TextField fieldTwo = new TextField();
    private TextArea area = new TextArea();
    private Label monthlyPayment = new Label("Monthly Payment:");
    private Label interestRate = new Label("Interest Rate:");
    private Label years = new Label("Years:");
    private Label rateFormat = new Label("Enter 11.1% as 11.1");
    private Label labelFive;
    private ComboBox<Integer> combo = new ComboBox<Integer>();
    private Button calculate = new Button("Calculate");
    private Button clear = new Button("Clear");

    /**
     * Details how the application should appear
     * @param s Stage
     */
    @Override
    public void start(Stage s)
    {
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        pane.setHgap(5.5);
        pane.setVgap(5.5);
        rateFormat.setTextFill(Color.RED);
        combo.setMaxWidth(Double.MAX_VALUE);

        pane.add(monthlyPayment, 1, 1);
        pane.add(fieldOne, 2, 1);
        pane.add(interestRate, 1, 2);
        pane.add(fieldTwo, 2, 2);
        HBox formatLabel = new HBox();
        formatLabel.setAlignment(Pos.BASELINE_RIGHT);
        formatLabel.getChildren().add(rateFormat);
        pane.add(formatLabel, 2, 3);
        pane.add(years, 1, 4);
        pane.add(combo, 2, 4);
        HBox buttons = new HBox();
        buttons.setPadding(new Insets(15, 0, 15, 30));
        buttons.setSpacing(10);
        buttons.getChildren().add(clear);
        buttons.getChildren().add(calculate);
        pane.add(buttons, 2, 5);
        pane.add(area, 1, 6, 2, 2);
        s.setScene(new Scene(pane));
        s.setTitle("Wilkins Future Value App");
        s.show();
    }

    /**
     * Runs the application
     * @param args String[]
     */
    public static void main(String[] args) {
        launch(args);
    }
}
