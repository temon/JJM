name := "jjm"

version := "1.0"

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
    "org.scalatest" %% "scalatest" % "2.1.6" % "test",
    "org.apache.opennlp" % "opennlp-tools" % "1.5.3"
)

libraryDependencies ++= Seq(
    "org.specs2" %% "specs2-core" % "2.4.15" % "test"
    // with Scala 2.9.3 (specs2 1.12.4.1 is the latest version for scala 2.9.3)
    // "org.specs2" %% "specs2" % "1.12.4.1" % "test",
)

scalacOptions in Test ++= Seq("-Yrangepos")

// Read here for optional jars and dependencies:
// http://etorreborre.github.io/specs2/guide/org.specs2.guide.Runners.html#Dependencies

resolvers ++= Seq("snapshots", "releases").map(Resolver.sonatypeRepo)