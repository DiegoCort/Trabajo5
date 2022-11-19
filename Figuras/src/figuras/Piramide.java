
package figuras;

public class Piramide extends FigurasGeometricas {
    private double base, altura, apotema;
    //Metodo constructor de la clase Piramide
    public Piramide(double base, double altura, double apotema){
        this.altura=altura;
        this.apotema=apotema;
        this.base=base;
        this.setVolumen(calcularVolumen());
        this.serSuperficie(calcularSuperficie());        
    }
    //Metodo para calcular el volumen de una piramide
    public double calcularVolumen(){
        double volumen = (Math.pow(base, 2.0)*altura)/3.0;
        return volumen;
    }    
    //Metodo para calcular la superficie de una parimide 
    public double calcularSuperficie(){
        double aBase=Math.pow(base, 2.0);
        double aLado=2.0*base*apotema;
        return aBase+aLado;
    } 
}
