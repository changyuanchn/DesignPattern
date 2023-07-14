package com.changyuan.MVCDemo;

import javax.swing.*;

public class BeatBar extends JProgressBar implements Runnable {
    private static final long serialVersionUID = 2L;
    JProgressBar processBar;
    Thread thread;

    public BeatBar() {
        thread = new Thread(this);
        setMaximum(100);
        thread.start();
    }
    public void run() {
        for(;;) {
            int value = getValue();
            value = (int) (value * 0.75);
            setValue(value);
            repaint();
            try {
                Thread.sleep(50);
            } catch (Exception e) {}
        }
    }
}
