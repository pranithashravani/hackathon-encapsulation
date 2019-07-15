import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int pages=s.nextInt();
        int tonerlevel=s.nextInt();
        boolean duplex=s.nextBoolean();
        Printer obj = new Printer();
obj.setTonerlevel(tonerlevel);
obj.setPages(pages);
obj.display(duplex);
obj.simulate(pages);
obj.filltoner(tonerlevel);



    }
}
