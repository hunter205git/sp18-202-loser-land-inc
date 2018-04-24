package com.loserland.actors;
import com.loserland.configs.Config;
import com.loserland.configs.ConfigFactory;
import com.loserland.context.GameContext;
import greenfoot.*;
import greenfoot.GreenfootImage;

public class PauseState extends Actor implements State {
    private Config config = ConfigFactory.getInstance().getConfig(GameContext.GAME_DEFAULT_CONFIG_FILENAME);

    public void PauseState(){

    }

    public void act() {


    }

    public GreenfootImage getImage(){
        return new GreenfootImage(config.get(GameContext.PLAYER_PLAY_IMG));
    }

    public void doAction(Musicplayer musicplayer) {
        musicplayer.setState(this);
    }
}