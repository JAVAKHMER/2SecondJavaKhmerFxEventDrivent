package com_javakhmer_5_2_LambdaEvent_www;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class LambdaCalculate extends Application{

	Label lFirst , lSecond , lResult;
	TextField tfFirst , tfSecond , tfResult;
	Button btCalculate;
	
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		GridPane p = new GridPane();
		p.setHgap(10);
		p.setVgap(10);
		p.setAlignment(Pos.CENTER);
		p.add(lFirst = new Label("First:"), 0, 0);
		p.add(tfFirst = new TextField(),1,0);
		p.add(lSecond = new Label("Second:"),0,1);
		p.add(tfSecond = new TextField(), 1,1);
		p.add(lResult = new Label("Result:"),0,2);
		p.add(tfResult = new TextField(),1,2);
		p.add(btCalculate = new Button("Calculate"),1,3);
		tfFirst.setPromptText("first num");
		tfSecond.setPromptText("Second num");
		tfResult.setPromptText("Result");
		GridPane.setHalignment(btCalculate, HPos.RIGHT);
		p.setPadding(new Insets(15));
		btCalculate.setOnAction((ActionEvent e)->{
			double first = Double.parseDouble(tfFirst.getText());
			double second = Double.parseDouble(tfSecond.getText());
			double result = first + second;
			tfResult.setText(result + "");
			
		});
		Scene scene = new Scene(p);
		stage.setScene(scene);
		stage.setTitle("Lambda Event java khmer");
		stage.show();
	}

}
