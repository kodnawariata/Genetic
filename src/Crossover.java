import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Crossover {
    public static void onePointCrossover (Population population){
        Random random = new Random();
        List<Individual> offspring = new ArrayList<>();

        for (int i = 0; i<population.getSize();i++){
            Individual parent1 = population.getPopulation().get(i);
            Individual parent2 = population.getPopulation().get(population.getSize()-1-i);
            int crossingPoint = random.nextInt(0,parent1.getGenome().size());
            List<Integer> offspring1Genome = new ArrayList<>();
            List<Integer> offspring2Genome = new ArrayList<>();
            offspring1Genome.addAll(parent1.getGenome().subList(0,crossingPoint));
            offspring1Genome.addAll(parent2.getGenome().subList(crossingPoint,parent2.getGenome().size()));
            offspring2Genome.addAll(parent2.getGenome().subList(0,crossingPoint));
            offspring2Genome.addAll(parent1.getGenome().subList(crossingPoint,parent1.getGenome().size()));
            offspring.add(0, new Individual(offspring1Genome));
            //offspring.add(0, new Individual(offspring2Genome));
        }
        population.getPopulation().addAll(offspring);
        offspring.clear();
    }
}
