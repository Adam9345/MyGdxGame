package com.mygdx.game.ui;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.scenes.scene2d.ui.Label;

public class ScoreLabel extends Label {
    public ScoreLabel() {
        super("", prepareLabelStyle());

        init();
    }

    private void init() {
        this.setX(80);
        this.setY(650);
    }

    private static LabelStyle prepareLabelStyle() {
        LabelStyle labelStyle = new LabelStyle();
        labelStyle.font = new BitmapFont();
        labelStyle.fontColor = new Color(Color.BLACK);
        return labelStyle;
    }
}
