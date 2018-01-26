import org.scalajs.sbtplugin.ScalaJSPlugin
import org.scalajs.sbtplugin.ScalaJSPlugin.autoImport._
enablePlugins(ScalaJSPlugin, WorkbenchPlugin)

name := "Example"

version := "0.1-SNAPSHOT"

scalaVersion := "2.12.4"

resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"
resolvers += Resolver.bintrayRepo("definitelyscala", "maven")
resolvers += Resolver.sonatypeRepo("snapshots")
resolvers += Resolver.jcenterRepo
resolvers += "spray repo" at "http://repo.spray.io"
resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"


//libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.9.2"
//libraryDependencies += "com.lihaoyi" %%% "scalatags" % "0.6.4"
libraryDependencies += "fr.iscpif" %%% "scaladget" % "0.9.6-SNAPSHOT"
libraryDependencies += "com.definitelyscala" %%% "scala-js-plotlyjs" % "1.1.4"
libraryDependencies += "com.lihaoyi" %%% "sourcecode" % "0.1.2"
//libraryDependencies += "fr.iscpif" %%% "scaladget" % "0.9.4"
libraryDependencies ++= Seq(
  "org.scala-js" %%% "scalajs-dom" % "0.9.1",
  "com.lihaoyi" %%% "scalatags" % "0.6.1"
)


/*
libraryDependencies += "co.theasi" %% "plotly" % "0.2-SNAPSHOT"
libraryDependencies += "org.plotly-scala" %%% "plotly-render" % "0.3.1" /*https://github.com/alexarchambault/plotly-scala*/
libraryDependencies += "com.definitelyscala" %%% "scala-js-plotlyjs" % "1.1.3" /*https://github.com/DefinitelyScala/scala-js-plotlyjs*/

libraryDependencies ++= Seq(
  "org.scala-js" %%% "scalajs-dom" % "0.9.1",
  "com.lihaoyi" %%% "scalatags" % "0.6.1"
 // "co.theasi" %% "plotly" % "0.2.11"
)

*/

