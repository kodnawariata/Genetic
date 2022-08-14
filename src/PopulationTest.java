import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PopulationTest {
    @Test
    public void removeHalfPopTest(){
        Population population = new Population(20,5);
        System.out.println(population.getSize());
        population.removeBottomHalfPopulation();
        System.out.println(population.getSize());
        Assertions.assertEquals(10, population.getSize());
    }
    }
