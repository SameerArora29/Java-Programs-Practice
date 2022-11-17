public class PairAgain<T,V> {

	private T first;
	private V second;
	
	public PairAgain(T first,V second) {
		this.first=first;
		this.second=second;
	}
	
	public void setfirst(T first) {
		this.first = first;
	}
	public T getfirst() {
		return first;
	}
	
	public V getsecond() {
		return second;
	}
	
	public void setsecond(V second) {
		this.second=second;
	}

}