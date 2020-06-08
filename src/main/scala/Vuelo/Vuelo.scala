package Vuelo
import Pasaje._
import Avion._
import Tripulante._

class Vuelo{
	//Atributos
	var _id : String = _;
	var _destino : String = _;
	var _origen : String = _;
	var _pasajes : List[Pasaje] = List();
	var _avion : Avion = _;
	var _tripulacion : List[Tripulante] = List();

	//Constructor
	def this(id : String, destino : String, origen : String, pasajes : List[Pasaje], 
		avion : Avion, tripulacion : List[Tripulante]) = {
		this();
		_id = id;
		_destino = destino;
		_origen = origen;
		_pasajes = pasajes;
		_avion = avion;
		_tripulacion = tripulacion;
	}
}