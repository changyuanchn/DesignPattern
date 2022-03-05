package com.changyuan.FacadePattern;

import com.changyuan.FacadePattern.components.Amplifirer;
import com.changyuan.FacadePattern.components.DvdPlayer;
import com.changyuan.FacadePattern.components.Tuner;

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
