import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManagerAfishaTest {
    ManagerAfisha managerAfisha = new ManagerAfisha();
    DescriptionFilm films1 = new DescriptionFilm(1, "Бладшот", "Боевик");
    DescriptionFilm films2 = new DescriptionFilm(2, "Вперед", "Мультфильм");
    DescriptionFilm films3 = new DescriptionFilm(3, "Отель Белград", "Комедия");
    DescriptionFilm films4 = new DescriptionFilm(4, "Джентельмены", "Боевик");
    DescriptionFilm films5 = new DescriptionFilm(5, "Человек-невидимка", "Ужасы");
    DescriptionFilm films6 = new DescriptionFilm(6, "Тролли. Мировой тур", "Мультфильм");
    DescriptionFilm films7 = new DescriptionFilm(7, "Номер один", "Комедия");
    DescriptionFilm films8 = new DescriptionFilm(8, "Флэш", "Фэнтези");
    DescriptionFilm films9 = new DescriptionFilm(9, "Человек паук", "Боевик");
    DescriptionFilm films10 = new DescriptionFilm(10, "Брат", "Боевик");
    DescriptionFilm films11 = new DescriptionFilm(11, "Фантом", "Фэнтези");

    @BeforeEach
    public void setUp() {
        managerAfisha.addFilms(films1);
        managerAfisha.addFilms(films2);
        managerAfisha.addFilms(films3);
        managerAfisha.addFilms(films4);
    }


    @Test
    public void myTest() {

        DescriptionFilm[] expected = new DescriptionFilm[]{films1, films2, films3, films4};
        DescriptionFilm[] actual = managerAfisha.findAll();

        assertArrayEquals(expected, actual);

    }

    @Test
    public void findAllDefaultLimit() {

        managerAfisha.addFilms(films5);
        managerAfisha.addFilms(films6);
        managerAfisha.addFilms(films7);
        managerAfisha.addFilms(films8);
        managerAfisha.addFilms(films9);
        managerAfisha.addFilms(films10);
        managerAfisha.addFilms(films11);

        managerAfisha.findLast();
        DescriptionFilm[] expected = new DescriptionFilm[]{films11, films10, films9, films8, films7, films6, films5, films4, films3, films2};
        DescriptionFilm[] actual = managerAfisha.findAll();

        assertArrayEquals(expected, actual);

    }

    @Test
    public void findAllUpDefaultLimitLengthArray() {

        managerAfisha.addFilms(films5);
        managerAfisha.addFilms(films6);
        managerAfisha.addFilms(films7);
        managerAfisha.addFilms(films8);
        managerAfisha.addFilms(films9);
        managerAfisha.addFilms(films10);
        managerAfisha.addFilms(films11);


        DescriptionFilm[] output = managerAfisha.findLast();
        int actual = output.length;
        int expected = 10;
        assertEquals(expected, actual);

    }

    @Test
    public void findAllDefaultLimitLengthArray() {

        managerAfisha.addFilms(films5);
        managerAfisha.addFilms(films6);
        managerAfisha.addFilms(films7);
        managerAfisha.addFilms(films8);
        managerAfisha.addFilms(films9);
        managerAfisha.addFilms(films10);


        DescriptionFilm[] output = managerAfisha.findLast();
        int actual = output.length;
        int expected = 10;
        assertEquals(expected, actual);

    }

    @Test
    public void findAllDownDefaultLimitLengthArray() {

        managerAfisha.addFilms(films5);
        managerAfisha.addFilms(films6);
        managerAfisha.addFilms(films7);
        managerAfisha.addFilms(films8);
        managerAfisha.addFilms(films9);

        DescriptionFilm[] output = managerAfisha.findLast();
        int actual = output.length;
        int expected = 9;
        assertEquals(expected, actual);

    }


    @Test
    public void findAllDownDefaultLimitLenghthArray() {

        DescriptionFilm[] output = managerAfisha.findLast();

        int actual = output.length;
        int expected = 4;


        assertEquals(expected, actual);

    }

    @Test
    public void findAllDownDefaultLimitLenghthArrayNull() {

        DescriptionFilm[] clean = managerAfisha.cleanAll();

        DescriptionFilm[] output = managerAfisha.findLast();

        int actual = output.length;
        int expected = 0;


        assertEquals(expected, actual);

    }

    @Test
    public void findAllOneFilm() {

        DescriptionFilm[] clean = managerAfisha.cleanAll();

        managerAfisha.addFilms(films7);

        DescriptionFilm[] output = managerAfisha.findLast();

        int actual = output.length;
        int expected = 1;


        assertEquals(expected, actual);

    }


    @Test
    public void findAllLimit() {
        ManagerAfisha managerAfisha = new ManagerAfisha(5);
        managerAfisha.addFilms(films5);
        managerAfisha.addFilms(films6);
        managerAfisha.addFilms(films7);
        managerAfisha.addFilms(films8);
        managerAfisha.addFilms(films9);
        managerAfisha.addFilms(films10);
        managerAfisha.addFilms(films11);

        DescriptionFilm[] input = new DescriptionFilm[]{films7, films8, films9, films10, films11,};
        DescriptionFilm[] output = managerAfisha.findLast();
        int actual = output.length;
        int expected = 5;

        assertEquals(expected, actual);

    }

    @Test
    public void findAllDownLimitLenghthArray() {
        ManagerAfisha managerAfisha = new ManagerAfisha(5);
        managerAfisha.addFilms(films5);
        managerAfisha.addFilms(films6);
        managerAfisha.addFilms(films7);
        managerAfisha.addFilms(films8);

        DescriptionFilm[] output = managerAfisha.findLast();

        int actual = output.length;
        int expected = 4;


        assertEquals(expected, actual);

    }

}

