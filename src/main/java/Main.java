public class Main {

    public static void main(String[] args) {

        Posters film1 = new Posters("Бладшот.");
        Posters film2 = new Posters("Крушение");
        Posters film3 = new Posters("Мира");
        Posters film4 = new Posters("Человек-неведимка");
        Posters film5 = new Posters("На краю");
        Posters film6 = new Posters("Номер один");


        FilmsManager manager = new FilmsManager();

        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);


        Posters[] all = manager.findLast();
    }
}