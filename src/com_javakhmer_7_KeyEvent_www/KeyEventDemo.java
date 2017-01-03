package com_javakhmer_7_KeyEvent_www;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class KeyEventDemo extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		Pane pane = new Pane();
		Text text = new Text(20,20,"Java khmer");
		pane.getChildren().add(text);
		text.setOnKeyPressed(e->{
			switch(e.getCode()){
			case DOWN: text.setY(text.getY() + 10);break;
			case UP: text.setY(text.getY() - 10);break;
			case LEFT: text.setX(text.getX() -10);break;
			case RIGHT:text.setX((text.getX() + 10));break;
			case TAB: text.setX(text.getX()+50);break;
			case ENTER:text.setY(text.getY()+10);break;
			default: if(Character.isLetterOrDigit(e.getText().charAt(0)))
			{
				text.setText(e.getText());
			}
			}
		});
		Scene scene = new Scene(pane,200,200);
		arg0.setScene(scene);
		arg0.setTitle("Key Event");
		arg0.show();
		text.requestFocus();
	}

}
