package Pasajero
import scala.io._
import scala.util._

class Pasajero extends ModuloPasajero{
	//Atributos y metodos
	var _id : String = _
    var _nombre : String = _ 
    var _correo : String = _
    var _pasajes : List[Int] = List()

    def verificarDocumentos () : Boolean = {
        println("Verificando Documentos...")
        println("Ingrese su Documento: ")
        var entrada : String = StdIn.readLine()

        if( entrada != this._id ){
            println("Documento Errado")
            return false
        }
        println("Documento Correcto")
        return true

    }
    def comprarPasajes (cantidad : Int, cantidadM : Int) : Boolean = {
        


    }
    def pedirServicioEspecial (idPasaje: String) : Unit ={

            println("Qué Servicio Especial desea crear? Silla de Rueda, Mascota o Niños");
            var opcionServicio : String = StdIn.readLine()
            var claseServicio = Class.forName("ServicioEspecial." + opcionServicio)
            var instanciaServicio = claseServicio.newInstance();
            var Servicio = instanciaServicio.asInstanceOf[ServicioEspecial]

    }



}