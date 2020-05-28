package alex.khodin;

public class Window
{
    public Boolean opened = false;

    @Override
    public boolean equals(Object obj) { return this.hashCode() == obj.hashCode(); }
    @Override
    public String toString() { return "Window " + (opened ? "opened" : "closed"); }
    @Override
    public int hashCode() { return this.getClass().toString().hashCode() + (opened ? "opened".hashCode() : "closed".hashCode()); }
}
