package Aeropuerto

import scala.io._
import scala.util._
import ServicioEspecial._
import Pasaje._
import TipoPasaje._
import Vuelo._
import Avion._
import Tripulante._
import Pasajero._

class Aeropuerto extends ModuloControlVuelos{

    var vuelos : List[Vuelo] = List()
    var pasajeros : List[Pasajero] = List()
    var aviones : List[Avion] = List()


    def ProgramacionVuelos (origen : String, destino : String, hora : String, fecha : String, avion : Avion) : Unit = {
        var vuelo : Vuelo = new Vuelo(destino, origen, List(), 
		avion, List(), fecha, hora)

        vuelos = vuelo::vuelos

    }

    def ProgramacionTripulantes (idVuelo : String) : Unit = {
        
        println("Cuantos tripulantes desea agregar? ")

        var numTripu : Int = StdIn.readInt()

        for(v <- this.vuelos){
            if(v._id == idVuelo){
                while(numTripu > 0){

                    println(" Ingrese nombre: ")
                    var nombre : String = StdIn.readLine()
                    println(" Ingrese Correo: ")
                    var correo : String = StdIn.readLine()

                    var tripu : Tripulante = new Tripulante(nombre, correo)



                    numTripu = numTripu - 1

                }

            }

        }   

    }
    def CancelarVuelos (vuelo : Vuelo) : Unit = {

        this.vuelos = this.vuelos.filter(_ != vuelo)

    }
    def CambiarAviones (idAvionNuevo : String, idAvionViejo : String) : Boolean = {
        return true
    }
    def ProgramarAvion(idVuelo : String, avion : Avion) : Boolean = {
        return true
    }




}