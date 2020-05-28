package alex.khodin;

public class Main {

    public static void main(String[] args)
    {
        AircraftCarrier carrier = new AircraftCarrier();
        carrier.sailForward();
        carrier.fire();
        carrier.launchAircraft();
        carrier.sailForward();
        carrier.sailBackward();
    }
}
