import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static junit.framework.TestCase.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    private final String sex = "Самка";
    @Mock
    private Feline felineMock;


    @Test
    public void getFoodTest() throws Exception {
        Lion lion = new Lion(felineMock, sex);
        List<String> meats = List.of("A", "B", "C");
        Mockito.when(felineMock.getFood("Хищник")).thenReturn(meats);
        assertEquals("Список еды не совпадает", meats, lion.getFood());
    }

    @Test
    public void getKittensTest() throws Exception {
        Lion lion = new Lion(felineMock, sex);
        int kittensCount = 456;
        Mockito.when(felineMock.getKittens()).thenReturn(kittensCount);
        assertEquals("Количество котят не совпадает", kittensCount, lion.getKittens());
    }
}

