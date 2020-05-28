package alex.khodin;

public class Main {

    public static void main(String[] args)
    {
        Home home = new Home(5, 2);
        home.lockAllDoors();
        home.printDoorsAmount();
        home.printWindowsAmount();

        System.out.println(home.toString());
        System.out.println(home.hashCode());
    }
}
