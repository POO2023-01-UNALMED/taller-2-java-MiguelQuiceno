package test;
public class Auto {
    String modelo;
    int precio;
    Asiento[] asientos;
    String marca;
    Motor motor;
    int registro;
    static int cantidadCreados;

    int cantidadAsientos(){
        int a = 0;
        for(int i = 0; i < this.asientos.length; i++){
            if(this.asientos[i] != null){
                a++;
            }
        }
        return a;
        
    }
    String verificarIntegridad(){
        boolean f = false;
        if(this.registro == this.motor.registro){
            f = true;
            for(int i = 0; i < this.asientos.length; i++){
                if(this.asientos[i] != null){
                    if(this.asientos[i].registro != this.registro){
                        f = false;
                    }
                }
            }
        }
        if(f){
            return "Auto original";
        }else{
            return "Las piezas no son originales";
        }
    }
    
}
