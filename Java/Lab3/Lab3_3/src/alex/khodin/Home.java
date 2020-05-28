package alex.khodin;

import java.util.ArrayList;
import java.util.List;

public class Home
{
    List<Door> doors;
    List<Window> windows;

    public Home(int doors, int windows)
    {
        this.doors = new ArrayList<>();
        this.windows = new ArrayList<>();
        for(int i = 0; i < doors; i++)
            this.doors.add(new Door());
        for(int i = 0; i < windows; i++)
            this.windows.add(new Window());
    }

    public void lockAllDoors()
    {
        for (var door: doors)
            door.lock();
        System.out.println("Locked");
    }

    public void unlockAllDoors()
    {
        for (var door: doors)
            door.unlock();
        System.out.println("Unlocked");
    }

    public void printDoorsAmount()
    {
        System.out.println("Doors amount: " + Integer.toString(doors.size()));
    }

    public void printWindowsAmount()
    {
        System.out.println("Doors amount: " + Integer.toString(windows.size()));
    }

    @Override
    public boolean equals(Object obj) { return this.hashCode() == obj.hashCode(); }
    @Override
    public String toString() { return "doors: " + Integer.toString(doors.size()) + " windows: " + Integer.toString(windows.size()); }
    @Override
    public int hashCode()
    {
        int d = 0;
        int w = 0;
        for(Door door : doors)
            d += door.isLocked() ? 1 : 0;
        for(Window window : windows)
            w += window.opened ? 1 : 0;
        return this.getClass().toString().hashCode() + doors.size() + windows.size() + w + d;
    }
}
