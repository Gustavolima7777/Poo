package Pacote;

public class C2 extends C1 {

	 private int atributoC2;

	    public C2(String atributoC1, int atributoC2) {
	        super(atributoC1);
	        this.atributoC2 = atributoC2;
	    }

	    public void metodoC2() {
	        System.out.println("Método da classe C2: " + atributoC2);
	    }

	    @Override
	    public void metodoAbstratoC1() {
	        System.out.println("Implementação do método abstrato em C2.");
	    }
	}
