package alex.khodin;

import java.time.LocalDateTime;

public class Train
{
    private String destination;
    private int number;
    private LocalDateTime departure; //LocalDateTime.of(2020, Month.FEBRUARY, 14, 18, 36);
    private PlacesAmount placesAmount;

    public Train() {}
    public Train(String destination, int number, LocalDateTime departure, PlacesAmount placesAmount)
    {
        init(destination, number, departure, placesAmount);
    }
    public Train(Train other)
    {
        init(other.destination, other.number, other.departure, other.placesAmount);
    }

    private void init(String destination, int number, LocalDateTime departure, PlacesAmount placesAmount)
    {
        this.destination = destination;
        this.number = number;
        this.departure = departure;
        this.placesAmount = placesAmount;
    }

    public int getNumber() { return number; }
    public LocalDateTime getDeparture() { return departure; }
    public PlacesAmount getPlacesAmount() { return placesAmount; }
    public String getDestination() { return destination; }

    public void setDeparture(LocalDateTime departure) { this.departure = departure; }
    public void setDestination(String destination) { this.destination = destination; }
    public void setNumber(int number) { this.number = number; }
    public void setPlacesAmount(PlacesAmount placesAmount) { this.placesAmount = placesAmount; }

    public String toString()
    {
        return "No: " + Integer.toString(number) +
                ", Dest: " + destination +
                ", Depart: " + departure.toString() +
                ", places amount: " + Integer.toString(placesAmount.calcAll());
    }
}
