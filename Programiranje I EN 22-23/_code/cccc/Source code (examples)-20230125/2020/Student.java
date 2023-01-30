public class Student {
/* ---------------------------------------------[ data ]--- */
  private   String mIme;
  private   String mPriimek;
  protected int    mLetnik= 0;
  private   int    mVpisnaStevilka= 0;
/* --------------------------------[ create / destruct ]--- */
  public Student(String ime, String priimek) {
	    mIme= ime; mPriimek= priimek;
	    mLetnik= 0; mVpisnaStevilka= 0;
	  };
	/* -------------------------------------------[ update ]--- */
	  public void vpis(int vpisnaStevilka) {
	    mVpisnaStevilka= vpisnaStevilka;
	    mLetnik= 1;
	  }; 
  
	  public void izpisi() {
		    System.out.print(mIme + " " + mPriimek);
		    System.out.print(" (" + mVpisnaStevilka + ")");
		    System.out.print(" - " + mLetnik);
		  };

  /* --------------------------------------------[ query ]--- */
  public String ime() {
    return mIme;
  };
  public String priimek() {
    return mPriimek;
  };
  public int    letnik() {
    return mLetnik;
  };
  public int    vpisnaStevilka() {
    return mVpisnaStevilka;
  };
} // student