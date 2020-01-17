ThisBuild / organization := "ph.samson.pmgy"
ThisBuild / scalaVersion := "2.12.10"

ThisBuild / licenses := Seq(
  "GPL-3.0-only" -> url("https://spdx.org/licenses/GPL-3.0-only.html")
)
headerLicense := Some(
  HeaderLicense.Custom(
    s"""|Copyright (C) 2020  Edward Samson
        |
        |This program is free software: you can redistribute it and/or modify
        |it under the terms of the GNU General Public License as published by
        |the Free Software Foundation, version 3.
        |
        |This program is distributed in the hope that it will be useful,
        |but WITHOUT ANY WARRANTY; without even the implied warranty of
        |MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
        |GNU General Public License for more details.
        |
        |You should have received a copy of the GNU General Public License
        |along with this program.  If not, see <http://www.gnu.org/licenses/>.
        |""".stripMargin
  )
)

ThisBuild / homepage := Some(url("https://github.com/esamson/pmgy"))
ThisBuild / developers := List(
  Developer(
    id = "esamson",
    name = "Edward Samson",
    email = "edward@samson.ph",
    url = url("https://edward.samson.ph")
  )
)
ThisBuild / scmInfo := Some(
  ScmInfo(
    url("https://github.com/esamson/pmgy"),
    "scm:git:git@github.com:esamson/pmgy.git"
  )
)

ThisBuild / dynverSonatypeSnapshots := true

name := "pmgy"

libraryDependencies ++= Seq(
  "com.lihaoyi" %% "scalatags" % "0.6.7",
  "com.lihaoyi" %% "ammonite-ops" % "1.6.0",
  "com.typesafe.play" %% "play" % "2.6.7",
  "com.typesafe.play" %% "play-akka-http-server" % "2.6.7",
  "org.slf4j" % "slf4j-nop" % "1.7.25"
)
