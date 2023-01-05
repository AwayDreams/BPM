import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	id("org.springframework.boot") version "2.7.5"
	id("io.spring.dependency-management") version "1.0.15.RELEASE"
	kotlin("jvm") version "1.6.21"
	kotlin("plugin.spring") version "1.6.21"
	id("org.flywaydb.flyway") version "6.4.4"
}

group = "com.ecm"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_17

repositories {
	mavenCentral()
}

dependencies {
	implementation(kotlin("script-runtime"))
	implementation("org.springframework.boot:spring-boot-starter")
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
	implementation("mysql:mysql-connector-java:8.0.12")
	testImplementation("org.springframework.boot:spring-boot-starter-test")

	runtimeOnly("org.flywaydb:flyway-core")

	implementation("org.flywaydb:flyway-mysql")
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = listOf("-Xjsr305=strict")
		jvmTarget = "17"
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}

tasks {

	register("bootRunLoc") {
		dependsOn(":web-api:bootRunLoc")
	}
}

flyway {
	ignorePendingMigrations = true
	url = "jdbc:mysql://34.151.233.211:3306/ecm?useTimezone=true&serverTimezone=UTC&useSSL=false"
	user = "dev1"
	password = "dev1"
	locations = arrayOf("filesystem:src/main/kotlin/com/ecmprojectbackend/infrastructure/resources/db/migration")
}
