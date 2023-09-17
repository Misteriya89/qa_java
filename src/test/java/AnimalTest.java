import com.example.Animal;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class AnimalTest {

    @Mock
    Animal animal;

    @Test
    public void familyAnimalMockTest() {
        animal.getFamily();
        Mockito.verify(animal).getFamily();
    }

    @Test
    public void familyAnimalTest() {
        Animal animal = new Animal();
        Assert.assertEquals("Существует несколько семейств: заячьи," +
                " беличьи, мышиные, кошачьи, псовые, медвежьи, куньи", animal.getFamily());
    }

    @Test
    public void foodForHerbivoreAnimalTest() throws Exception {
        Animal animal = new Animal();
        String herbivore = "Травоядное";
        Assert.assertEquals(List.of("Трава", "Различные растения"), animal.getFood(herbivore));
    }

    @Test
    public void foodForPredatorAnimalTest() throws Exception {
        Animal animal = new Animal();
        String predator = "Хищник";
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), animal.getFood(predator));
    }

    @Test
    public void foodExceptionTest() {
        Animal animal = new Animal();
        String exceptionText = "";
        try {
            animal.getFood("Котопёс");
        } catch (Exception exception) {
            exceptionText = exception.getMessage();
        }
        Assert.assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник", exceptionText);
    }
}