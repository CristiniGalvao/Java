/**
 *Crie uma interface chamada Desenhavel com um método desenhar() que não retorna nada. 
 * Em seguida, implemente essa interface em três classes diferentes: Circulo, Retangulo e Triangulo. 
 * Cada classe deve implementar o método desenhar() para exibir o nome da forma geométrica correspondente.
 */
package exer1listainterface;
public class Exer1ListaInterface {

    public static void main(String[] args) {
        Desenhavel desenho = new Circulo();
        Desenhavel desenho1 = new Triangulo();
        Desenhavel desenho2 = new Retangulo();
        
        System.out.println("----------------------");
        System.out.println("Formas Geometricas");
        System.out.println("----------------------");
        desenho.desenhar();
        desenho1.desenhar();
        desenho2.desenhar();
        System.out.println("----------------------");
    }
    
}
