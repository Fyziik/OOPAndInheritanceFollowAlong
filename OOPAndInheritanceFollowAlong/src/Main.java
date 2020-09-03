import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Machine m = new Machine();
        Printer p = new Printer(200, "Printer");
        System.out.println(m);
        m.power();
        System.out.println(m);

        System.out.println("---");

        System.out.println(p);
        p.print("Testing", 2);
        p.power();
        System.out.println(p);
        p.print("Testing", 201);

        System.out.println("---");
        Laser l = new Laser(200, "Laser");
        Ink i = new Ink(200, "Ink");

        List<Printer> printers = new ArrayList<>();
        printers.add(l);
        printers.add(i);
        printers.add(p);

        for (Printer printer : printers) {
            printer.print();
        }
    }

}
