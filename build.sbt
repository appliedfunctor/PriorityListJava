name := "PriorityList"

// orgnization name (e.g., the package name of the project)
organization := "com.ajsworton"

version := "1.0-SNAPSHOT"

// project description
description := "Treasure Data Project"

// Enables publishing to maven repo
publishMavenStyle := true

// Do not append Scala versions to the generated artifacts
crossPaths := false

// This forbids including Scala related libraries into the dependency
autoScalaLibrary := false

// library dependencies. (orginization name) % (project name) % (version)
libraryDependencies ++= Seq(
  "org.fluentd" % "fluent-logger" % "2.3.4",
  "org.mockito" % "mockito-core" % "2.7.11" % "test"  // Test-only dependency
)