package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {

    @Test
    public void findAllTest() {
        String film1 = "Film1";
        String film2 = "Film2";
        String film3 = "Film3";

        FilmManager manager = new FilmManager();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);

        String[] expected = {"Film1","Film2","Film3"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastTest() {
        String film1 = "Film1";
        String film2 = "Film2";
        String film3 = "Film3";
        String film4 = "Film4";


        FilmManager manager = new FilmManager();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);


        String[] expected = {"Film4","Film3","Film2","Film1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void findLastBorderTest() {
        String film1 = "Film1";
        String film2 = "Film2";
        String film3 = "Film3";
        String film4 = "Film4";
        String film5 = "Film5";
        String film6 = "Film6";
        String film7 = "Film7";
        String film8 = "Film8";
        String film9 = "Film9";
        String film10 = "Film10";


        FilmManager manager = new FilmManager();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);
        manager.addFilm(film8);
        manager.addFilm(film9);
        manager.addFilm(film10);


        String[] expected = {"Film10","Film9","Film8","Film7","Film6","Film5","Film4","Film3","Film2","Film1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void findLastBehindLimitTest() {
        String film1 = "Film1";
        String film2 = "Film2";
        String film3 = "Film3";
        String film4 = "Film4";
        String film5 = "Film5";
        String film6 = "Film6";
        String film7 = "Film7";
        String film8 = "Film8";
        String film9 = "Film9";
        String film10 = "Film10";
        String film11 = "Film11";


        FilmManager manager = new FilmManager();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);
        manager.addFilm(film8);
        manager.addFilm(film9);
        manager.addFilm(film10);
        manager.addFilm(film11);


        String[] expected = {film11,film10,film9,film8,film7,film6,film5,film4,film3,film2};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }



}
