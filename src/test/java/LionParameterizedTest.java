import com.example.Lion;
import org.junit.runners.Parameterized;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import static junit.framework.TestCase.assertEquals;


@RunWith(Parameterized.class)
public class LionParameterizedTest {

    private final Lion lion;
    private final boolean hasMane;

    @Parameterized.Parameters
    public static Object[][] getData() {

        return new Object[][]{
                {Mockito.mock(Feline.class), "Самец", true},
                {Mockito.mock(Feline.class), "Самка", false},
        };
    }

    public LionParameterizedTest(Feline feline, String sex, boolean hasMane) throws Exception {
        this.lion = new Lion(feline, sex);
        this.hasMane = hasMane;
    }

    @Test
    public void hasManeTest() {
        assertEquals("Не совпадает hasMane", hasMane, lion.doesHaveMane());
    }
}
