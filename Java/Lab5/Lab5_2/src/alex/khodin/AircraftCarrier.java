package alex.khodin;

public class AircraftCarrier extends Warship
{
    private int aircrafts;

    public AircraftCarrier()
    {
        super();
        aircrafts = 10;
    }

    @Override
    public void fire()
    {
        System.out.println("Fire! Fire! Fire!");
    }

    public void launchAircraft() throws Exception
    {
        if(aircrafts == 0)
            throw new Exception("No more aircrafts");
        aircrafts--;
        System.out.println("Launch!");
    }

    public void addAircrafts(int aircrafts) throws Exception
    {
        if(this.aircrafts + aircrafts < 0)
            throw new Exception("Aircrafts must be more than 0");
        this.aircrafts += aircrafts;
    }
}
