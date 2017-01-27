import sbt._

object Lib {

  object circe {
    val core    = "io.circe" %% "circe-core"    % Version.circe
    val generic = "io.circe" %% "circe-generic" % Version.circe
    val parser  = "io.circe" %% "circe-parser"  % Version.circe
    val yaml    = "io.circe" %% "circe-yaml"    % "0.4.0"
  }

  object akka {
    val actor   = "com.typesafe.akka" %% "akka-actor"   % Version.akka
    val cluster = "com.typesafe.akka" %% "akka-cluster" % Version.akka
    val stream  = "com.typesafe.akka" %% "akka-stream"  % Version.akka
    val http    = "com.typesafe.akka" %% "akka-http"    % Version.akka

    val testkit       = "com.typesafe.akka" %% "akka-testkit"        % Version.akka % "test"
    val httpTestkit   = "com.typesafe.akka" %% "akka-http-testkit"   % Version.akka % "test"
    val streamTestkit = "com.typesafe.akka" %% "akka-stream-testkit" % Version.akka % "test"
  }

  val cats = "org.typelevel" %% "cats" % "0.9.0"

  val betterFiles = "com.github.pathikrit" %% "better.files" % "2.17.1"

  val pureConfig = "com.github.melrief" %% "pureconfig" % "0.5.0"

  val pprint = "com.lihaoyi" %% "pprint" % "0.4.4"

  val scalaTest = "org.scalatest" %% "scalatest" % "3.0.0" % "test"

}

object Version {

  val circe = "0.7.0"
  val akka  = "2.4.16"

}
