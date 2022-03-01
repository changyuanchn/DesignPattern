package com.changyuan.facadeDemo;

import com.changyuan.facadeDemo.components.Amplifirer;
import com.changyuan.facadeDemo.components.DvdPlayer;
import com.changyuan.facadeDemo.components.Tuner;

public class HomeTheaterFacade {
    Amplifirer amplifirer;
    Tuner tuner;
    DvdPlayer dvdPlayer;

    public HomeTheaterFacade(Amplifirer amplifirer,
                             Tuner tuner,
                             DvdPlayer dvdPlayer) {
        this.amplifirer = amplifirer;
        this.tuner = tuner;
        this.dvdPlayer = dvdPlayer;
    }

    public void watchMovie() {
        amplifirer.on();
        tuner.on();
        dvdPlayer.on();
    }

    public void endMovie() {
        amplifirer.off();
        tuner.off();
        dvdPlayer.off();
    }
}
