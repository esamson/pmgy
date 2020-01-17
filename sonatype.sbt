ThisBuild / publishTo := sonatypePublishTo.value
sonatypeProfileName := "ph.samson"
publishMavenStyle := true

credentials ++= (for {
  user <- sys.env.get("SONATYPE_USER")
  password <- sys.env.get("SONATYPE_PASSWORD")
} yield {
  Credentials(
    "Sonatype Nexus Repository Manager",
    "oss.sonatype.org",
    user,
    password
  )
}).toSeq

pgpPassphrase := sys.env.get("PGP_PASSPHRASE").map(_.toCharArray)
