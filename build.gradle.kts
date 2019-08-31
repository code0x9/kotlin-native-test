plugins {
    kotlin("multiplatform") version "1.3.50"
}

repositories {
    mavenCentral()
}

kotlin {
    macosX64() {
        binaries {
            executable {
                entryPoint = "hello.main"
            }
        }
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(kotlin("stdlib-common"))
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test-common"))
                implementation(kotlin("test-annotations-common"))
            }
        }
    }
}

tasks.withType<Wrapper> {
    gradleVersion = "5.6.1"
    distributionType = Wrapper.DistributionType.ALL
}
