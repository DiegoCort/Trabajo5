
package figuras;

public class FigurasGeometricas {

    private double volumen, superficie;
    //establecemos el volumen
    public void setVolumen(double volumen){
        this.volumen=volumen;
    }
    //establecemos la supercie
    public void serSuperficie(double superficie){
        this.superficie=superficie;
    }
    //Metodo para obteber el volumen de una figura
    public double getVolumen(){
        return this.volumen;
    }
    //Metodo para obteber la superficie de una figura
    public double getSuperficie(){
        return this.superficie;
    }
}
