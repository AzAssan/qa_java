import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static junit.framework.TestCase.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    private Feline mock;

    @Test
    public void getSoundTest() {
        Cat cat = new Cat(mock);
        assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void getFoodTest() throws Exception {
        Cat cat = new Cat(mock);
        List<String> meats = List.of("A", "B", "C");
        Mockito.when(mock.eatMeat()).thenReturn(meats);
        assertEquals("Список еды не совпадает", meats, cat.getFood());
    }
}
