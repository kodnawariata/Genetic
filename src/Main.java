import java.util.Random;

public class Main {
    static int initialPopulationSize = 1000;
    static int indyvidualSize = 20;
    static int mutationProbability = 1;




    public static void main(String[] args) {
        Random random = new Random();
        boolean stopCondition = false;
        int generationCounter = 1;
        Population population = new Population(initialPopulationSize, indyvidualSize);

        while (!stopCondition){
            population.calculateFittnesOfPopulation();
            population.sortMin();
            System.out.println("###Generation: " +generationCounter +"###");
            System.out.println("Population: " + population.getSize());
            System.out.println();
            System.out.println("+++Best individual+++");
            System.out.println("Genome: " + population.getPopulation().get(0).getGenome());
            System.out.println("Fitness: " + population.getPopulation().get(0).getFitness());
            System.out.println();
            System.out.println("+++Worst individual+++");
            System.out.println("Genome: " + population.getPopulation().get(population.getPopulation().size()-1).getGenome());
            System.out.println("Fitness: " + population.getPopulation().get(population.getPopulation().size()-1).getFitness());

            population.removeBottomHalfPopulation();
            Crossover.onePointCrossover(population);

            for (int i=0; i<(mutationProbability/100)*initialPopulationSize; i++){
                Mutation.randomizeBit(population.getPopulation().get(random.nextInt(0,population.getSize())));
            }
            if(generationCounter==50) {
                stopCondition = true;
            }
            generationCounter++;
        }
    }
}
