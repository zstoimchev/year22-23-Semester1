public class Edge {
  private Node u, v;
  public Edge(Node uu, Node vv){
    u = uu;
    v = vv;
  }
  public Node start(){
    return(u);
  }
  public Node end(){
    return(v);
  }
}