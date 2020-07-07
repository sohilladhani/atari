package com.sohilladhani.atari.tetris;

import javafx.application.Application;
import javafx.stage.Stage;

public class Tetris extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Tetris");
        stage.show();
    }
}
