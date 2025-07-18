plugins {
   alias(libs.plugins.jvm)
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(libs.versions.jdk.get().toInt())
}