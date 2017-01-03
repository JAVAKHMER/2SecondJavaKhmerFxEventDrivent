package com_javakhmer_6_Mouse_Event_www;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MouseEventDemo extends Application
{

	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		Text textjavakhemr = new Text(20,20,"Java khmer for you.");
		Pane pane = new Pane();
		pane.setPadding(new Insets(15));
		pane.getChildren().addAll(textjavakhemr);
		textjavakhemr.setOnMouseDragged(e->{
			textjavakhemr.setX(e.getX());
			textjavakhemr.setY(e.getY());
		});
		Scene scene = new Scene(pane,200,200);
		stage.setScene(scene);
		stage.setTitle("Lambda Event java khmer");
		stage.show();
	}

}
