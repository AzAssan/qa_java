import com.example.Lion;
import org.junit.runners.Parameterized;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import java.util.List;
import static junit.framework.TestCase.assertEquals;


@RunWith(Parameterized.class)
public class LionTest {

    private final Feline feline;
    private final Lion lion;
    private final boolean hasMane;

    @Parameterized.Parameters
    public static Object[][] getData() {

        return new Object[][] {
                {Mockito.mock(Feline.class), "Самец", true},
                {Mockito.mock(Feline.class), "Самка", false},
        };
    }

    public LionTest(Feline feline, String sex, boolean hasMane) throws Exception {
        this.lion = new Lion(feline, sex);
        this.feline = feline;
        this.hasMane = hasMane;
    }

    @Test
    public void hasManeTest() {
        assertEquals("Не совпадает hasMane", hasMane, lion.doesHaveMane());
    }

    @Test
    public void getFoodTest() throws Exception {
        List<String> meats = List.of("A", "B", "C");
        Mockito.when(feline.getFood("Хищник")).thenReturn(meats);
        assertEquals("Список еды не совпадает", meats, lion.getFood());
    }

    @Test
    public void getKittensTest() {
        int kittensCount = 456;
        Mockito.when(feline.getKittens()).thenReturn(kittensCount);
        assertEquals("Количество котят не совпадает", kittensCount, lion.getKittens());
    }
}

