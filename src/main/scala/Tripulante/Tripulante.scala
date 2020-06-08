package Tripulante

class Tripulante{
	//Atributos
	var _id : String = _;
	var _nombre : String = _;
	var _correo : String = _;

	//Constructor
	def this(id : String, nombre : String, correo : String){
		this();
		_id = id;
		_nombre = nombre;
		_correo = correo;
	}
}