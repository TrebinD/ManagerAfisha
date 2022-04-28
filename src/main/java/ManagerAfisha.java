public class ManagerAfisha {


    private DescriptionFilm[] films = new DescriptionFilm[0];
    private int maxOutputFilms = 10;

    public ManagerAfisha() {

    }

    public ManagerAfisha(int maxOutputFilms) {
        this.maxOutputFilms = maxOutputFilms;
    }

    ;

    public DescriptionFilm[] addFilms(DescriptionFilm film) {
        int lenght = films.length + 1;
        DescriptionFilm[] tmp = new DescriptionFilm[lenght];
        for (int i = 0; i < films.length; i++) {
//
            tmp[i] = films[i];
        }
        int lastInedex = tmp.length - 1;
        tmp[lastInedex] = film;
        films = tmp;
        return films;

    }

    public DescriptionFilm[] cleanAll() {
        DescriptionFilm[] tmp = new DescriptionFilm[0];
        films = tmp;
        return films;
    }

    public DescriptionFilm[] findAll() {
        return films;
    }

    public DescriptionFilm[] findLast() {
        int length;
        if (films.length <= maxOutputFilms) {
            length = films.length;
        } else {
            length = maxOutputFilms;
        }
//        int resultLength = length -1;
        DescriptionFilm[] tmp = new DescriptionFilm[length];
        for (int i = 0; i < length; i++) {
            int index = films.length - i - 1;
            tmp[i] = films[index];

        }
        films = tmp;
        return films;
    }
}

