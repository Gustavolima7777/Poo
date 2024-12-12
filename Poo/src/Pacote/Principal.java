package Pacote;

public class Principal {

	public static void main(String[] args) {
		// Teste das classes concretas
        C2 objC2 = new C2("Atributo C1 em C2", 10);
        objC2.metodoC1();
        objC2.metodoC2();
        objC2.metodoAbstratoC1();

        C3 objC3 = new C3("Atributo C1 em C3", 20.5);
        objC3.metodoC1();
        objC3.metodoC3();
        objC3.metodoAbstratoC1();
        objC3.metodoI1();
        objC3.metodoI2A();
        objC3.metodoI2B();

        C4 objC4 = new C4("Atributo C1 em C4", 15, "Atributo C4");
        objC4.metodoC1();
        objC4.metodoC2();
        objC4.metodoC4();
        objC4.metodoSobrecarga(100);
        objC4.metodoSobrecarga("Texto sobrecarregado");

        C5 objC5 = new C5("Atributo C1 em C5", 20, true);
        objC5.metodoC1();
        objC5.metodoC2();
        objC5.metodoC5();
        objC5.metodoI1();

	}

}
