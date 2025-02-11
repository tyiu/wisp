plugins {
    `java-library`
}

dependencies {
    implementation(libs.openTracing)

    testImplementation(libs.assertj)
    testImplementation(libs.junitApi)
    testImplementation(libs.junitEngine)
    testImplementation(libs.kotlinTest)
    testImplementation(libs.openTracingMock)
}
