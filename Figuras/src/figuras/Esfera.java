
package figuras;

public class Esfera extends FigurasGeometricas {
    
    private double radio;
    //constructor de la clase esfera
    public Esfera(double radio){
        this.setVolumen(calcularVolumen());
        this.serSuperficie(calcularSuperficie());   
    }
    //Metodo para calcular el volumen de una esfera
    public double calcularVolumen(){
       double volumen = 1.333*Math.PI*Math.pow(this.radio, 3.0);
       return volumen;
    }
    //Metodo para calcular la superficie de una esfera
    public double calcularSuperficie(){
        double superficie=4.0*Math.PI*Math.pow(this.radio, 2.0);
        return superficie;
    }
}
