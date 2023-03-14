scalaVersion := "3.2.2"

val scalatestVersion = "3.2.15"

libraryDependencies ++= Seq(
// testing
  "org.scalactic" %% "scalactic" % scalatestVersion,
  "org.scalatest" %% "scalatest" % scalatestVersion % "test"
)
