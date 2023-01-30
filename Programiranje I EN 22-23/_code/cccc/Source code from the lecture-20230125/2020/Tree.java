
public class Tree {
	int head;
	Tree left, right;
	
	//search
	boolean search(int elt) {
		if(head == elt){
			return true;
		}
		else {
			if(head > elt) {
				//left
				if(left == null) {
					return false;
				}
				else {
					return left.search(elt);
				}
			}
			else {
				//right
				if(right == null) {
					return false;
				}
				else {
					return right.search(elt);
				}
			}
		}
	}
	//insert
	boolean insert(int elt) {
		if(head > elt) {
			//left
			if(left == null) {
				left = new Tree();
				left.head = elt;
				return true;
			}
			else {
				return left.insert(elt);
			}
		}
		else if(head < elt){
			//right
			if(right == null) {
				right = new Tree();
				right.head = elt;
				return true;
			}
			else{
				return right.insert(elt);
			}
		}
		else {
			return false;
		}
	}
	//delete
	boolean delete(int elt) {
		if(elt == head) {
			//SOMETHING WENT WRONG!!!
			return false;
		}
		if(head > elt) {
			//left
			if(left == null) {
				return false;
			}
			else if(left.head == elt) {
				//DO THE REAL DELETE, too complicated
				return false;
			}
			else {
				return left.delete(elt);
			}
		}
		else {
			if(right == null) {
				return false;
			}
			else if(right.head == elt){
				//DO THE REAL DELETE, too complicated
				return false;
			}
			else {
				return right.delete(elt);
			}
		}
	}
}
