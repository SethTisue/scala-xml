import com.typesafe.tools.mima.plugin.{MimaPlugin, MimaKeys}

scalaModuleSettings

name                       := "scala-xml"

version                    := "1.0.6-SNAPSHOT"

scalaVersion               := "2.11.7"

//reenable -Xfatal-warnings?
scalacOptions             ++= "-deprecation:false -feature -Xlint:-stars-align,-nullary-unit,_".split("\\s+").to[Seq]

scalacOptions in Test      += "-Xxml:coalescing"

// important!! must come here (why?)
scalaModuleOsgiSettings

OsgiKeys.exportPackage := Seq(s"scala.xml.*;version=${version.value}")

libraryDependencies += "junit" % "junit" % "4.11" % "test"

libraryDependencies += "com.novocode" % "junit-interface" % "0.10" % "test"

//// testing:
// used in CompilerErrors test
libraryDependencies += ("org.scala-lang" % "scala-compiler" % scalaVersion.value % "test").exclude("org.scala-lang.modules", s"scala-xml*")

mimaPreviousVersion := Some("1.0.1")
