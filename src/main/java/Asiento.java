public class Asiento {
    public String color;
    int precio;
    int registro;

    void cambiarColor(String color){
        if(color == "rojo" ||color == "cerde" ||color == "amarillo" ||color == "negro" ||color == "blanco"){
            this.color = color;
        }
    }
    
}
