package alex.khodin;

public abstract class Warship implements IShip
{
    private boolean engineStarted;

    Warship()
    {
        engineStarted = false;
    }

    public void fire()
    {
        System.out.println("Fire!");
    }

    @Override
    public void sailForward()
    {
        if(!engineStarted)
            startEngine();
        System.out.println("Forward!");
    }

    @Override
    public void sailBackward()
    {
        if(!engineStarted)
            startEngine();
        System.out.println("Backward!");
    }

    public void startEngine()
    {
        engineStarted = true;
        System.out.println("Engine started!");
    }
}
