import java.util.Vector;

public class HanojskiStolpci {
  static Vector prvi;
  static Vector drugi;
  static Vector tretji;

  public static void main (String[] arg) {
    int st = (Integer.valueOf(arg[0])).intValue();
    Nastavi(st);
    Hanoi(1,2,3,st);
    System.out.println("Konec");
  }

  static void Nastavi(int koliko) {
    prvi = new Vector(koliko);
    drugi = new Vector(koliko);
    tretji = new Vector(koliko);

   for(int i=koliko; i>0; i--)
     prvi.addElement(i+"");
  }

  static void Izpisi() {
    String rez1=new String("");
    String rez2=new String("");
    String rez3=new String("");
 
    for(int i=0; i<prvi.size(); i++)
      rez1 += prvi.elementAt(i);
    for(int j=0; j<drugi.size(); j++)
      rez2 += drugi.elementAt(j);
    for(int k=0; k<tretji.size(); k++)
      rez3 += tretji.elementAt(k);

    System.out.println("-"+rez1);
    System.out.println("-"+rez2);
    System.out.println("-"+rez3);
    System.out.println("****************");
  }

  static void Prestavi (int odKje, int kam) {
    String tmp = new String("");
    if (odKje == 1){
      tmp = prvi.elementAt(prvi.size()-1)+"";
      prvi.removeElementAt(prvi.size()-1);
    }
    if (odKje == 2){
      tmp = drugi.elementAt(drugi.size()-1)+"";
      drugi.removeElementAt(drugi.size()-1);
    }
    if (odKje == 3){
      tmp = tretji.elementAt(tretji.size()-1)+"";
      tretji.removeElementAt(tretji.size()-1);
    }
    
    if (kam==1) 
      prvi.addElement(tmp);
    if (kam==2) 
      drugi.addElement(tmp);
    if (kam==3) 
      tretji.addElement(tmp);

    Izpisi();
  }

  static void Hanoi(int odKje, int preko, int kam, int koliko) {
    if (koliko!=0) {
      Hanoi(odKje,kam,preko,koliko-1);
      Prestavi(odKje, kam);
      Hanoi(preko,odKje,kam,koliko-1);
    }
  }
}
