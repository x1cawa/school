package alex.khodin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Parking
{
    private List<Boolean> busy;

    public Parking(int places)
    {
        busy = new ArrayList<>();
        for(int i = 0; i < places; i++)
            busy.add(false);
    }

    public int park() throws Exception
    {
        for(int i = 0; i <  busy.size(); i++)
        {
            if(!busy.get(i))
            {
                busy.set(i, true);
                System.out.println("Parked to " + Integer.toString(i));
                return i;
            }
        }
        throw new Exception("No places!");
    }

    public void leave(int id) throws Exception
    {
        if(busy.size() < id)
            throw new Exception("No place " + Integer.toString(id) + "!");
        if(busy.get(id) == false)
            throw new Exception("Place " + Integer.toString(id) + " is free");

        busy.set(id, false);
        System.out.println("Left from " + Integer.toString(id));
    }
}
