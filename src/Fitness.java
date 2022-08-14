public class Fitness {
    public static void calculateFitness(Individual individual){
        int fitness = 0;
        for (int i = 0; i<individual.getGenome().size(); i++){
            fitness += (int) individual.getGenome().get(i);
        }
        individual.setFitness(fitness);
        individual.setFitnessCalculated(true);
    }
}
