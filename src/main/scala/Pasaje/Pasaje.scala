package Pasaje
import ServicioEspecial._
import TipoPasaje._
import Vuelo._

class Pasaje{
	//Atributos
	var _id : String = _;
	var _fecha : String = _;
	var _hora : String = _;
	var _vuelo : Vuelo = _;
	var _serviciosEspeciales : List [ServicioEspecial] = List();
	var _numMaletas : Int = _;
	var _tipoPasaje : TipoPasaje = _;

	//Constructor
	def this(id : String, fecha : String, hora : String, vuelo : Vuelo, 
		serviciosEspeciales : List [ServicioEspecial], maletas : Int, tipoPasaje : TipoPasaje) = {
		this();
		_id = id;
		_fecha = fecha;
		_hora = hora;
		_vuelo = vuelo;
		_serviciosEspeciales = serviciosEspeciales;
		_numMaletas = maletas;
		_tipoPasaje = tipoPasaje;
	}
}