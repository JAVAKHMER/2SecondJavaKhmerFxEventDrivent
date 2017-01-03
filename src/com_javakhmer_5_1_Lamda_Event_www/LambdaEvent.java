package com_javakhmer_5_1_Lamda_Event_www;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class LambdaEvent extends Application{

	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		Pane pane = new Pane();
		Button btnClick = new Button("Click");
		pane.getChildren().add(btnClick);
		btnClick.setOnAction((ActionEvent e) -> {
			System.out.println("Lambda Evnet Click.");
			
		});
		Scene scene = new Scene(pane);
		stage.setScene(scene);
		stage.setTitle("Lambda Event java khmer");
		stage.show();
	}

}
