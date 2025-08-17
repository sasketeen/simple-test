plugins {
    alias(libs.plugins.jvm) apply false
}

allprojects {
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }

    group = "org.example"
    version = "0.0.1-SNAPSHOT"
}