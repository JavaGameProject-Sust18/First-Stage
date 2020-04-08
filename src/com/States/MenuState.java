package com.States;

import com.Graphics.Assets;
import com.Main.Game;
import com.Main.Handler;
import com.Tile.ui.ClickListener;
import com.Tile.ui.UiImageButton;
import com.Tile.ui.UiManager;

import java.awt.*;

public class MenuState extends State {
    private UiManager uiManager;
    public MenuState(Handler handler) {
        super(handler);
        uiManager=new UiManager(handler);
        handler.getMouseManager().setUiManager(uiManager);
        uiManager.addObject(new UiImageButton(380, 250, 128, 64, Assets.button[0], new ClickListener() {
            @Override
            public void onClick() {
                State.setState(handler.getGame().gamestate);
            }
        }));
    }

    @Override
    public void tick() {
        uiManager.tick();
        //handler.getMouseManager().setUiManager(null);
        //State.setState(handler.getGame().gamestate);
    }

    @Override
    public void render(Graphics g) {
        uiManager.render(g);
    }
}
