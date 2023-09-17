import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline feline;

    @Mock
    Cat cat;

    @Test
    public void foodForCatFelineMockTest() throws Exception {
        Cat cat = new Cat(feline);
        cat.getFood();
        Mockito.verify(feline).eatMeat();
    }

    @Test
    public void catSoundMockTest() {
        cat.getSound();
        Mockito.verify(cat).getSound();
    }

    @Test
    public void catSoundTest() {
        Cat cat = new Cat(new Feline());
        Assert.assertEquals("Мяу", cat.getSound());
    }
}