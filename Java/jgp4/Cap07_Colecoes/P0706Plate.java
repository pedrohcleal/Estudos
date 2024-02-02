public class P0706Plate implements Comparable< P0706Plate > {
	private double altura, largura; // dimens�es da placa
	private String tipo; // tipo/descri��o da placa
	
	// construtor parametrizado
	public P0706Plate (double altura, double largura, String tipo) {
		if (altura<=0 || largura<=0)
			throw new RuntimeException("Dimensoes invalidas."); 
		this.altura = altura; this.largura = largura;
		this.tipo = tipo; 
	}
	
	// apenas m�todos de acesso, assim campos imut�veis
	public double getAltura () { return altura; }
	public double getLargura () { return largura; }
	public String getTipo () { return tipo; }
	
	// fun��o de hashing adaptada
	@Override
	public int hashCode () { 
		return (int)(altura*largura-altura);
	}
	
	// retorna resultado an�logo a compareTo
	@Override
	public boolean equals (Object obj) {
		if (!(obj instanceof P0706Plate)) return false;
		return compareTo((P0706Plate)obj)==0;
	}
	
	// representa��o textual do objeto
	@Override
	public String toString () {
		return "[" + altura + "x" + largura + ":" + tipo + "]";
	}
	
	// se dimens�es s�o iguais retorna 0, ou considera ordena��o
	// crescente de altura*largura, alturas menores primeiro
	@Override
	public int compareTo (P0706Plate obj) {
		// determina diferen�a das �reas
		double res = altura*largura - obj.getAltura()*obj.getLargura();
		// se diferenca==0, �reas iguais, retorna diferen�a das alturas,
		// sen�o retorna diferen�a das �reas
		return (int)(res == 0 ? altura-obj.getAltura() : res);
	}
}
