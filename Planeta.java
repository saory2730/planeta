
public class Planeta {
//Katerin Saory Cortes Quiñones
    String nombre;
    int cantSatelites;
    double masa;
    double volumen;
    double diametro;
    double distanciaSol;
    boolean  observable;


    public Planeta(String nombre, int cantSatelites, double masa, double volumen, double diametro,
            double distanciaSol, boolean observable) {
        this.nombre = nombre;
        this.cantSatelites = cantSatelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciaSol = distanciaSol;
        this.observable = observable;
    }

    public double calculoDensidad (){

        return masa/volumen;
         
    }

public void imprimirdatos(){
    System.out.println("Nombre"+ nombre);
    System.out.println("Cantidad de satelites"+ cantSatelites);
    System.out.println("Masa"+ masa);
    System.out.println("Volumen"+ volumen);
    System.out.println("Diametro"+ diametro);
    System.out.println("Distancia al sol"+ distanciaSol);
    System.out.println("¿Es observable?"+ observable);
    System.out.println("Densidad" + calculoDensidad());
}

public static void main(String[] args) {
Planeta p1= new Planeta("tierra", 1, 5.9736E24, 1.08321E12 ,12742 , 150000000, true);

Planeta p2= new Planeta("jupiter", 1, 1.899E27, 1.4313E15 ,139820 , 750000000, true);

System.out.println("Datos planetas 1");
p1.imprimirdatos();
p2.imprimirdatos();

}



}