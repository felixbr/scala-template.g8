import sbt._

object Version {
  val circe    = "0.13.0"
  val akka     = "2.5.23"
  val akkaHttp = "10.1.8"
  val http4s   = "0.21.0"
}

object Dependencies {

  object circe {
    val core          = "io.circe" %% "circe-core"           % Version.circe
    val generic       = "io.circe" %% "circe-generic"        % Version.circe
    val parser        = "io.circe" %% "circe-parser"         % Version.circe
    val java8         = "io.circe" %% "circe-java8"          % Version.circe
    val literal       = "io.circe" %% "circe-literal"        % Version.circe
    val genericExtras = "io.circe" %% "circe-generic-extras" % Version.circe
    val derivation    = "io.circe" %% "circe-derivation"     % "0.12.0-M6"
    val yaml          = "io.circe" %% "circe-yaml"           % "0.11.0-M1"

    val json = List(core, generic, genericExtras, parser)
    val all  = List(core, generic, genericExtras, parser, literal, yaml)
  }

  object akka {
    val actor   = "com.typesafe.akka" %% "akka-actor"   % Version.akka
    val cluster = "com.typesafe.akka" %% "akka-cluster" % Version.akka
    val stream  = "com.typesafe.akka" %% "akka-stream"  % Version.akka

    val http      = "com.typesafe.akka" %% "akka-http"       % Version.akkaHttp
    val httpCirce = "de.heikoseeberger" %% "akka-http-circe" % "1.27.0"

    val testkit       = "com.typesafe.akka" %% "akka-testkit"        % Version.akka     % "test"
    val streamTestkit = "com.typesafe.akka" %% "akka-stream-testkit" % Version.akka     % "test"
    val httpTestkit   = "com.typesafe.akka" %% "akka-http-testkit"   % Version.akkaHttp % "test"

    val allHttp = List(http, httpCirce, httpTestkit)
  }

  object http4s {
    val core        = "org.http4s" %% "http4s-core"         % Version.http4s
    val dsl         = "org.http4s" %% "http4s-dsl"          % Version.http4s
    val blazeServer = "org.http4s" %% "http4s-blaze-server" % Version.http4s
    val blazeClient = "org.http4s" %% "http4s-blaze-client" % Version.http4s
    val circe       = "org.http4s" %% "http4s-circe"        % Version.http4s

    val server = List(blazeServer, dsl, circe)
    val client = List(blazeClient, circe)
    val all    = (server ++ client).distinct
  }

  val cats    = "org.typelevel" %% "cats"           % "2.0.0"
  val monix   = "io.monix"      %% "monix"          % "3.1.0"
  val decline = "com.monovore"  %% "decline-effect" % "1.0.0"

  val betterFiles = "com.github.pathikrit" %% "better-files" % "3.7.1"
  val scalajHttp  = "org.scalaj"           %% "scalaj-http"  % "2.4.1"
  val pureConfig  = "com.github.melrief"   %% "pureconfig"   % "0.10.2"
  val pprint      = "com.lihaoyi"          %% "pprint"       % "0.5.4"
  val scalaTest   = "org.scalatest"        %% "scalatest"    % "3.0.8" % "test"
  val scalaCheck  = "org.scalacheck"       %% "scalacheck"   % "1.14.1" % "test"

  object logging {
    val log4cats = "io.chrisdavenport" %% "log4cats-slf4j" % "1.0.0"
    val logback  = "ch.qos.logback"    % "logback-classic" % "1.2.3"

    val viaLogback = List(log4cats, logback)
  }
}
