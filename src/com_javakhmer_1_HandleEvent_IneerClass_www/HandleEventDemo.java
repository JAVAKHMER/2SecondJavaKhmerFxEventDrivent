package com_javakhmer_1_HandleEvent_IneerClass_www;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class HandleEventDemo extends Application{

	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		Button btnClick = new Button("Click");
		OkEvent handles = new OkEvent();
		btnClick.setOnAction(handles);
		Scene scene = new Scene(btnClick);
		stage.setScene(scene);
		stage.setTitle("Handle Event java khmer");
		stage.show();
	}

}
class OkEvent implements EventHandler<ActionEvent>{

	@Override
	public void handle(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("click show java khmer");
		
	}
	
}
