package Pasajero

import scala.io._
import scala.util._
import ServicioEspecial._
import Pasaje._
import TipoPasaje._
import Vuelo._

class Pasajero extends ModuloPasajero{
	//Atributos y metodos
	var _id : String = _
    var _nombre : String = _ 
    var _correo : String = _
    var _pasajes : List[Pasaje] = List()

    def this(id : String, nombre : String, correo : String) = {
		this();
        _id = id
		_nombre = nombre
        _correo = correo
	}

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
    def comprarPasajes (vuelo : Vuelo) : Try[Unit] = {
        return Try {
            
            
            var fecha : String = vuelo._fecha

            var hora : String = vuelo._hora
            
            println(" Cuantas maletas desea? ");
            var maletas : Int = StdIn.readInt()

            println(" Que tipo de pasaje desea? Silver, Gold o Diamond ");
            var opcionPasaje : String = StdIn.readLine()
            var clasePasaje = Class.forName(opcionPasaje)
            var instanciaPasaje = clasePasaje.newInstance();
            var tipoPasaje = instanciaPasaje.asInstanceOf[TipoPasaje]
  

            var pasaje = new Pasaje( fecha, hora, vuelo, 
            List(), maletas, tipoPasaje)

            vuelo._pasajes = pasaje :: vuelo._pasajes

            this._pasajes = pasaje :: this._pasajes

        }



    }
    def pedirServicioEspecial (idPasaje: String) : Unit ={

            println("Qué Servicio Especial desea crear? Silla de Rueda, Mascota o Niños");
            var opcionServicio : String = StdIn.readLine()
            var claseServicio = Class.forName(opcionServicio)
            var instanciaServicio = claseServicio.newInstance();
            var servicio = instanciaServicio.asInstanceOf[ServicioEspecial]

            for(p <- this._pasajes){
                if(p._id == idPasaje){
                    p._serviciosEspeciales =  servicio::p._serviciosEspeciales
                }
            }
    }



}