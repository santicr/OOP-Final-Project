package Tripulante

import scala.util.Random
class Tripulante{
	//Atributos
	var _id : String = generarId();
	var _nombre : String = _;
	var _correo : String = _;

	def generarId() : String = {
		var codigo : String = Random.alphanumeric.take(7).mkString("")
		return codigo
	}  


	//Constructor
	def this(nombre : String, correo : String){
		this();
		_nombre = nombre;
		_correo = correo;
	}
}