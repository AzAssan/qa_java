import com.example.Feline;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;
import java.util.List;


public class FelineTest {

    private final Feline testFeline = new Feline();

    @Test
    public void eatMeatTest() throws Exception {
        List<String> animals = List.of("Животные", "Птицы", "Рыба");
        assertEquals("Список животных не совподает", animals, testFeline.eatMeat());
    }

    @Test
    public void getFamilyTest() {
        assertEquals("Семейство не совпадает", "Кошачьи", testFeline.getFamily());
    }

    @Test
    public void getKittensTest() {
        assertEquals("Количество котят не совпадает", 1, testFeline.getKittens());
        int kittensCount = 123;
        assertEquals("Количество котят не совпадает", kittensCount, testFeline.getKittens(kittensCount));
    }
}
