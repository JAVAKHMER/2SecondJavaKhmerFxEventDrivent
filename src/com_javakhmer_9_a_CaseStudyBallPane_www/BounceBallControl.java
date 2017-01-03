package com_javakhmer_9_a_CaseStudyBallPane_www;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;

public class BounceBallControl extends Application  {

	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		CaseStudyBallPane pane = new CaseStudyBallPane();
		pane.setOnMousePressed(e->pane.play());
		pane.setOnMouseReleased(e->pane.pause());
		pane.setOnKeyPressed(e->{
			if(e.getCode() == KeyCode.UP){
				pane.incressSpeed();
			}
			else if(e.getCode() == KeyCode.DOWN){
				pane.descressSpeed();
			}
		});
		Scene scene = new Scene(pane);
		stage.setScene(scene);
		stage.show();
		pane.requestFocus();
	}
}
