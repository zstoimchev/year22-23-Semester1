public class StartGraph {
  public static void main(String[] args) {
    Graph gg = new Graph();
    gg.addNode("Lucija");
    gg.addNode("Piran");
    gg.addNode("Izola");
    gg.addNode("Koper");
    gg.addNode("Dekani");
    gg.addEdge("Lucija", "Piran");
    gg.addEdge("Piran", "Izola");
    gg.print();
    System.out.println("*************************");
    gg.addEdge("Izola", "Koper");
    gg.addEdge("Koper", "Dekani");
    gg.print();
    
  }
}