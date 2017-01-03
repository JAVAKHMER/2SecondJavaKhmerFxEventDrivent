package com_javakhmer_9_2_FadeTransitionDemo_www;

import javafx.animation.FadeTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;
import javafx.util.Duration;

public class FadeTransitionDemo extends Application {

	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		Pane pane = new Pane();
		Ellipse ell = new Ellipse(10,10,100,0);
		ell.setFill(Color.GREEN);
		ell.setStroke(Color.BLACK);
		ell.centerXProperty().bind(pane.widthProperty().divide(2));
		ell.centerYProperty().bind(pane.heightProperty().divide(2));
		ell.radiusXProperty().bind(pane.widthProperty().multiply(0.4));
		ell.radiusYProperty().bind(pane.heightProperty().multiply(0.4));
		pane.getChildren().add(ell);
		pane.setPadding(new Insets(20));
		FadeTransition ft = new FadeTransition(Duration.millis(1000), ell);
		ft.setFromValue(0.1);
		ft.setToValue(1.0);
		ft.setCycleCount(Timeline.INDEFINITE);
		ft.setAutoReverse(true);
		ft.play();
		Scene scene = new Scene(pane,500,500);
		stage.setScene(scene);
		stage.setTitle("FadeTransitionDemo java khmer ");
		stage.show();
	}

}
