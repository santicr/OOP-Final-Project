package Avion

class Avion{
	//Atributos
	var _id : String = _;
	var _disponible : Boolean = _;

	//Constructor
	def this(id : String, disponible : Boolean) = {
		this();
		_id = id;
		_disponible = disponible;
	}
	
}