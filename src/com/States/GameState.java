package com.States;

import com.Entities.Creature.Player;
import com.Entities.Static.Dimension;
import com.Entities.Static.Tree;
import com.Graphics.Assets;
import com.Main.Game;
import com.Main.Handler;
import com.Tile.Tile;
import com.World.World;

import java.awt.*;

public class GameState extends State {
    private Player player;
    private World world;
    public GameState(Handler handler) {
        super(handler);
        world=new World(handler,"res/world/world-1.txt");
        handler.setWorld(world);


    }

    @Override
    public void tick() {
        world.tick();
    }

    @Override
    public void render(Graphics g) {
        world.render(g);
    }


}
