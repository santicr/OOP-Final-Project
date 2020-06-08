import ServicioEspecial._

class Niños extends ServicioEspecial{
	//Constructor
	def this(id : String, caracteristica : String){
		this();
		_id = id;
		_caracteristica = caracteristica;
	}
}