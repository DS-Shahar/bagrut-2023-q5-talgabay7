
public class NumCount {

	private int num;
	private int count;

	public NumCount(int num, int count) {
		this.num = num;
		this.count = count;
	}

	public int getNum() {
		return num;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	public String toString() {
		return "NumCount [num=" + num + ", count=" + count + "]";
	}
}
