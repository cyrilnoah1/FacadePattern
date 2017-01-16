package facade.operators;

/**
 * Class to operate the opening and closing of
 * the secret doors.
 */
public class SecterDoorOperator implements SecretDoor {
    @Override
    public void openSecretDoor() {
        System.out.println("Open the laboratory's secret door.");
    }

    @Override
    public void closeSecretDoor() {
        System.out.println("Close the laboratory's secret door.");
    }
}
