public class ManagerFilms {
    private String[] films = new String[0];
    private int limit;

    public void ManagerFilms() {
        this.limit = 10;

    }

    public void ManagerFilms(int limit) {
        this.limit = limit;

    }

    public void addFilms(String film){
        String[] tmp = new String[films.length+1];
        for (int i = 0; i < films.length; i++) {
            tmp[i]= films[i];
            films = tmp;

        }
        tmp[tmp.length - 1] = film;

    }
    public  String[] findAll() {
        return films;
    }

    public  String[] findLast() {
        int resultLenght;
        if (films.length < limit) {
            resultLenght = films.length;
        } else {
            resultLenght = limit;
        }
        String[] tmp = new String[resultLenght];
        for (int i = 0; i < tmp.length; i++) {
            tmp[1] = films[films.length -1 - i];

        }
        return tmp;
    }
}


