package Server3

import akka.http.scaladsl.Http
import akka.http.scaladsl.server._
import akka.actor.ActorSystem
import akka.stream.ActorMaterializer

import scala.io._
import scala.util._
import ServicioEspecial._
import Pasaje._
import TipoPasaje._
import Vuelo._
import Avion._
import Tripulante._
import Pasajero._
import Aeropuerto._



object Server extends App with Directives with JsonSupport{
    implicit val system = ActorSystem("actor-system")
    implicit val materializer: ActorMaterializer = ActorMaterializer()

    val routes: Route =
        path("test" / Segment / IntNumber) { (data, id) =>
            get {
                complete(data + id.toString)
            }
        }


    Http().bindAndHandle(routes, "0.0.0.0", 8002)
}