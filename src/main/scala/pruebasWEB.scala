package Server3

import akka.http.scaladsl.Http
import akka.http.scaladsl.server._
import akka.actor.ActorSystem
import akka.stream.ActorMaterializer


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