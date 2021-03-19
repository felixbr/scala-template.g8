import sbt._

object Version {
  val circe    = "0.14.0-M4"
  val akka     = "2.5.23"
  val akkaHttp = "10.1.8"
  val http4s   = "1.0.0-M18"
  val log4j2   = "2.11.1"
  val log4cats = "2.0.0-RC1"
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

    val noGeneric = List(core, parser)
    val json      = List(core, generic, parser)
    val all       = List(core, generic, genericExtras, parser, literal, yaml)
  }

  object akka {
    val actor   = "com.typesafe.akka" %% "akka-actor"   % Version.akka
    val cluster = "com.typesafe.akka" %% "akka-cluster" % Version.akka
    val stream  = "com.typesafe.akka" %% "akka-stream"  % Version.akka

    val http      = "com.typesafe.akka" %% "akka-http"       % Version.akkaHttp
    val httpCirce = "de.heikoseeberger" %% "akka-http-circe" % "1.27.0"

    val testkit       = "com.typesafe.akka" %% "akka-testkit"        % Version.akka     % Test
    val streamTestkit = "com.typesafe.akka" %% "akka-stream-testkit" % Version.akka     % Test
    val httpTestkit   = "com.typesafe.akka" %% "akka-http-testkit"   % Version.akkaHttp % Test

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

  val cats       = "org.typelevel" %% "cats"           % "2.4.0"
  val catsEffect = "org.typelevel" %% "cats-effect"    % "3.0.0-RC2"
  val monix      = "io.monix"      %% "monix"          % "3.2.2"
  val decline    = "com.monovore"  %% "decline-effect" % "1.0.0"

  val betterFiles = "com.github.pathikrit" %% "better-files" % "3.7.1"
  val pureConfig  = "com.github.melrief"   %% "pureconfig"   % "0.10.2"
  val pprint      = "com.lihaoyi"          %% "pprint"       % "0.6.0"

  val collectionCompat = "org.scala-lang.modules" %% "scala-collection-compat" % "2.1.6"

  object testing {
    val scalaTest               = "org.scalatest"     %% "scalatest"       % "3.2.6"   % Test
    val scalaCheck              = "org.scalacheck"    %% "scalacheck"      % "1.15.3"  % Test
    val scalaTestPlusScalaCheck = "org.scalatestplus" %% "scalacheck-1-15" % "3.2.6.0" % Test

    val all = List(scalaTest, scalaCheck, scalaTestPlusScalaCheck)
  }

  object logging {
    val log4catsCore  = "org.typelevel" %% "log4cats-core"  % Version.log4cats
    val log4catsSLF4J = "org.typelevel" %% "log4cats-slf4j" % Version.log4cats

    object log4j2 {
      val core = "org.apache.logging.log4j" % "log4j-core"       % Version.log4j2
      val api  = "org.apache.logging.log4j" % "log4j-api"        % Version.log4j2
      val impl = "org.apache.logging.log4j" % "log4j-slf4j-impl" % Version.log4j2

      val all = List(core, api, impl)
    }

    val viaLog4j2 = List(log4catsCore, log4catsSLF4J) ++ log4j2.all
  }
}
