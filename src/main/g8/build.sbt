lazy val root = (project in file(".")).settings(
  inThisBuild(
    List(
      scalaVersion := "2.11.8"
    )
  ),
  name := """$name$""",
  version := "0.1.0",
  libraryDependencies ++= List(
    "org.scalatest" %% "scalatest" % "3.0.0" % "test"
  )
)

cancelable in Global := true

scalacOptions ++= List( // useful compiler flags for scala
  "-deprecation",
  "-encoding",
  "UTF-8", // yes, this is 2 args
  "-feature",
  "-language:existentials",
  "-language:higherKinds",
  "-language:implicitConversions",
  "-unchecked",
  "-Xfatal-warnings",
  "-Xlint",
  "-Yno-adapted-args",
  "-Ywarn-numeric-widen",
  "-Xfuture"
)
