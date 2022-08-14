import java.util.Random;

public class Mutation {

    public static void bitFlip(Individual individual){
        Random random = new Random();
        int selectBit = random.nextInt(0,individual.getGenome().size());

        if (individual.getGenome().get(selectBit).equals(1)){
            individual.getGenome().set(selectBit,0);
        } else {
            individual.getGenome().set(selectBit,1);
        }

        individual.setFitnessCalculated(false);
    }

    public static void  bitSwitch(Individual individual){
        Random random = new Random();
        int firstBit = random.nextInt(0,individual.getGenome().size());
        int secondBit = random.nextInt(0, individual.getGenome().size());
        int firstBitValue = (int) individual.getGenome().get(firstBit);
        individual.getGenome().set(firstBit,individual.getGenome().get(secondBit));
        individual.getGenome().set(secondBit,firstBitValue);
    }

    public static void randomizeBit (Individual individual){
        Random random = new Random();
        individual.getGenome().set(random.nextInt(0,individual.getGenome().size()),random.nextInt(0,15));
    }
}
