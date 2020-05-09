package alex.khodin;

class PlacesAmount
{
    public int economy;
    public int coupe;
    public int luxury;

    public PlacesAmount(int economy, int coupe, int luxury) { set(economy, coupe, luxury); }
    public PlacesAmount(PlacesAmount other) { set(other.economy, other.coupe, other.luxury); }

    public void set(int economy, int coupe, int luxury)
    {
        this.economy = economy;
        this.coupe = coupe;
        this.luxury = luxury;
    }

    public int calcAll() { return economy + coupe + luxury; }
}
