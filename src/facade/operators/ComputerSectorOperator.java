package facade.operators;

/**
 * Class to operate the functionality of
 * the laboratory's computer sector.
 */
public class ComputerSectorOperator implements ComputerSector {
    @Override
    public void turnOnAllTheComputers() {
        System.out.println("Turn on all the computers.");
        System.out.println("Start making required operations.");
    }

    @Override
    public void turnOffAllTheComputers() {
        System.out.println("Stop making required operations.");
        System.out.println("Turn off all the computers.");
    }
}
