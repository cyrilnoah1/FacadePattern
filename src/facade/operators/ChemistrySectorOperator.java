package facade.operators;

/**
 * Class to operate the functionality of
 * the laboratory's chemistry sector.
 */
public class ChemistrySectorOperator implements ChemistrySector {
    @Override
    public void startPreparingChemicals() {
        System.out.println("Open the chemistry sector");
        System.out.println("start preparing all the chemicals");
    }

    @Override
    public void stopPreparingChemicals() {
        System.out.println("Stop preparing all the chemicals");
        System.out.println("Close the chemistry sector");
    }
}
