import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Population {


    List<Individual> population = new ArrayList<Individual>();

    public Population (int popSize, int indSize){
        for (int i=0; i<popSize; i++){
            this.population.add(new Individual(indSize));
        }
    }
    public void calculateFittnesOfPopulation(){
        for (Individual individual : population){
            if(!individual.getFitnessCalculated()){
                Fitness.calculateFitness(individual);
            }
        }
    }

    public void sortMax(){
        Collections.sort(population, (f1, f2) -> Integer.valueOf(f2.getFitness()).compareTo(f1.getFitness()));
        }

    public void sortMin(){
        Collections.sort(population, (f1, f2) -> Integer.valueOf(f1.getFitness()).compareTo(f2.getFitness()));
    }

    public void removeBottomHalfPopulation(){
        population.subList(population.size()/2, population.size()).clear();
    }

    public void increaseGenerationCounterForIndividuals(){
        for (Individual individual : population){
            individual.increaseGenerationCounter();
        }
    }


    public int getSize() {
        return population.size();
    }

    public List<Individual> getPopulation() {
        return population;
    }
}
