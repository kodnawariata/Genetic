import org.junit.jupiter.api.Test;

class FitnessTest {

    @Test
    public void calculateFitnessTest (){
        Individual individual = new Individual(10);
        individual.printGenome();
        System.out.println(individual.getFitness());
        System.out.println(individual.getFitnessCalculated());
        Fitness.calculateFitness(individual);
        System.out.println("---");
        individual.printGenome();
        System.out.println(individual.getFitness());
        System.out.println(individual.getFitnessCalculated());

    }



}