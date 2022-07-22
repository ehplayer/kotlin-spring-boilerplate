
dependencies {
    implementation("com.fasterxml.jackson.core:jackson-databind")
    implementation("com.fasterxml.jackson.datatype:jackson-datatype-jsr310")
    implementation("org.springframework.boot:spring-boot-autoconfigure")
    developmentOnly("org.springframework.boot:spring-boot-configuration-processor")
}

tasks.register("prepareKotlinBuildScriptModel"){}