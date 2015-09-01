import sbt._

object Build extends Build {

  import com.typesafe.sbt.packager.archetypes.JavaAppPackaging
  import sbt.Keys._

  lazy val root = project("root", ".").aggregate(module)

  lazy val module = project("module").
    enablePlugins(JavaAppPackaging)

  private def project(name: String, path: String): Project = {
    Project(name, file(path)).
      settings(
        scalaVersion := "2.11.7"
      )
  }

  private def project(name: String) : Project = project(name, name)
}