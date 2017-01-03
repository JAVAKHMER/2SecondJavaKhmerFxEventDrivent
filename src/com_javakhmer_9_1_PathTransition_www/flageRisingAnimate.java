package com_javakhmer_9_1_PathTransition_www;

import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.util.Duration;

public class flageRisingAnimate extends Application {

	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		Pane pane = new Pane();
		pane.setPadding(new Insets(20));
		ImageView img = new ImageView("javakhmer/CambodiaKingDomOfWonder.gif");
		img.setLayoutX(700);
		img.setLayoutY(200);
		pane.getChildren().add(img);
		PathTransition pt = new PathTransition(Duration.millis(4000),
				new Line(0,200,0,0 ),img);
		pt.setCycleCount(Timeline.INDEFINITE);
		pt.play();
		Scene scene = new Scene(pane,1500,750);
		stage.setScene(scene);
		stage.setTitle("Flage animate java khmer");
		stage.show();
	}

}
