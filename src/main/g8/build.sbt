Global / onChangedBuildSource := ReloadOnSourceChanges
ThisBuild / turbo := true

lazy val root = (project in file("."))
  .settings(
    inThisBuild(
      List(
        scalaVersion := "3.0.0-RC1"
      )
    ),
    name := "$name$",
    version := "0.1.0",
    libraryDependencies ++= (
      List(
        //
      ) ++ Dependencies.logging.viaLog4j2 ++ Dependencies.circe.json ++ Dependencies.http4s.all
    ),
    libraryDependencies ++= List(
      Dependencies.testing.scalaTest, // Scalatest uses macros, so we cannot simply use the ".withDottyCompat" solution but need actual cross-built versions
      Dependencies.testing.scalaCheck,
      Dependencies.testing.scalaTestPlusScalaCheck
    )
  )
  .enablePlugins(JavaAppPackaging)

// format: off
scalacOptions ++= List( // useful compiler flags for scala
  "-deprecation",                      // Emit warning and location for usages of deprecated APIs.
  "-encoding", "utf-8",                // Specify character encoding used by source files.
  "-feature",                          // Emit warning and location for usages of features that should be imported explicitly.
  "-unchecked",                        // Enable additional warnings where generated code depends on assumptions.
  "-Xfatal-warnings",                  // Fail the compilation if there are any warnings.
  "-language:implicitConversions"
)
// format: on

addCommandAlias("scalafmtFormatAll", "; root/scalafmtAll ; root/scalafmtSbt")
addCommandAlias("scalafmtValidateAll", "; root/scalafmtCheckAll ; root/scalafmtSbtCheck")
