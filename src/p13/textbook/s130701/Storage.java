package p13.textbook.s130701;

public interface Storage<T> {
	public void add(T itme, int index);
	public T get(int index);
}
