package Aeropuerto

import scala.io._
import scala.util._
import ServicioEspecial._
import Pasaje._
import TipoPasaje._
import Vuelo._


class Aeropuerto extends ModuloControlVuelos{

    var vuelos : List[Vuelo] = List()
    var pasajeros : List[Pasajero] = List()
    var aviones : List[Avion] = List()


    def ProgramacionVuelos (origen : String, destino : String, hora : Double, fecha : String, avion : Avion) : Boolean = {
        var vuelo : Vuelo = new Vuelo(destino, origen, List(), 
		avion, List(), fecha, hora)

        vuelos = vuelo::vuelos

    }

    def ProgramacionTripulantes (idVuelo : String) : Boolean = {
        
        println("Cuantos tripulantes desea agregar? ")

        var numTripu : Int = StdIn.ReadInt()

        for(v <- this.vuelos){
            if(v._id == idVuelo){
                while(numTripu > 0){

                    println(" Ingrese nombre: ")
                    var nombre : String = StdIn.ReadLine()
                    println(" Ingrese Correo: ")
                    var correo : String = StdIn.ReadLine()

                    var tripu : Tripulante = new Tripulante(nombre, correo)



                    numTripu--

                }
                return true
            }

        }   
        return false
    }
    def CancelarVuelos (vuelo : Vuelo) : Boolean = {

        for(v <- this.vuelos){
                        
        }

    }
    def CambiarAviones (idAvionNuevo : String, idAvionViejo : String) : Boolean
    def ProgramarAvion(idVuelo : String, avion : Avion) : Boolean




}