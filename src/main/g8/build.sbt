lazy val root = (project in file("."))
  .settings(
    inThisBuild(
      List(
        scalaVersion := "2.12.2"
      )
    ),
    name := """$name$""",
    version := "0.1.0",
    libraryDependencies ++= List(
      Lib.cats,
      Lib.betterFiles,
      Lib.pprint,
      Lib.scalaTest,
      Lib.scalaCheck
    ) ++ Lib.circe.json
  )
  .enablePlugins(JavaAppPackaging)

scalacOptions ++= List( // useful compiler flags for scala
  "-deprecation",
  "-encoding",
  "UTF-8", // yes, this is 2 args
  "-feature",
  "-unchecked",
  "-Xfatal-warnings",
  "-Xlint",
  "-Yno-adapted-args",
  "-Ywarn-numeric-widen",
  "-Xfuture"
)
