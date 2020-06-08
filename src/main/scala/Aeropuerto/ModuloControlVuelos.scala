package Aeropuerto

import Vuelo._
import Avion._

import scala.io._
import scala.util._

trait ModuloControlVuelos{

    def ProgramacionVuelos (origen : String, destino : String, hora : Double, fecha : String, avion : Avion) : Boolean
    def ProgramacionTripulantes (idVuelo : String) : Boolean
    def CancelarVuelos (vuelo : Vuelo) : Boolean
    def CambiarAviones (idAvionNuevo : String, idAvionViejo : String) : Boolean
    def ProgramarAvion(idVuelo : String, avion : Avion) : Boolean


}