plugins {
    kotlin("jvm") version "1.9.22"
    application
}

group = "fail.toepic"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-test")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(12)
}

application{
    mainClass = "LogFilterMain"
}