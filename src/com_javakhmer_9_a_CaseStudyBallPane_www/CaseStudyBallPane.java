package com_javakhmer_9_a_CaseStudyBallPane_www;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.beans.property.DoubleProperty;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

public class CaseStudyBallPane extends Pane{
	private final double radius = 20;
	private double x = radius , y =  radius;
	private double dy = 1 , dx = 1;
	private Timeline animate;
	private Circle  circle = new Circle(x , y , radius);
	public CaseStudyBallPane() {
		// TODO Auto-generated constructor stub
		circle.setStroke(Color.BLACK);
		circle.setFill(Color.GREEN);
		this.getChildren().add(circle);
		animate = new Timeline(new KeyFrame(Duration.millis(1000), e->moveBall()));
		animate.setCycleCount(Timeline.INDEFINITE);
		animate.play();
	}
	public void play(){
		animate.play();
	}
	public void pause(){
		animate.pause();
	}
	public void incressSpeed(){
		animate.setRate(animate.getRate()+0.1);
	}
	public void descressSpeed(){
		animate.setRate(animate.getRate() >0?animate.getRate()-0.1 : 0);
	}
	public DoubleProperty rateProperty(){
		return animate.rateProperty();
	}
	protected void moveBall(){
		if(x<radius || x > getWidth() - radius)
			dx *= -1;
		if(x < radius || y >getHeight() - radius)
			dy *= -1;
		x+=dx;
		y+=dy;
		circle.setCenterX(x);
		circle.setCenterY(y);
	}
}
