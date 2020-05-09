package alex.khodin;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args)
    {
	    List<Train> trains = new ArrayList<>();
        //init

        //a
        for (Train train: trains)
        {
            if(train.getDestination() == "Some destination")
                System.out.println(train.toString());
        }

        //b
        for (Train train: trains)
        {
            if(train.getDestination() == "Some destination" &&
                    train.getDeparture().isAfter(LocalDateTime.of(2020, Month.FEBRUARY, 14, 18, 36)))
                System.out.println(train.toString());
        }

        //c
        for (Train train: trains)
        {
            if(train.getDestination() == "Some destination" && train.getPlacesAmount().economy != 0)
                System.out.println(train.toString());
        }
    }
}
