import org.junit.jupiter.api.Test;

class MutationTest {
    Individual individual = new Individual(10);

    @Test
    public void visualMutationFlipBitTest(){
        System.out.println("---\n Visual mutation flipBit Test\n---");
        individual.printGenome();
        Mutation.bitFlip(individual);
        individual.printGenome();
    }

    @Test
    public void visualMutationBitSwitchTest(){
        System.out.println("---\n Visual mutation bitSwitch Test\n---");
        individual.printGenome();
        Mutation.bitSwitch(individual);
        individual.printGenome();
    }

}