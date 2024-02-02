import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

public class P0714Colecao<E> extends AbstractCollection<E> {
	private E dados[] = null; // array para conte�do

	// construtor default
	public P0714Colecao() { } 
	
	// constr. parametrizado
	@SuppressWarnings("unchecked")
	public P0714Colecao(Collection<E> col) { 
		dados = (E[]) col.toArray();
	}
	
	// retorna tamanho da cole��o
	@Override
	public int size() { 
		return dados == null ? 0 : dados.length;
	}
	
	// retorna Iterator para cole��o
	@Override
	public Iterator<E> iterator() {
		return new Navigator<E>();
	}
	
	// classe interna privada que define Iterator pr�prio
	private class Navigator<T> implements Iterator<T> {
		private int pos = 0; // controle de posi��o

		// verifica se existe pr�ximo 
		@Override
		public boolean hasNext() { 
			return pos < dados.length;
		}
		// oper. opcional n�o implementada
		@Override
		public void remove() {
			throw new UnsupportedOperationException();
		}
		// retorna pr�ximo elemento
		@Override
		@SuppressWarnings("unchecked")
		public T next() { 
			pos++;
			return (T)dados[pos - 1];
		}
	}
}
