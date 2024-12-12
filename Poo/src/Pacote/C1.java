package Pacote;

public abstract class C1 {
	protected String atributoC1;

    public C1(String atributoC1) {
        this.atributoC1 = atributoC1;
    }

    public abstract void metodoAbstratoC1();

    public void metodoC1() {
        System.out.println("Método da classe C1: " + atributoC1);
    }


}
