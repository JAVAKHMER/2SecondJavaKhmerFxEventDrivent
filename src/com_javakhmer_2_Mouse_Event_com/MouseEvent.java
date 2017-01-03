package com_javakhmer_2_Mouse_Event_com;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class MouseEvent extends Application{

	public static void main(String[] args) {
		Application.launch(args);
	}
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		Group root = new Group();
		Scene scene = new Scene(root,200,200);
		Circle circle = new Circle(50,Color.GREEN);
		circle.setCenterX(100);
		circle.setCenterY(100);
		circle.setOnMouseClicked(new EventHandler<Event>() {

			@Override
			public void handle(Event e) {
				// TODO Auto-generated method stub
				System.out.println("Mouse is Click on Circle");
			}
		});
		circle.setOnMouseEntered(new EventHandler<Event>() {

			@Override
			public void handle(Event e) {
				// TODO Auto-generated method stub
				System.out.println("Mouse is Enter");
			}
		});
		circle.setOnMouseExited(new EventHandler<Event>() {

			@Override
			public void handle(Event e) {
				// TODO Auto-generated method stub
				System.out.println("Mouse is Exit");
			}
		});
		circle.setOnMousePressed(new EventHandler<Event>() {

			@Override
			public void handle(Event arg0) {
				// TODO Auto-generated method stub
				System.out.println("Mouse Press");
			}
		});
		root.getChildren().add(circle);
		stage.setScene(scene);
		stage.show();
		stage.setTitle("Mouse Event JavaKhmer");
	}

}
