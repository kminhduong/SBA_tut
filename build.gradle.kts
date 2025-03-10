plugins {
	java
	id("org.springframework.boot") version "3.4.3"
	id("io.spring.dependency-management") version "1.1.7"
}

group = "com.bit"
version = "0.0.1-SNAPSHOT"

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(21)
	}
}

configurations {
	compileOnly {
		extendsFrom(configurations.annotationProcessor.get())
	}
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("org.springframework.boot:spring-boot-starter-thymeleaf")
	compileOnly("org.projectlombok:lombok")
	runtimeOnly("com.microsoft.sqlserver:mssql-jdbc")
	annotationProcessor("org.projectlombok:lombok")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testRuntimeOnly("org.junit.platform:junit-platform-launcher")

	implementation("org.springframework.data:spring-data-jpa:4.0.0-M1")

	implementation("javax.persistence:javax.persistence-api:2.2")
	implementation("org.springframework.boot:spring-boot-starter-data-jpa:3.4.3")


	implementation("org.springframework:spring-context:6.2.3")

	implementation("org.hibernate.validator:hibernate-validator:8.0.1.Final")

}

tasks.withType<Test> {
	useJUnitPlatform()
}
