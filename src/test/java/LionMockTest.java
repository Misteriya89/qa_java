import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionMockTest {

    @Mock
    Feline felineMock;

    @Mock
    Lion lionMock;

    @Test
    public void lionKittensWithFelineMockTest() throws Exception {
        Mockito.when(felineMock.getKittens()).thenReturn(4);
        Lion lion = new Lion("Самец", felineMock);
        lion.getKittens();
        Mockito.verify(felineMock, Mockito.times(1)).getKittens();
        Assert.assertEquals(4, lion.getKittens());
    }
    @Test
    public void foodForLionWithFelineMockTest() throws Exception {
        Mockito.when(felineMock.eatMeat()).thenReturn(List.of("RoyalCanin", "Purina"));
        Lion lion = new Lion("Самец", felineMock);
        lion.getFood();
        lion.getFood();
        Mockito.verify(felineMock, Mockito.times(2)).eatMeat();
        Assert.assertEquals(List.of("RoyalCanin", "Purina"), lion.getFood());
    }

    @Test
    public void lionMockHaveManeTest() {
        lionMock.doesHaveMane();
        Mockito.verify(lionMock).doesHaveMane();

    }
}