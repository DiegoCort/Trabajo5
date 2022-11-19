
package figuras;

public class Cilindro extends FigurasGeometricas {
   
    private double radio, altura;
    //constructor de la clase Cilindro
    public Cilindro(double radio, double altura){
        this.altura=altura;
        this.radio=radio;
        this.setVolumen(calcularVolumen());
        this.serSuperficie(calcularSuperficie());
    }
    //Metodo para calcular el volumen de un cilindro
    public double calcularVolumen(){
        double volumen = Math.PI*altura*Math.pow(radio, 2.0);
        return volumen;
    }
    //Metodo para calcular la superficie de un cilindro
    public double calcularSuperficie(){
       double alA, alB;
       alA = 2.0*Math.PI*radio*altura;
       alB = 2.0*Math.PI*Math.pow(radio, 2.0);
       return alA+alB;
    }
}
