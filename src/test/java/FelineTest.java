import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;
import java.util.Random;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {
    Random random = new Random();

    @Mock
    Feline feline;



    @Test
    public void meatForFelineMockTest() throws Exception {
        Mockito.when(feline.eatMeat()).thenReturn(List.of("RoyalCanin", "Purina"));
        feline.eatMeat();
        Mockito.verify(feline).eatMeat();
        Assert.assertEquals(List.of("RoyalCanin", "Purina"), feline.eatMeat());
    }

    @Test
    public void familyFelineMockTest() {
        feline.getFamily();
        Mockito.verify(feline).getFamily();
    }

    @Test
    public void felineKittensMockTest() {
        Mockito.when(feline.getKittens(1)).thenReturn(3);
        feline.getKittens(1);
        Mockito.verify(feline).getKittens(Mockito.anyInt());
        Assert.assertEquals(3,feline.getKittens(1));
    }

    @Test
    public void familyFelineTest() {
        Feline feline = new Feline();
        Assert.assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void felineKittensTest() {
        Feline feline = new Feline();
        int expected = random.nextInt(11);
        Assert.assertEquals(expected, feline.getKittens(expected));

    }
}