package com_javakhmer_3_Key_Event_www;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class KeyEvent extends Application{

	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		Group root = new Group();
		Scene scene = new Scene(root,200,200);
		TextField txtKey = new TextField();
		txtKey.setText("Write here");
		txtKey.setOnKeyPressed(new EventHandler<javafx.scene.input.KeyEvent>() {

			@Override
			public void handle(javafx.scene.input.KeyEvent ke) {
				// TODO Auto-generated method stub
				System.out.println("Key Press Event"+ ke.getText());
			}

		});
		txtKey.setOnKeyReleased(new EventHandler<javafx.scene.input.KeyEvent>() {

			@Override
			public void handle(javafx.scene.input.KeyEvent ke) {
				// TODO Auto-generated method stub
				System.out.println("Key Released Event"+ke.getText());
			}
		});
		
		root.getChildren().add(txtKey);
		stage.setScene(scene);
		stage.setTitle("Key Event java khmer");
		stage.show();
	}

}
