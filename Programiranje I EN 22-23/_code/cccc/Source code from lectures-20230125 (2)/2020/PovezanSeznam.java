
public class PovezanSeznam {
	
	Seznam sz;
	//insert
	void insert(int elt) {
		if(sz == null) {
			sz = new Seznam();
			sz.head = elt;
		}
		else {
			sz.insert(elt);
		}
	}
	//delete
	boolean delete(int elt) {
		if(sz == null) {//no elements
			return(false);
		}
		else {
			if(sz.head == elt) {
				sz = sz.tail;
				return true;
			}
			else {
				return (sz.delete(elt));
			}
		}
	}
	//member
	boolean member(int elt) {
		if(sz == null) {
			return(false);
		}
		else {
			return(sz.member(elt));
		}
	}
}
