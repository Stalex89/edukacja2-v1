name := """edukacja2-v1"""

version := "1.0-SNAPSHOT"

scalaVersion := "2.12.4"

libraryDependencies ++= Seq(
  guice,
  javaJdbc,
  cacheApi,
  javaWs,
  "org.webjars" % "webjars-play_2.12" % "2.6.3",
  "org.webjars" % "bootstrap" % "4.0.0-2",
  "com.h2database" % "h2" % "1.4.192"
)

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

fork in run := true

includeFilter in (Assets, LessKeys.less) := "footer.less"