package Pacote;

class C4 extends C2 {
    private String atributoC4;

    public C4(String atributoC1, int atributoC2, String atributoC4) {
        super(atributoC1, atributoC2);
        this.atributoC4 = atributoC4;
    }

    public void metodoC4() {
        System.out.println("Método da classe C4: " + atributoC4);
    }

    // Sobrecarga de métodos
    public void metodoSobrecarga(int valor) {
        System.out.println("Sobrecarga com int: " + valor);
    }

    public void metodoSobrecarga(String valor) {
        System.out.println("Sobrecarga com String: " + valor);
    }
}