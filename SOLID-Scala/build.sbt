name := "SOLID-Scala"

scalaVersion := "2.12.3"


libraryDependencies ++= Seq(
  "org.scalactic" %% "scalactic" % "3.0.4",
  "org.scalatest" %% "scalatest" % "3.0.4" % "test",
  "org.mockito" % "mockito-core" % "2.7.19" % Test
)