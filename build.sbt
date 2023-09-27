val scala3Version = "3.3.1"

lazy val root = project
  .in(file("."))
  .settings(
    name := "authx",
    version := "0.1.0-SNAPSHOT",
    organization := "com.luckyslevin",
    scalaVersion := scala3Version,
    libraryDependencies += "org.specs2" %% "specs2-core" % "5.3.2" % Test
  )
