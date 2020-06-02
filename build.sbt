enablePlugins(ScalaJSPlugin)
scalaVersion := "2.13.2"
scalaJSUseMainModuleInitializer in Compile := true
libraryDependencies ++= Seq(
  "io.lemonlabs" %%% "scala-uri" % "2.2.2",
)
