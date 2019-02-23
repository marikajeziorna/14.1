import java.util.ArrayList;
import java.util.Collections;

public class ComputersList {
    public static void main(String[] args) {
        ArrayList<Computer> computers = new ArrayList<>();
        computers.add(new Computer("a", 4500, 1));
        computers.add(new Computer("b", 4000, 2));
        computers.add(new Computer("b", 4000, 4));
        computers.add(new Computer("b", 3000, 6));

        Collections.sort(computers, new SortComputers());


        for (int i = 0; i < computers.size(); i++) {
            Computer computer = computers.get(i);
            System.out.printf("Name: " + computer.getName() + " CPU: " + computer.getCpu() + " RAM: " + computer.getRam() + "\n");
        }
    }
}
