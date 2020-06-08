package Vuelo
import Pasaje._
import Avion._
import Tripulante._
import scala.util.Random
class Vuelo{
	//Atributos
	var _id : String = generarId();
	var _destino : String = _;
	var _origen : String = _;
	var _pasajes : List[Pasaje] = List();
	var _avion : Avion = _;
	var _tripulacion : List[Tripulante] = List();
	var _fecha : String = _;
	var _hora : String = _;

	def generarId() : String = {
		var codigo : String = Random.alphanumeric.take(7).mkString("")
		return codigo
	}  

	//Constructor
	def this(destino : String, origen : String, pasajes : List[Pasaje], 
		avion : Avion, tripulacion : List[Tripulante], fecha : String, hora : String) = {
		this();
		_destino = destino;
		_origen = origen;
		_pasajes = pasajes;
		_avion = avion;
		_tripulacion = tripulacion;
		_fecha = fecha;
		_hora = hora;
	}
}