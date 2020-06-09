ThisBuild / organization := "JaverianaCali"
ThisBuild / version      := "1.0"

lazy val root = (project in file("."))
  .settings(
    name := "Service Rest",
    scalaVersion := "2.12.8",
    libraryDependencies ++= Seq(
      "com.typesafe.akka" %% "akka-actor" % "2.5.25",
      "com.typesafe.akka" %% "akka-stream" % "2.5.25",
      "com.typesafe.akka" %% "akka-http"   % "10.1.9",
      "com.typesafe.play" %% "play-json" % "2.7.3",
      "com.typesafe.akka" %% "akka-http-spray-json" % "10.1.9"
    )
  )