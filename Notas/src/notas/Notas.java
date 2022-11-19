
package notas;

public class Notas {
    //Array de notas
    double [] ListaNotas; 
    
    /**se crea el constructor notas y se le da 
    tamaño al array
    */
    public Notas(){
        ListaNotas = new double[5];
    }
    
    /** Metodo para calcular el promedio de 
    las notas y se optiene mediante un return
     */
    double cPromedio(){
        double suma = 0;
        for(int i=0;i<ListaNotas.length;i++){
            suma+=ListaNotas[i];
        }
        return(suma/ListaNotas.length);
    }
    
    /**Metodo para calcular la desviacion estandar 
    del array de notas mediante un return
     */
    double dEstandar(){
        double promedio = cPromedio();//se calcula el promedio mediante el metodo
        double suma = 0;
        for(int i=0;i<ListaNotas.length;i++){
            suma+=Math.pow(ListaNotas[i]-promedio, 2);//sumatoria de alementos
        }
        return Math.sqrt(suma/ListaNotas.length);//calculo de la desviacion
    }
    
    /**Metodo para calcular el valor menor de las 
    notas en el array mediante el return 
     */
    double cMenor(){
        double menor = ListaNotas[0];//Se crea una variable como la nota menor
        for(int i = 0;i<ListaNotas.length;i++){
            /**
            se compara la variable con las notas de array
            * y si alguna es menor se actualiza
             */
            if(ListaNotas[i]<menor){;
                menor=ListaNotas[i];
            }
        }
        return menor;
    }
    
    /**Metodo para calcular el valor mayor de las 
    notas en el array mediante el return
     */
    double cMayor(){
        double mayor = ListaNotas[0];//Se crea una variable como la nota mayor
        for(int i = 0;i<ListaNotas.length;i++){
            /**
            se compara la variable con las notas de array
            * y si alguna es mayor se actualiza
             */
            if(ListaNotas[i]>mayor){
                mayor=ListaNotas[i];
            }
        }
        return mayor;
    }
}
