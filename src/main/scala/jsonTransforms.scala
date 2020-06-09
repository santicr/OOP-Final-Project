package Server3

import spray.json._
import akka.http.scaladsl.marshallers.sprayjson.SprayJsonSupport
import DefaultJsonProtocol._

case class Person(name: String, favoriteNumber: Int)

trait JsonSupport extends SprayJsonSupport with DefaultJsonProtocol {
  implicit val personFormat = jsonFormat2(Person)
}