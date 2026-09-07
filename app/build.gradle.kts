plugins {
    id("application")
    id("io.github.ben-manes.versions") version "0.61.0"
    id("com.diffplug.spotless") version "7.2.1"
}

group = "hexlet.code"
version = "1.0-SNAPSHOT"

application {
    mainClass.set("hexlet.code.App")
}

spotless {
    java {
        importOrder()
        removeUnusedImports()
        googleJavaFormat().aosp()
        formatAnnotations()
        leadingTabsToSpaces(4)
    }
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.test {
    useJUnitPlatform()
}

tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}