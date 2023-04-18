course := "progfun1"
assignment := "example"
scalaVersion := "2.13.5"
scalacOptions ++= Seq("-language:implicitConversions", "-deprecation")
libraryDependencies += "org.scalameta" %% "munit" % "0.7.29" % "test"
// https://mvnrepository.com/artifact/org.scalameta/munit
//libraryDependencies += "org.scalameta" %% "munit" % "1.0.0-M7" % Test


testFrameworks += new TestFramework("munit.Framework")
