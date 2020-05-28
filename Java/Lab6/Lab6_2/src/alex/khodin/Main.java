package alex.khodin;

public class Main {

    public static void main(String[] args)
    {
        int places = 5;
        Parking park = new Parking(places);
        try
        {
            for(int i = 0; i < places + 1; i++)
                park.park();
        }catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }

        try
        {
            park.leave(2);
            park.leave(4);
            park.leave(6);
        }catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }

        try
        {
            park.park();
            park.leave(1);
            park.park();
            park.leave(4);
            park.park();
            park.park();
            park.park();
        }catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }

    }
}
