package Pacote;

class C3 extends C1 implements I1, I2 {
    private double atributoC3;

    public C3(String atributoC1, double atributoC3) {
        super(atributoC1);
        this.atributoC3 = atributoC3;
    }

    @Override
    public void metodoI1() {
        System.out.println("Implementação do método da interface I1 em C3.");
    }

    @Override
    public void metodoI2A() {
        System.out.println("Implementação do método A da interface I2 em C3.");
    }

    @Override
    public void metodoI2B() {
        System.out.println("Implementação do método B da interface I2 em C3.");
    }

    @Override
    public void metodoAbstratoC1() {
        System.out.println("Implementação do método abstrato em C3.");
    }

    public void metodoC3() {
        System.out.println("Método da classe C3: " + atributoC3);
    }
}
