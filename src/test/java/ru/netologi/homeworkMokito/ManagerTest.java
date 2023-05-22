package ru.netologi.homeworkMokito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerTest {

    @Test
    public void movieAddTest() {
        FilmsManager manager = new FilmsManager();
        manager.add("Movie I");
        manager.add("Movie II");
        manager.add("Movie III");
        manager.add("Movie IV");

        String[] actual = manager.findAll();
        String[] expected = {"Movie I", "Movie II", "Movie III", "Movie IV"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void emptyListMovieTest() {
        FilmsManager manager = new FilmsManager();
        String[] actual = manager.findAll();
        String[] expected = {};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addMInMovieTest() {
        FilmsManager manager = new FilmsManager();
        manager.add("Movie I");
        String[] actual = manager.findAll();
        String[] expected = {"Movie I"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastMovieTest() {
        FilmsManager manager = new FilmsManager();
        manager.add("Movie I");
        manager.add("Movie II");
        manager.add("Movie III");
        String[] actual = manager.findLast();
        String[] expected = {"Movie III", "Movie II", "Movie I"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastMovieMoreFiveTest() {
        FilmsManager manager = new FilmsManager();
        manager.add("Movie I");
        manager.add("Movie II");
        manager.add("Movie III");
        manager.add("Movie IV");
        manager.add("Movie V");
        manager.add("Movie VI");
        String[] actual = manager.findLast();
        String[] expected = {"Movie VI", "Movie V", "Movie IV", "Movie III", "Movie II"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastMovieLimitTest() {
        FilmsManager manager = new FilmsManager(4);
        manager.add("Movie I");
        manager.add("Movie II");
        manager.add("Movie III");
        manager.add("Movie IV");
        String[] actual = manager.findLast();
        String[] expected = {"Movie IV", "Movie III", "Movie II", "Movie I"};
    }
}
