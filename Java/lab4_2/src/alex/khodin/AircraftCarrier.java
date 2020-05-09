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

    public void launchAircraft()
    {
        aircrafts--;
        System.out.println("Launch!");
    }

    public void addAircrafts(int aircrafts)
    {
        this.aircrafts += aircrafts;
    }
}
