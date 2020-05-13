package com.example.android.popularmovies_2.utils;

import java.util.concurrent.Executor;

public class MovieExecutor implements Executor {
    @Override
    public void execute(Runnable runnable) {
        new Thread(runnable).start();
    }
}
