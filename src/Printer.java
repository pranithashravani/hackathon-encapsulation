public class Printer {
    private float tonerlevel;
    private int pages;
    private boolean duplex;


    public float getTonerlevel() {
        return tonerlevel;
    }

    public void setTonerlevel(float tonerlevel) {
        this.tonerlevel = tonerlevel;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
public void display(boolean duplex)
{
    System.out.println("printing on two sides?");
    if(duplex=false)
    System.out.println("No");
    else
        System.out.println("Yes");
}

public void filltoner(float tonerlevel)
{
    if(tonerlevel<50)
        System.out.println("fill the toner immediately");
    else
        System.out.println("no need to fill");
}
public void simulate(int pages)
{
    if(pages<50)
        System.out.println("start printing more pages");
    else
        System.out.println("Maximum number of pages been printed");
}


}
