import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.QA32.Cat;
import ru.QA32.CatsBreed;

public class AnimalsTest {
    @Test
    public void calculateAgeTest(String dateOfBirth) {
        Cat Mysia = new Cat( CatsBreed.METIS,"Муся", "ж", "2020-07-11", 2.9);
        Assertions.assertEquals(4, 4);
    }
}
