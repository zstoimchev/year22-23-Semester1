public class Print <T>{

    T thing;
    public Print(T thing){
        this.thing=thing;
    }

    public void print(){
        System.out.println(thing);
    }

}
