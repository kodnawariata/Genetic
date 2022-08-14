import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Individual {
    List<Integer> genome = new ArrayList<>();
    int fitness = 0;
    int generationsSurvived = 0;
    Boolean fitnessCalculated = false;
    Random random = new Random();

    public Individual (int indSize){
        for (int i = 0; i<indSize;i++){
            genome.add(random.nextInt(0,15));
        }
    }

    public Individual (List<Integer> genome){
        this.genome.addAll(genome);
    }

    public void printGenome() {
        System.out.println(genome);
    }

    public List<Integer> getGenome() {
        return genome;
    }

    public Boolean getFitnessCalculated() {
        return fitnessCalculated;
    }

    public void setFitnessCalculated(Boolean fitnessCalculated) {
        this.fitnessCalculated = fitnessCalculated;
    }

    public void setFitness(int fitness) {
        this.fitness = fitness;
    }

    public int getFitness() {
        return fitness;
    }

    public void increaseGenerationCounter() {
        generationsSurvived++;
    }
}
