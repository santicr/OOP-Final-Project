package Avion
import scala.io._
import scala.util._
class Avion{
	//Atributos
	var _id : String = generarId();
	var _disponible : Boolean = _;

	def generarId() : String = {
		var codigo : String = Random.alphanumeric.take(7).mkString("")
		return codigo
	}  

	//Constructor
	def this(disponible : Boolean) = {
		this();
		_disponible = disponible;
	}
	
}