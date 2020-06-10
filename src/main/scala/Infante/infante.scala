package Infante
import Pasajero._

class Infante extends Pasajero{
    
    //Atributos
    var _ingresado : Boolean = false;
    var _entregado : Boolean = false;


    //Métodos
    def verificarEstado() : Unit = {
        if(_ingresado){
            println("El niño esta ingresado.")
        }
        else{
            println("El niño no esta ingresado.")
        }
        if(_entregado){
            println("El niño ya fue entregado.")
        }
        else{
            println("El niño no ha sido entregado.")
        }
    }
    def ingresar() = {
        _ingresado = true
    }
    def entregar() = {
        _entregado = true
    }
    
}