package com_javakhmer_9_1_PathTransition_www;

import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class PathTransitionDemo extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		Pane pane = new Pane();
		
		Rectangle rec = new Rectangle(0,0,50,40);
		rec.setFill(Color.GOLD);
		
		Circle cir = new Circle();
		cir.setRadius(50);
		cir.setStroke(Color.BLACK);
		cir.setFill(Color.WHITE);
		cir.setCenterX(100);
		cir.setCenterY(100);
		
		pane.getChildren().addAll(rec,cir);
		
		PathTransition pt = new PathTransition();
		pt.setDuration(Duration.millis(4000));
		pt.setPath(cir);
		pt.setNode(rec);
		pt.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
		pt.setCycleCount(Timeline.INDEFINITE);
		//pt.setAutoReverse(true);
		pt.play();
		cir.setOnMousePressed(e->pt.pause());
		cir.setOnMouseReleased(e->pt.play());
		
		Scene scene = new Scene(pane,200,200);
		stage.setScene(scene);
		stage.setTitle("PathTransition java khmer");
		stage.show();
	}
}
