import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

@RunWith(Parameterized.class)
public class LionParameterizedTest {

    private String sex;
    private boolean hasMane;

    public LionParameterizedTest(String sex, boolean hasMane) {
        this.sex = sex;
        this.hasMane = hasMane;
    }

    @Parameterized.Parameters
    public static Object[][] getTestParameters() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},

        };
    }

    @Test
    public void lionHaveManeParametrizedTest() throws Exception {
        Lion lion = new Lion(sex, new Feline());
        Assert.assertEquals(hasMane, lion.doesHaveMane());
    }

    @Test
    public void lionKittensParametrizedTest() throws Exception {
        Lion lion = new Lion(sex, new Feline());
        Assert.assertEquals(1, lion.getKittens());
    }

    @Test
    public void foodForLionParametrizedTest() throws Exception {
        Lion lion = new Lion(sex, new Feline());
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals(expected, lion.getFood());
    }


    @Test
    public void lionConstructorExceptionTest() {
        String exceptionText = "";
        try {
            new Lion("Самкосамец", new Feline());
        } catch (Exception exception) {
            exceptionText = exception.getMessage();
        }
        Assert.assertEquals("Используйте допустимые значения пола животного - Самец или Самка", exceptionText);
    }

}