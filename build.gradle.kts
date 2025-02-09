plugins {
    id("java")
}

group = "de.zcreeper"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven(
        url = "https://oss.sonatype.org/content/repositories/snapshots"
    )
    maven("https://libraries.minecraft.net/")
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("com.mojang:brigadier:1.2.9")
    compileOnly ("net.md-5:bungeecord-api:1.21-R0.1-SNAPSHOT")
}

tasks.test {
    useJUnitPlatform()
}