import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ManagerFilmsTest {

    @Test
    public void test() {
        ManagerFilms manager = new ManagerFilms();

        manager.addFilms("Film I");
        manager.addFilms("Film II");
        manager.addFilms("Film III");

        String[] expected = {"Film I", "Film II", "Film III"};
        String[] actual = manager.findLast();
    }
}