# Cap�tulo 3::Exerc�cio 1

A estrutura de uma classe em Java � como o exemplo que segue:

    // declara��o da classe, usualmente p�blica
    public class NomeDaClasse {
    	// declara��o dos campos (vari�veis-membro) da classe
    	// que podem ser: de tipos primitivos e
    	// ser public, protected ou private.
    	private int valor1;
    	protected double valor 2;
    	public boolean valor3;
    	
    	// ou tamb�m de tipos designados por outras classes
    	private String nome;
    	protected OutraClasse oc;
    	
    	// um ou mais construtores que:
    	// - sempre possuem o nome da classe
    	// - geralmente s�o public (mas podem ser protected ou private)
    	// - podem receber par�metros ou
    	// - n�o receber par�metros (construtor dito default)
    	public NomeDaClasse () {
    		// c�digo do construtor
    	}
    	
    	// declara��o dos m�todos (fun��es-membro) da classe
    	// que podem: ser parametrizadas; retornar valores; e
    	// ser public, protected ou private.
    	public void trocaNome(String n) {
    	    // c�digo do m�todo
    		nome = n;
    	}
    	private double somaCampos() {
    		return valor1 + valor2;
    	}
    }

Refer�ncia (se��o): 3.1
