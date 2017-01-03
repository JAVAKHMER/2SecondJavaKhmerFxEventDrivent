package com_javakhmer_1a_Handerling_www;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ControlCircle extends Application{
	CirclePane c = new CirclePane();
	public static void main(String[] args) {
		launch(args);
	}
	@SuppressWarnings("static-access")
	@Override
	public void start(Stage stage) throws Exception {
		
		HBox hbox = new HBox();
		Button btnEnlarge = new Button("Enlarge");
		Button btnShrink = new Button("Shrink");
		hbox.setSpacing(10);
		hbox.setAlignment(Pos.CENTER);
		hbox.getChildren().addAll(btnEnlarge,btnShrink);
		btnEnlarge.setOnAction(new Elarge());
		btnShrink.setOnAction(new Shrink());
		BorderPane bp = new BorderPane();
		bp.setCenter(c);
		bp.setBottom(hbox);
		bp.setAlignment(hbox, Pos.CENTER);
		
		Scene scene = new Scene(bp);
		stage.setScene(scene);
		stage.setTitle("Event Handerling java khmer");
		stage.show();
		
	}

	class Elarge implements EventHandler<ActionEvent>{

		@Override
		public void handle(ActionEvent e) {
			// TODO Auto-generated method stub
			c.elarge();
		}
	}
	class Shrink implements EventHandler<ActionEvent>{

		@Override
		public void handle(ActionEvent arg0) {
			// TODO Auto-generated method stub
			c.shrink();
		}
		
	}
}

class CirclePane extends StackPane{
	Circle circle = new Circle(50);
	public CirclePane() {
		// TODO Auto-generated constructor stub
		this.getChildren().add(circle);
		circle.setStroke(Color.BLACK);
		circle.setFill(Color.WHITE);
	}
	public void elarge(){
		circle.setRadius(circle.getRadius() + 2);
	}
	public void shrink(){
		circle.setRadius(circle.getRadius() - 2);
	}
}
