
public class Seznam {
	int head;
	Seznam tail;
	//insert
	void insert(int elt) {
		if(tail == null) {
			Seznam tmp = new Seznam();
			tmp.head = elt;
			tail = tmp;
		}
		else {
			tail.insert(elt);
		}
	}
	//delete
	boolean delete(int elt) {
		if(tail == null) {
			return(false);
		}
		else {
			if(tail.head == elt) {
				//real delete!!!
				tail = tail.tail;
				return(true);
			}
			else {
				return(tail.delete(elt));}}}
	//memeber
	boolean member(int elt) {
		if(head == elt) {
			return(true);}
		if(tail == null) {
			return(false);}
		else {
			return(tail.member(elt));}}}
