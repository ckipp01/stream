ThisBuild / scalaVersion := "2.13.5"
ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / organization := "io.kipp"

lazy val V = new {
  val scribe = "3.5.4"
}

lazy val root = (project in file("."))
  .settings(
    name := "twitcy",
    libraryDependencies ++= Seq(
      "com.github.twitch4j" % "twitch4j" % "1.3.1",
      "com.lihaoyi" %% "mainargs" % "0.2.1",
      "com.outr" %% "scribe-slf4j" % V.scribe,
      "com.outr" %% "scribe-file" % V.scribe
    ),
    scalacOptions ++= Seq(
      "-Wunused",
      "-deprecation",
      "-Yrangepos"
    )
  )
