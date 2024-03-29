public class OrderedList {

	private Node<NumCount> lst;

	public void insertNum(int x) {
		if(lst==null) {
			lst=new Node<>(new NumCount(x,1));
			System.out.println("insert " + x);
			return;
		}
		Node<NumCount> p=new Node<>(null,lst);
		lst=p;
		boolean flag=false;
		Node<NumCount> temp;
		while(lst.hasNext()&&!flag){
			if(lst.getNext().getValue().getNum()==x){
				lst.getNext().getValue().setCount(lst.getNext().getValue().getCount()+1);
				flag=true;
			}
			else if(lst.getNext().getValue().getNum()>x){
				temp=new Node<NumCount>(new NumCount(x,1),lst.getNext());
				lst.setNext(temp);
				flag=true;
			}
			lst=lst.getNext();
		}
		if(!flag){
			temp=new Node<NumCount>(new NumCount(x,1));
			lst.setNext(temp);
		}
		lst=p.getNext();
		System.out.println("insert " + x);
	}

	public int valueN(int n) {
		int count=0;
		Node<NumCount> p=lst;
		while(p!=null){
			count+=p.getValue().getCount();
			if(count>=n)
				return p.getValue().getNum();
			p=p.getNext();
		}
		return -1;
	}

	public void removeNum(int x) {
		Node<NumCount> p=new Node<>(null,lst);
		lst=p;
		boolean flag=false;
		while(lst.hasNext()&&!flag){
			if(lst.getNext().getValue().getNum()==x){
				lst.getNext().getValue().setCount(lst.getNext().getValue().getCount()-1);
				flag=true;
			}
			if(lst.getNext().getValue().getNum()==x&&lst.getNext().getValue().getCount()==0){
				lst.setNext(lst.getNext().getNext());
				flag=true;
			}
			else
				lst=lst.getNext();
		}
		lst=p.getNext();
		System.out.println("remove " + x);
	}

	public String toString() {
		return "OrderedList [lst=" + lst + "]";
	}
	
}
