import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilmsManagerTest {

    Posters film1 = new Posters("Бладшот.");
    Posters film2 = new Posters("Крушение");
    Posters film3 = new Posters("Мира");
    Posters film4 = new Posters("Человек-неведимка");
    Posters film5 = new Posters("На краю");
    Posters film6 = new Posters("Номер один");
    Posters film7 = new Posters("Для теста");

    @Test
    public void findLast() {
        FilmsManager manager = new FilmsManager();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);


        Posters[] actual = manager.findLast();
        Posters[] expected = {film6, film5, film4, film3, film2, film1};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void findOneLast() {
        FilmsManager manager = new FilmsManager();
        manager.addFilm(film1);


        Posters[] actual = manager.findLast();
        Posters[] expected = {film1};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void findFiveLast() {
        FilmsManager manager = new FilmsManager();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);


        Posters[] actual = manager.findLast();
        Posters[] expected = {film5, film4, film3, film2, film1};

        assertArrayEquals(actual, expected);
    }


    @Test
    public void findZeroLast() {
        FilmsManager manager = new FilmsManager();


        Posters[] actual = manager.findLast();
        Posters[] expected = {};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void findAll() {
        FilmsManager manager = new FilmsManager();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);


        Posters[] actual = manager.findAll();
        Posters[] expected = {film1, film2, film3, film4, film5, film6};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void findMoreBySix() {
        FilmsManager manager = new FilmsManager();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);


        Posters[] actual = manager.findAll();
        Posters[] expected = {film1, film2, film3, film4, film5, film6, film7};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void findLastMoreBySix() {
        FilmsManager manager = new FilmsManager();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);

        Posters[] actual = manager.findLast();
        Posters[] expected = {film7, film6, film5, film4, film3, film2, film1};

        assertArrayEquals(actual, expected);
    }

    @Test
    void addFilm() {
    }

    @Test
    void testFindLast() {
    }

    @Test
    void testFindAll() {
    }
}