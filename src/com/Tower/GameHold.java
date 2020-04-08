package com.Tower;

import com.Display.Display;
import com.Graphics.Assets;
import com.Main.Handler;
import com.States.GameState;
import com.States.State;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameHold extends State implements ActionListener{
	private static JFrame gameFrame = new JFrame();
	public static Handler handler;
   
    public GameHold(Handler handler) {
        super(handler);
        this.handler=handler;
        run();
        call(4);
    }

    public static void sevisiblex(){
    	gameFrame.setVisible(false);
    }
    public static void setstate(){
        State.setState(handler.getGame().gamestate);
    }
    public void run(){
        gameFrame.setSize(900, 700);
        gameFrame.setUndecorated(true);
        gameFrame.getRootPane().setWindowDecorationStyle(JRootPane.NONE);
        gameFrame.setResizable(false);
        gameFrame.setLocationRelativeTo(null); 
        gameFrame.setVisible(true);

    } 
   
    public  void call(int level) {
    	System.out.println("inside call: " + level);
        Tower t =new Tower();
        gameFrame.getContentPane().add(t);
        //gameFrame.setUndecorated(true);
        gameFrame.getRootPane().setWindowDecorationStyle(JRootPane.NONE);
    }

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
	}

    @Override
    public void tick() {
    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.BLACK);
        //g.drawImage(Assets.grass,0,0,900,700,null);
    }

}