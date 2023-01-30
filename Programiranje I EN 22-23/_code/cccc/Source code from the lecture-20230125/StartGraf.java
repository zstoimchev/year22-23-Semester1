public class StartGraf {
  public static void main(String[] args) {
    Graf gg = new Graf();
    gg.dodajVozel("Lucija");
    gg.dodajVozel("Piran");
    gg.dodajVozel("Izola");
    gg.dodajVozel("Koper");
    gg.dodajVozel("Dekani");
    gg.dodajPovezavo("Lucija", "Piran", 1);
    gg.dodajPovezavo("Piran", "Izola", 1);
    gg.izpisi();
    gg.dodajPovezavo("Izola", "Koper",2);
    gg.dodajPovezavo("Koper", "Dekani",0);
    gg.izpisi();
    gg.dodajPovezavo("Lucija", "Dekani",10);
    gg.izpisi();
  }
}