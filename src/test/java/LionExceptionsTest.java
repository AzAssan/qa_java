import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;

@RunWith(Parameterized.class)
public class LionExceptionsTest {

    private final Feline feline;
    private final String sex;

    @Parameterized.Parameters
    public static Object[][] getData() {

        return new Object[][]{
                {null, "Самец"},
                {Mockito.mock(Feline.class), "Тест"},
        };
    }


    public LionExceptionsTest(Feline feline, String sex) {
        this.sex = sex;
        this.feline = feline;
    }

    @Test(expected = Exception.class)
    public void constructorExceptionTest() throws Exception {
        new Lion(feline, sex);
    }
}
