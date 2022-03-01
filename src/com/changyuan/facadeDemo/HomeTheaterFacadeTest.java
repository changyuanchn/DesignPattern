package com.changyuan.facadeDemo;

import com.changyuan.facadeDemo.components.Amplifirer;
import com.changyuan.facadeDemo.components.DvdPlayer;
import com.changyuan.facadeDemo.components.Tuner;

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
