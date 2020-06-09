package Aeropuerto

import Vuelo._
import Avion._

import scala.io._
import scala.util._

trait ModuloControlVuelos{

    def ProgramacionVuelos (origen : String, destino : String, hora : String, fecha : String, avion : Avion) : Unit
    def ProgramacionTripulantes (idVuelo : String) : Unit
    def CancelarVuelos (vuelo : Vuelo) : Unit
    def CambiarAviones (idAvionNuevo : String, idAvionViejo : String) : Unit
    def ProgramarAvion(idVuelo : String, avion : Avion) : Unit


}