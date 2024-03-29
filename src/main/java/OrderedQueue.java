public class OrderedQueue {

	private Queue<NumCount> q;
	
	public OrderedQueue() {
		q = new Queue<NumCount>();
	}

	public void insertNum(int x) {
		q.insert(null);
		boolean flag=false;
		NumCount n;
		while(q.head()!=null) {
			if(q.head().getNum()==x&&!flag) {
				q.head().setCount(q.head().getCount()+1);
				flag=true;
			}
			else if(q.head().getNum()>x&&!flag) {
				q.insert(new NumCount(x,1));
				flag=true;
			}
			q.insert(q.remove());
		}
		if(!flag)
			q.insert(new NumCount(x,1));
		q.remove();
		System.out.println("insert " + x);
	}
	
	public int valueN(int n) {
		int num=-1;
		int count=0;
		q.insert(null);
		boolean flag=false;
		while(q.head()!=null) {
			count+=q.head().getCount();
			if(count>=n&&!flag) {
				num=q.head().getNum();
				flag=true;
			}
			q.insert(q.remove());
		}
		q.remove();
		return num;
	}
	
	public void removeNum(int x) {
		
	}
}
