public class Uporaba {
  
public static void lepoIzpisi(Student kdo) {
    kdo.izpisi(); System.out.println();
  }; // lepoIzpisi

  public static void main(String args[]) {
    Student martin= new Student("Martin", "Krpan");
	 Student peter=  new Student("Peter", "Klepec");
	 Student pehta=  new Student("Botra", "Pehta");

    lepoIzpisi(martin); lepoIzpisi(peter); lepoIzpisi(pehta);
    martin.vpis(123); peter.vpis(124); pehta.vpis(125);

    lepoIzpisi(martin); lepoIzpisi(peter); lepoIzpisi(pehta);
  }; // main
}; // uporaba