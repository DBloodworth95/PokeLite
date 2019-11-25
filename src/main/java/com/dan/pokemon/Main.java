package com.dan.pokemon;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class Main {

    public static void main(String[] args) {
        LwjglApplicationConfiguration configuration = new LwjglApplicationConfiguration();
        configuration.height = 400;
        configuration.width = 600;
        configuration.vSyncEnabled = true;
        new LwjglApplication(new Pokemon(), configuration);
    }
}
