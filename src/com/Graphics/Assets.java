package com.Graphics;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Assets {
    private static int width=50;
    private static float height=51.25f;
    public static Font font28;
    public static BufferedImage grass,rock,tree,rock1,stone,TWood,SRock,dimension,tower,loadImage,image,cave;
    public static BufferedImage[] player_down,player_up,player_left,player_right,police_down,police_up,police_left,police_right;
    public static BufferedImage[] button;
    public static BufferedImage coin;
    public static BufferedImage inventoryScreen;
    public static void init(){
        police_up=new BufferedImage[4];
        police_down=new BufferedImage[4];
        police_left=new BufferedImage[4];
        police_right=new BufferedImage[4];
        Spritesheet police=new Spritesheet(ImageLoader.loadImage("/texture/police.png"));
        for(int i=0;i<4;i++) {
            police_up[i] = police.crop(64*i, 0, 64,82);
        }
        for(int i=0;i<4;i++) {
            police_left[i] = police.crop(64*i, 82, 64,82);
        }
        for(int i=0;i<4;i++) {
            police_right[i] = police.crop(64*i, 82*2, 64, 82);
        }
        for(int i=0;i<4;i++) {
            police_down[i] = police.crop(64*i, 82*3, 64,82);
        }



        Spritesheet c=new Spritesheet(ImageLoader.loadImage("/texture/cave.png"));
        cave=c.crop(0,0,771,490);
        Spritesheet im=new Spritesheet(ImageLoader.loadImage("/images/untitle.jpg"));
        image=im.crop(0,0,800,596);
        Spritesheet img=new Spritesheet(ImageLoader.loadImage("/images/loadgame.jpg"));
        loadImage=img.crop(0,0,200,45);
        Spritesheet Tower=new Spritesheet(ImageLoader.loadImage("/images/Towers-of-Hanoi.png"));
        tower=Tower.crop(0,0,548,548);

        Spritesheet Coin=new Spritesheet(ImageLoader.loadImage("/texture/gem1.png"));
        coin=Coin.crop(0,0,521,512);
        Spritesheet D=new Spritesheet(ImageLoader.loadImage("/texture/door.png"));
        dimension=D.crop(0,0,64,64);
        font28=FontLoader.loadFont("res/fonts/slkscr.ttf",28);
        inventoryScreen=ImageLoader.loadImage("/texture/inventoryScreen.png");
        Spritesheet a=new Spritesheet(ImageLoader.loadImage("/texture/wood-1.png"));
        TWood=a.crop(0,0,52,74);
        Spritesheet b=new Spritesheet(ImageLoader.loadImage("/texture/small-rock.png"));
        SRock=b.crop(0,0,100,100);
        Spritesheet wood=new Spritesheet(ImageLoader.loadImage("/texture/wood.png"));
        stone=wood.crop(0,0,107,111);
        Spritesheet btn=new Spritesheet(ImageLoader.loadImage("/texture/button.png"));
        button=new BufferedImage[2];
        button[0]=btn.crop(0,0,302,82);
        button[1]=btn.crop(0,82,302,82);
        Spritesheet sheet=new Spritesheet(ImageLoader.loadImage("/texture/player.png"));
        player_down=new BufferedImage[5];
        player_up=new BufferedImage[5];
        player_left=new BufferedImage[5];
        player_right=new BufferedImage[5];

        for(int i=0;i<5;i++) {
            player_up[i] = sheet.crop(width*i, 0, width, (int)height);
        }
        for(int i=0;i<5;i++) {
            player_down[i] = sheet.crop(width*i, (int)height, width,(int) height);
        }
        for(int i=0;i<5;i++) {
            player_right[i] = sheet.crop(width*i, (int)height*2, width, (int)height);
        }
        for(int i=0;i<5;i++) {
            player_left[i] = sheet.crop(width*i, (int)height*3, width,(int) height);
        }

        Spritesheet Grass=new Spritesheet(ImageLoader.loadImage("/texture/grass.png"));
        Spritesheet Rock=new Spritesheet(ImageLoader.loadImage("/texture/rock.png"));
        Spritesheet Rock1=new Spritesheet(ImageLoader.loadImage("/texture/rock-1.png"));
        Spritesheet Tree=new Spritesheet(ImageLoader.loadImage("/texture/tree.png"));
        grass=Grass.crop(0,0,250,250);
        rock=Rock.crop(0,0,71,71);
        rock1=Rock1.crop(0,0,71,71);
        tree=Tree.crop(0,0,250,250);

    }
}
