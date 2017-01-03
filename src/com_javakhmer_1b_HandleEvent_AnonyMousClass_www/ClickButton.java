package com_javakhmer_1b_HandleEvent_AnonyMousClass_www;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ClickButton extends Application{

	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		Group root = new Group();
		Scene scene = new Scene(root);
		Button btnClick = new Button();
		btnClick.setText("Click");
		btnClick.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("java khmer");
			}
			
		});
		root.getChildren().add(btnClick);
		stage.setScene(scene);
		stage.show();
	}

}
