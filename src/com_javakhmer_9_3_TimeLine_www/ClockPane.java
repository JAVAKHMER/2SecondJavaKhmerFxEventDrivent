package com_javakhmer_9_3_TimeLine_www;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class ClockPane extends Pane{
	private int hour;
	private int minute;
	private int second;
	private double h = 250 ;
	private double w = 250 ;
	public ClockPane() {
		// TODO Auto-generated constructor stub
		setCurrentTime();
	}
	public ClockPane(int hour , int minute , int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	public int getHour(){
		return hour;
	}
	public int getMinute(){
		return minute;
	}
	public int getSecond(){
		return second;
	}
	public double getW(){
		return w;
	}
	public double getH(){
		return h;
	}
	public void setHour(int h)
	{
		hour =h;
		paintClock();
	}
	public void setMinute(int m){
		minute = m ;
		paintClock();
	}
	public void setSecond(int s){
		second = s;
		paintClock();
	}
	public void setW(double d){
		w = d;
		paintClock();
	}
	public void setH(double d){
		h = d ;
		paintClock();
	}
	public void setCurrentTime(){
		// Construct a calendar for the current date and time
		Calendar calendar = new GregorianCalendar();
		
		// Set current hour, minute and second
		this.hour = calendar.get(Calendar.HOUR_OF_DAY);
		this.minute = calendar.get(Calendar.MINUTE);
		this.second = calendar.get(Calendar.SECOND);
		
		paintClock(); // Repaint the clock
		
	}
	protected void paintClock(){
		double clockRadius = Math.min(w	, h ) * 0.8 * 0.5;
		double centerX = w/2;
		double centerY = h/2;
		Circle circle = new Circle(centerX, centerY, clockRadius);
		 circle.setFill(Color.WHITE);
		 circle.setStroke(Color.BLACK);
		 
		 Text t1 = new Text(centerX + clockRadius*Math.cos(Math.PI/3) - 10 , 
				            centerY - clockRadius*Math.sin(Math.PI/3) + 10
				            ,"1");
		 
		 Text t2 = new Text( centerX + clockRadius*Math.cos(Math.PI/6) - 10
				 			, centerY - clockRadius*Math.sin(Math.PI/6) + 10
				 			,"2");
		 
		 Text t3 = new Text(centerX + clockRadius - 10, centerY + 3,"3");
		 
		 Text t4 = new Text( centerX + clockRadius*Math.cos(-Math.PI/6) - 10
		 			, centerY - clockRadius*Math.sin(-Math.PI/6)
				 			, "4");
		 
		 Text t5 = new Text(centerX + clockRadius*Math.cos(-Math.PI/3) - 10 , 
		            centerY - clockRadius*Math.sin(-Math.PI/3) 
		            ,"5");
		 Text t6 = new Text(centerX - 3, centerY + clockRadius - 3,"6");
		 
		 Text t7 = new Text(centerX - clockRadius*Math.cos(Math.PI/3)  , 
		            centerY + clockRadius*Math.sin(Math.PI/3) 
		            ,"7");
		 Text t8 = new Text( centerX - clockRadius*Math.cos(Math.PI/6) 
		 			, centerY + clockRadius*Math.sin(Math.PI/6) 
		 			,"8"); 
		 
		 Text t9 = new Text(centerX - clockRadius + 3, centerY + 5,"9");
		 
		 Text t10 = new Text( centerX - clockRadius*Math.cos(Math.PI/6) 
		 			, centerY - clockRadius*Math.sin(Math.PI/6) + 10
		 			,"10");
		 
		 Text t11 = new Text(centerX - clockRadius*Math.cos(Math.PI/3)  , 
		            centerY - clockRadius*Math.sin(Math.PI/3) + 10
		            ,"11");
		 Text t12 = new Text(centerX - 5, centerY - clockRadius + 12,"12");
		 
		 Text javakhmer = new Text(centerX - 50 , centerY - clockRadius - 10 , "JAVA KHMER");
		 javakhmer.setFill(Color.GREEN);
		 javakhmer.setFont(new Font(20));
		 // Draw second hand
		 double sLength = clockRadius * 0.8;
		 double secondX = centerX + sLength * 
		 Math.sin(second * (2* Math.PI / 60));
		 double secondY = centerY - sLength * 
		 Math.cos(second * (2* Math.PI / 60));
		 Line sLine = new Line(centerX, centerY, secondX, secondY); 
		 sLine.setStroke(Color.RED);
		
		 // Draw minute hand
		 double mLength = clockRadius * 0.65;
		 double xMinute = centerX + mLength * 
		 Math.sin(minute * (2* Math.PI / 60));
		 double minuteY = centerY - mLength * 
		 Math.cos(minute * (2* Math.PI / 60));
		 Line mLine = new Line(centerX, centerY, xMinute, minuteY); 
		 mLine.setStroke(Color.BLUE);
		
		 // Draw hour hand
		 double hLength = clockRadius * 0.5;
		 double hourX = centerX + hLength * 
		 Math.sin((hour % 12+ minute / 60.0) * (2* Math.PI / 12));
		 double hourY = centerY - hLength *
		 Math.cos((hour % 12+ minute / 60.0) * (2* Math.PI / 12));
		 Line hLine = new Line(centerX, centerY, hourX, hourY); 
		 hLine.setStroke(Color.GREEN);
		
		 getChildren().clear();
		  getChildren().addAll(circle, t1 , t2 , t3 , t4 , t5 , t6 ,
				  t7 , t8 , t9 , t10 , t11, t12 , javakhmer , sLine, mLine, hLine);
	}
}
