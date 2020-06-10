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

    var tripulante1 : Tripulante = new Tripulante("Jorge", "ope@av.com")
    var tripulante2 : Tripulante = new Tripulante("Eduardo", "ee@av.com")

    var pasajero1 : Pasajero = new Pasajero("Pepe", "pp@go.com")

    println("Programando vuelo para Cali - Bogota a las 8:55 el 12/22/2020")
    aeropuerto.ProgramacionVuelos("Cali", "Bogota", "0855", "12/12/2020", avion1)

    println("Programando Avion ")
    aeropuerto.ProgramarAvion(aeropuerto.vuelos.head._id, avion2)

    println("Comprando pasajes...")
    pasajero1.comprarPasajes(aeropuerto.vuelos.head)

    println("Vuelo Eliminado e")
    aeropuerto.CancelarVuelos(aeropuerto.vuelos.head)




}