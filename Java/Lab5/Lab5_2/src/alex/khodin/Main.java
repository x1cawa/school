package alex.khodin;

public class Main {

    public static void main(String[] args)
    {
        AircraftCarrier carrier = new AircraftCarrier();
        carrier.sailForward();
        carrier.fire();
        for(int i = 0; i < 15; i++)
        {
            try
            {
                carrier.launchAircraft();
            } catch (Exception ex)
            {
                System.out.println(ex.getMessage());
            }
        }
        try
        {
            carrier.addAircrafts(1);
            carrier.launchAircraft();
            carrier.addAircrafts(-2);
        } catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        carrier.sailForward();
        carrier.sailBackward();
    }
}
