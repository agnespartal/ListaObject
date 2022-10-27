package model;

public interface InterfaceListaObject {
	
	public boolean isEmpty();
	public int size();
	public No getNo(int posicao) throws Exception;
	public void addFirst (Object valor);
	public void addLast (Object valor) throws Exception;
	public void add (Object valor, int posicao)throws Exception;
	public void removeFirst ()throws Exception;
	public void removeLast()throws Exception;
	public void remove (int posicao)throws Exception;
	public Object get(int posicao)throws Exception;
}
