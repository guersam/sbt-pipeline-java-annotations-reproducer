ThisBuild / scalaVersion  := "3.5.2"
ThisBuild / usePipelining := true

lazy val lib = project
  .settings(
    libraryDependencies += "org.projectlombok" % "lombok" % "1.18.30" % "provided",
    Compile / javacOptions ++= Seq("-processor", "lombok.launch.AnnotationProcessorHider$AnnotationProcessor"),
    // Compile / exportPipelining := false, // workaround
  )

lazy val app = project
  .dependsOn(lib)

