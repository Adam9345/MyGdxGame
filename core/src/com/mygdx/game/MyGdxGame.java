package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Preferences;
import com.mygdx.game.screens.SplashScreen;

public class MyGdxGame extends Game {

    public final static String GAME_PREFS = "com.mygdx.game.prefs";
    public final static String GAME_SCORE = "com.mygdx.game.prefs.score";
    public final static String GAME_NAME = "Tutorial Clicker";

    public final static int WIDTH = 480;
    public final static int HEIGHT = 700;

    private boolean paused;

    private int points;

    private Preferences prefs;

    @Override
    public void create() {
        init();
        this.setScreen(new SplashScreen(this));
    }

    private void init() {
        prefs = Gdx.app.getPreferences(GAME_PREFS);
        loadScore();
    }

    private void loadScore() {
        points = prefs.getInteger(GAME_SCORE);
    }

    public void addPoint() {
        points += 1;
        updateSavedScoreInPrefs();
    }

    public void resetGameScore() {
        points = 0;
        updateSavedScoreInPrefs();
    }

    private void updateSavedScoreInPrefs() {
        prefs.putInteger(GAME_SCORE, points);
        prefs.flush();
    }

    /*
     *
     * getters and setters
     *
     */

    public boolean isPaused() {
        return paused;
    }

    public void setPaused(boolean paused) {
        this.paused = paused;
    }

    public int getPoints() {
        return points;
    }
}
