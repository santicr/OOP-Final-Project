import Avion._
import Pasaje._
import ServicioEspecial._
import TipoPasaje._
import Tripulante._
import Vuelo._
import Aeropuerto._
import Pasajero._
import scala.io._
import scala.util._


object main extends App{
	
    var aeropuerto : Aeropuerto = new Aeropuerto()

    var avion1 : Avion = new Avion(true)
    var avion2 : Avion = new Avion(true)


    println("ID avion1 = " + avion1._id)
    println("ID avion2 = " + avion2._id)

    var tripulante1 : Tripulante = new Tripulante("Jorge", "ope@av.com")
    var tripulante2 : Tripulante = new Tripulante("Eduardo", "ee@av.com")

    var pasajero1 : Pasajero = new Pasajero("123", "Pepe", "pp@go.com")

    println("Programando vuelo para Cali - Bogota a las 8:55 el 12/22/2020")
    aeropuerto.ProgramacionVuelos("Cali", "Bogota", "0855", "12/12/2020", avion1)

    println("Imprimiendo vuelos: ")
    for(v <- aeropuerto.vuelos){
        println("Vuelo: " + v._id + " | " + v._origen + " | " + v._destino + " | " + "avion: " + v._avion._id + " | ")
    }

    println("Programando Avion ")
    aeropuerto.ProgramarAvion(aeropuerto.vuelos.head._id, avion2)

    println("Imprimiendo vuelos: ")
    for(v <- aeropuerto.vuelos){
        println("Vuelo: " + v._id + " | " + v._origen + " | " + v._destino + " | " + "avion: " + v._avion._id + " | ")
    }

    println("Comprando pasajes...")
    var prueba = pasajero1.comprarPasajes(aeropuerto.vuelos.head)

    prueba match{
        case Success(s) => println("\nPasaje comprado\n")
        case Failure(f) => println(f)
    }

    for(p <- pasajero1._pasajes){
        println("Fecha: " + p._fecha + " Maletas: " + p._numMaletas)
    }

    println("Vuelo Eliminado e")
    aeropuerto.CancelarVuelos(aeropuerto.vuelos.head)

    println("Imprimiendo vuelos: ")
    for(v <- aeropuerto.vuelos){
        println("Vuelo: " + v._id + " | " + v._origen + " | " + v._destino + " | " + "avion: " + v._avion._id + " | ")
    }


}