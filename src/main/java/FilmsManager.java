public class FilmsManager {
    private Posters[] films = new Posters[0];
    private int limit;

    public FilmsManager() {
        limit = 10;
    }

    public FilmsManager(int limit) {
        this.limit = limit;
    }


    public void addFilm(Posters film) {
        Posters[] tmp = new Posters[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public Posters[] findLast() {
        int resultLenght;
        if (films.length < 10) {
            resultLenght = films.length;
        } else {
            resultLenght = 10;
        }
        Posters[] tmp=new Posters[resultLenght];
        for (int i=0; i<films.length; i++){
            tmp[i]=films[films.length-1-i];
        }
        return tmp;
    }

    public Posters[] findAll() {
        return films;
    }

}