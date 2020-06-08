import TipoPasaje._

class Silver extends TipoPasaje{
	//Constructor
	def this(id : String, caracteristica : String) = {
		this();
		_id = id;
		_caracteristica = caracteristica;
	}
}