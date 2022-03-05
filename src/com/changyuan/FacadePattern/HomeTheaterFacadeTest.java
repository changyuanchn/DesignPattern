package com.changyuan.FacadePattern;

import com.changyuan.FacadePattern.components.Amplifirer;
import com.changyuan.FacadePattern.components.DvdPlayer;
import com.changyuan.FacadePattern.components.Tuner;

public class HomeTheaterFacadeTest {
    public static void main(String[] args) {
        Amplifirer amplifirer = new Amplifirer();
        Tuner tuner = new Tuner();
        DvdPlayer dvdPlayer = new DvdPlayer();
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(amplifirer, tuner, dvdPlayer);
        homeTheaterFacade.watchMovie();
        homeTheaterFacade.endMovie();
    }
}
