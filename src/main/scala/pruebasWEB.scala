package Server3

import Avion._
import Pasaje._
import ServicioEspecial._
import TipoPasaje._
import Tripulante._
import Vuelo._
import Aeropuerto._
import Pasajero._

import akka.http.scaladsl.Http
import akka.http.scaladsl.server._
import akka.actor.ActorSystem
import akka.stream.ActorMaterializer


object Server extends App with Directives with JsonSupport{
	var aero = new Aeropuerto();
	var tP = new TipoPasaje("123", "gold")
	var p1 = new Pasajero("98", "Roberto Gomez", "elchavo@hotmail.com");
	var avion1 = new Avion(true);
	var vuelo = new Vuelo("Cali", "Bogota", List(), avion1, List(), "0906", "1800");
	var avion2 = new Avion(true);
	var pasaje1 = new Pasaje("0918", "1800", vuelo, List(), 4, tP);

	var t1 = new Tripulante("Carlos", "c@hotmail.com");
	var t2 = new Tripulante("Pedro", "p@hotmail.com");

    implicit val system = ActorSystem("actor-system")
    implicit val materializer: ActorMaterializer = ActorMaterializer()

    val routes: Route =
        path("aero") { 
        	get{
        		complete(avion1._id + " " + avion2._id + " ");
        	}
        } ~
        path("aeroVUELOS" / Segment / Segment){ (idAvion1, idAvion2) =>
        	aero.CambiarAviones(idAvion1, idAvion2)
        	post{
        		complete("Avion " + idAvion1 + " cambiado por el avion " + idAvion2);
        	}
        } ~
        path("aeroVUELOS" / Segment){ (idAvion) =>
        	aero.ProgramacionTripulantes(idAvion)
        	get{
        		complete("Los tripulantes se han programado exitosamente al avion con id " + idAvion);
        	}
        } ~
        path("aeroINFANTIL" / Segment){ (idPasaje) =>
        	p1.pedirServicioEspecial(idPasaje);
        	get{
        		complete("Se ha añadido un servicio especial al pasaje con id " + idPasaje);
        	}
        } ~
        path("aeroINFANTIL"){
            get{
                complete(pasaje1._id);
            }
        } ~
        path("aeroVerifica"){ 
        	p1.verificarDocumentos();
        	post{
        		complete("Se han verificado los documentos del pasajero con id " + p1._id);
        	}
        } ~
        path("aeroV"){ 
            post{
                complete(p1._id)
            }
        }


    Http().bindAndHandle(routes, "0.0.0.0", 8002)
}