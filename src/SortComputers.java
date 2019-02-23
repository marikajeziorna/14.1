import java.util.Comparator;

public class SortComputers implements Comparator<Computer> {
    public int compare(Computer a, Computer b) {
        if (a.getCpu() != b.getCpu()) {
            return a.getCpu() - b.getCpu();
        } else if (a.getRam() != b.getRam()) {
            return a.getRam() - b.getRam();
        } else {
            return a.getName().compareTo(b.getName());
        }
    }
}
