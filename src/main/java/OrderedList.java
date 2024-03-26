
public class OrderedList {

	private Node<NumCount> lst;

	public void insertNum(int x) {
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
		System.out.println("remove " + x);
	}
}
