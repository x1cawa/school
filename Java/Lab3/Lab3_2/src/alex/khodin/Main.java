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
        trains.add(new Train("Some destination", 10,
                LocalDateTime.of(2020, Month.FEBRUARY, 15, 19, 20),
                new PlacesAmount(100, 20, 10)));
        trains.add(new Train("Some destination", 11,
                LocalDateTime.of(2020, Month.FEBRUARY, 15, 19, 20),
                new PlacesAmount(0, 20, 10)));
        trains.add(new Train("Another destination", 12,
                LocalDateTime.of(2020, Month.FEBRUARY, 15, 19, 20),
                new PlacesAmount(5, 20, 10)));
        trains.add(new Train("Some destination", 13,
                LocalDateTime.of(2020, Month.JANUARY, 15, 19, 20),
                new PlacesAmount(5, 20, 10)));

        //a
        System.out.println("a (To \"Some destination\")");
        for (Train train: trains)
        {
            if(train.getDestination() == "Some destination")
                System.out.println(train.toString());
        }

        //b
        System.out.println("b (To \"Some destination\" and after 2020 feb 14, 18:36)");
        for (Train train: trains)
        {
            if(train.getDestination() == "Some destination" &&
                    train.getDeparture().isAfter(LocalDateTime.of(2020, Month.FEBRUARY, 14, 18, 36)))
                System.out.println(train.toString());
        }

        //c
        System.out.println("c (To \"Some destination\" and economy != 0)");
        for (Train train: trains)
        {
            if(train.getDestination() == "Some destination" && train.getPlacesAmount().economy != 0)
                System.out.println(train.toString());
        }
    }
}
