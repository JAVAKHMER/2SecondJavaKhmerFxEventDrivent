package com_javakhmer_9_b_2_ChangingTextFonts_www;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Reflection;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ChangingTextFonts extends Application {

	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle(" Changing Text Fonts java khemr"); 
		Pane pane = new Pane(); 
		Scene scene = new Scene(pane, 550, 250, Color.WHITE); 
		Text text2 = new Text(200, 90, "Java khmer 1"); 
		Font serif = Font.font("Serif", 30); 
		text2.setFont(serif); 
		text2.setFill(Color.RED); 
		DropShadow dropShadow = new DropShadow(); 
		dropShadow.setOffsetX(8.0f); 
		dropShadow.setOffsetY(8.0f); 
		dropShadow.setColor(Color.rgb(50, 50, 50, .588)); 
		text2.setEffect(dropShadow); 
		text2.setRotate(90);
		pane.getChildren().add(text2); 
		// SanSerif 
		Text text3 = new Text(50, 100, "Java khmer 2"); 
		Font sanSerif = Font.font("SanSerif", 30); 
		text3.setFont(sanSerif); 
		text3.setFill(Color.BLUE); 
		pane.getChildren().add(text3); 
		Text text4 = new Text(50, 150, "Java khmer 3"); 
		Font dialogFont = Font.font("Dialog", 30); 
		text4.setFont(dialogFont); 
		text4.setFill(Color.rgb(0, 255, 0)); 
		pane.getChildren().add(text4); 
		Text text5 = new Text(50, 200, "Java khmer 4"); 
		Font AlgerianFont = Font.font("Algerian", 30); 
		text5.setFont(AlgerianFont); 
		text5.setFill(Color.rgb(0, 255, 0)); 
		pane.getChildren().add(text5); 
		Reflection refl = new Reflection(); 
		refl.setFraction(1.0f); 
		text5.setEffect(refl); 
		primaryStage.setScene(scene); 
		primaryStage.show(); 
	}

	public static void main(String[] args) {
		launch(args);
	}
}
