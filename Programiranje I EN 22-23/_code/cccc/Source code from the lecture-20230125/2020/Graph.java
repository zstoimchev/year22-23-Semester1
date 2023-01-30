import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Vector;

public class Graph {
	private HashMap nodes = new HashMap();
	private Vector edges = new Vector();
	//insert
		//Node
	boolean addNode(String nodeName) {
		Node tmp = (Node)nodes.get(nodeName);
		if(tmp == null) {
			tmp = new Node(nodeName);
			nodes.put(nodeName, tmp);
			return true;
		}
		else {
			return false;
		}
	}
	public boolean addEdge(String u, String v){
		  Node tmp1, tmp2;
		  tmp1 = (Node)nodes.get(u);
		  tmp2 = (Node)nodes.get(v);
		  if((tmp1 != null) && (tmp2 != null)){
		    edges.addElement(new Edge(tmp1, tmp2));
		    return(true);
		  }
		  else{
		    return(false);
		  }
		}
	
	public void print(){
		  Node tmp1, tmp2;
		  Edge pTmp;
		  for(int i = 0; i < edges.size(); i++ ){
		    pTmp = (Edge)edges.elementAt(i);
		    tmp1 = pTmp.start();
		    tmp2 = pTmp.end();
		    System.out.println(tmp1.name + "--" + tmp2.name);
		  }
		  Iterator hmIterator = nodes.entrySet().iterator();
		  while (hmIterator.hasNext()) { 
	            Map.Entry mapElement = (Map.Entry)hmIterator.next(); 
	            System.out.println(((Node)mapElement.getValue()).name); 
		  }
	}
}
