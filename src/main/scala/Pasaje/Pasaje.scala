package Pasaje
import ServicioEspecial._
import TipoPasaje._
import Vuelo._
import scala.io._
import scala.util._

class Pasaje{
	//Atributos
	var _id : String = generarId();
	var _fecha : String = _;
	var _hora : String = _;
	var _vuelo : Vuelo = _;
	var _serviciosEspeciales : List [ServicioEspecial] = List();
	var _numMaletas : Int = _;
	var _tipoPasaje : TipoPasaje = _;

	def generarId() : String = {
		var codigo : String = Random.alphanumeric.take(7).mkString("")
		return codigo
	}  

	//Constructor
	def this(fecha : String, hora : String, vuelo : Vuelo, 
		serviciosEspeciales : List [ServicioEspecial], maletas : Int, tipoPasaje : TipoPasaje) = {
		this();
		_fecha = fecha;
		_hora = hora;
		_vuelo = vuelo;
		_serviciosEspeciales = serviciosEspeciales;
		_numMaletas = maletas;
		_tipoPasaje = tipoPasaje;
	}
}