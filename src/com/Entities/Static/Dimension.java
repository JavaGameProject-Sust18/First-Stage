package com.Entities.Static;

import com.Graphics.Assets;
import com.Main.Check;
import com.Main.Handler;
import com.States.MenuState;
import com.States.ProblemState;
import com.States.State;
import com.Tile.Tile;
import com.Tower.Tower;


import javax.swing.*;
import java.awt.*;

public class Dimension extends StaticEntity{
    public Dimension(Handler handler, float x, float y) {
        super(handler, x, y, Tile.TW+68, Tile.TH+105);
        bounds.x=10;
        bounds.y=60;
        bounds.width=width/2+60;
        bounds.height=height/2+10;
    }

    @Override
    public void tick() {

    }
    @Override
    public void passThrough() {
        State.setState(handler.getGame().problemstate);


    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Assets.dimension,(int)(x-handler.getGameCemera().getxOffset()),(int)(y-handler.getGameCemera().getyOffset()),width,height,null);
    }

}
