public class Povezava {
  private Vozel u, v;
  private int utez = 0;
  public Povezava(Vozel uu, Vozel vv, int utez){
    u = uu;
    v = vv;
    this.utez = utez;
  }
  public Vozel zacetek(){
    return(u);
  }
  public Vozel konec(){
    return(v);
  }
  public int utez(){
    return(utez);
  }
  
}