package com_javakhmer_9_3_TimeLine_www;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class MainClock extends Application{

	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		ClockPane clockpane = new ClockPane();
		@SuppressWarnings("unused") 
		String timeString = clockpane.getHour() + ":" + clockpane.getMinute()+
				":" + clockpane.getSecond();
		BorderPane pane = new BorderPane();
		pane.setCenter(clockpane);
		pane.widthProperty().addListener(ov->{
			clockpane.setW(pane.getWidth());
		});
		pane.heightProperty().addListener(ov->{
			clockpane.setH(pane.getHeight());
		});
		EventHandler<ActionEvent> eventHandler = e->{
			  clockpane.setCurrentTime();  
		};
		Timeline tl = new Timeline(new KeyFrame(Duration.millis(1000), eventHandler));
		tl.setCycleCount(Timeline.INDEFINITE);
		tl.play();
		Scene scene = new Scene(pane,250,250);
		stage.setScene(scene);
		stage.setTitle("clock java khmer");
		stage.show();
	}

}
