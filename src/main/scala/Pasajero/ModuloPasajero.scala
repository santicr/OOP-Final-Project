package Pasajero
import Vuelo._

import scala.io._
import scala.util._

trait ModuloPasajero{

    def verificarDocumentos () : Boolean
    def comprarPasajes (vuelo : Vuelo) : Try[Unit]
    def pedirServicioEspecial (idPasaje: String) : Unit


}