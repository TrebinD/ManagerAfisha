public class ManagerAfisha {
    private int maxOutputFilms = 10;

    private DescriptionFilm[] films = new DescriptionFilm[0];

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
        if (films.length <= 0) {
            return films;
        } else {
            int length = films.length - 1;
            int resultLength;
            if (length < maxOutputFilms) {
                resultLength = films.length;
            } else {
                resultLength = maxOutputFilms;
            }
            DescriptionFilm[] tmp = new DescriptionFilm[resultLength];
            for (int i = 0; i < resultLength; i++) {
                int index = films.length - i - 1;
                tmp[i] = films[index];

            }
            films = tmp;
            return films;
        }
    }

    public DescriptionFilm[] findLast(int maxOutputFilms) {
        int length = films.length - 1;
        int resultLength;
        if (length < maxOutputFilms) {
            resultLength = length;
        } else {
            resultLength = maxOutputFilms;
        }
        DescriptionFilm[] tmp = new DescriptionFilm[resultLength];
        for (int i = 0; i < resultLength; i++) {
            int index = films.length - i - 1;
            tmp[i] = films[index];

        }
        films = tmp;
        return films;
    }

}

