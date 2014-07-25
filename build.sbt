organization := "org.company"

name := "scala-github-dependency-target-project"

version := "0.1-SNAPSHOT"

scalaVersion := "2.11.1"

scalacOptions ++= Seq("-deprecation", "-unchecked")

libraryDependencies ++= {
  Seq(
    "ch.qos.logback" % "logback-classic" % "1.1.2"
  )
}
