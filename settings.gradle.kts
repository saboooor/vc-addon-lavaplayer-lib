pluginManagement {
    repositories {
        mavenLocal()
        mavenCentral()
        gradlePluginPortal()
        maven("https://repo.plasmoverse.com/snapshots")
        maven("https://repo.plasmoverse.com/releases")
        maven("https://jitpack.io/")
    }
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}

rootProject.name = "vc-addon-lavaplayer-lib"
