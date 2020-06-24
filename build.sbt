enablePlugins(ScalaJSPlugin)
scalaVersion := "2.13.2"
scalaJSUseMainModuleInitializer in Compile := true
libraryDependencies ++= Seq(
  "net.exoego" %%% "scalajs-types-util" % "0.2.1",
)
Compile / scalacOptions ++= Seq(
  "-Ymacro-annotations"
)
