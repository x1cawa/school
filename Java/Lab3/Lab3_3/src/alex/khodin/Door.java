package alex.khodin;

public class Door
{
    boolean locked;

    public Door()
    {
        locked = false;
    }

    public void lock() { locked = true; }
    public void unlock() { locked  = false; }
    public boolean isLocked() { return locked; }

    @Override
    public boolean equals(Object obj) { return this.hashCode() == obj.hashCode(); }
    @Override
    public String toString() { return "Door " + (locked ? "locked" : "unlocked");}
    @Override
    public int hashCode() { return this.getClass().toString().hashCode() + (locked ? "locked".hashCode() : "unlocked".hashCode()); }
}
