package alex.khodin;

class LeftLeg extends Thread
{
    public void run()
    {
        for (int i = 0; i < 10; i++){
            System.out.println("LEFT");
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                System.out.println("Thread has been interrupted");
            }
        }
    }
}
class RightLeg extends Thread
{
    public void run()
    {
        try
        {
            Thread.sleep(500);
        }
        catch(InterruptedException e)
        {
            System.out.println("Thread has been interrupted");
        }
        for (int i = 0; i < 10; i++)
        {
            System.out.println("RIGHT");
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                System.out.println("Thread has been interrupted");
            }
        }
    }
}
public class Main
{

    public static void main(String[] args)
    {
        new LeftLeg().start();
        new RightLeg().start();
    }
}