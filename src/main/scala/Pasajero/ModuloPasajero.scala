package Pasajero


trait ModuloPasajero{

    def verificarDocumentos () : Boolean
    def comprarPasajes (cantidad : Int, cantidadM : Int) : Boolean
    def pedirServicioEspecial (idPasaje: String) : Unit


}