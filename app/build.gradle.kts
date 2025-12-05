plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    // For Hilt
    kotlin("kapt")
    id("com.google.dagger.hilt.android")
    // Navigation using: https://github.com/raamcosta/compose-destinations
    id("com.google.devtools.ksp") version "1.8.10-1.0.9"

}

android {
    namespace = "cz.mendelu.pef.microlearning"
    compileSdk = 33

    defaultConfig {
        applicationId = "cz.mendelu.pef.microlearning"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures {
        compose = true
        buildConfig = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.4"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.1")
    implementation("androidx.activity:activity-compose:1.7.0")
    implementation(platform("androidx.compose:compose-bom:2023.03.00"))
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-graphics")
    implementation("androidx.compose.ui:ui-tooling-preview")
    implementation("androidx.compose.material3:material3")
    implementation("androidx.test.ext:junit-ktx:1.2.1")
    testImplementation("junit:junit:4.13.2")
//    testImplementation("junit:junit:4.12")
//    androidTestImplementation("androidx.test.ext:junit:1.1.5")
//    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
//    androidTestImplementation(platform("androidx.compose:compose-bom:2023.03.00"))
//    androidTestImplementation("androidx.compose.ui:ui-test-junit4")
//    debugImplementation("androidx.compose.ui:ui-tooling")
//    debugImplementation("androidx.compose.ui:ui-test-manifest")

    implementation("androidx.compose.material:material-icons-extended:1.4.3")
    implementation("androidx.compose.material3:material3:1.1.0-alpha04")

    // html element
//    implementation("com.github.mukeshsolanki:compose-html:1.0.0")

    // rich editor pro HTML text
//    implementation("com.mohamedrejeb.richeditor:richeditor-compose:1.0.0-rc10")

    // html text
    // jitpack in setting -- https://github.com/jeziellago/compose-markdown
//    implementation ("com.github.jeziellago:compose-markdown:{LAST-RELEASE}")

    // Hilt dependencies
//    implementation("androidx.hilt:hilt-lifecycle-viewmodel:1.0.0-alpha03") // pro ViewModel s Hilt
//    implementation("com.google.dagger:hilt-android:2.44") // základní Hilt závislost
//    kapt("com.google.dagger:hilt-compiler:2.44") // pro generování kódu

    // Hilt test dependencies
    testImplementation("com.google.dagger:hilt-android-testing:2.44") // pro testy
    kaptTest("com.google.dagger:hilt-compiler:2.44") // pro kapt v testech
//
    // Mockovací knihovny pro testy (pokud chceš mockovat závislosti)
//    testImplementation("io.mockk:mockk:1.12.0")

    // Hilt
    implementation("com.google.dagger:hilt-android:2.44")
    kapt("com.google.dagger:hilt-android-compiler:2.44")
    implementation("androidx.hilt:hilt-navigation-compose:1.0.0")
//    kaptTest("com.google.dagger:hilt-compiler:2.56.2")

    // hilt unit
    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.6.1")
    testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.7.0")


    // Retrofit
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-moshi:2.9.0")


    // Moshi for json converter
    implementation("com.squareup.moshi:moshi:1.14.0")
    implementation("com.squareup.moshi:moshi-kotlin:1.14.0")


    // Navigation
    implementation("io.github.raamcosta.compose-destinations:animations-core:1.8.42-beta")
    ksp("io.github.raamcosta.compose-destinations:ksp:1.8.42-beta")

    // DataStore
    implementation("androidx.datastore:datastore-core:1.0.0")
    implementation("androidx.datastore:datastore-preferences:1.0.0")

    // Gson
    implementation("com.google.code.gson:gson:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")

//    implementation("androidx.compose.material:material-icons-extended:1.6.8")
    //fonts
//    implementation("androidx.compose.ui:ui-text-google-fonts:1.7.0")

    // Room
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.5.1")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.5.1")
    implementation("androidx.room:room-ktx:2.5.0")
    implementation("androidx.legacy:legacy-support-v4:1.0.0")
    ksp("androidx.room:room-compiler:2.5.0")
    implementation("androidx.room:room-runtime:2.5.0")
    // End room

    // coroutine
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.0")


//    // -------------------------------------------------------
//    // JUnit 5 (Jupiter)
//    // -------------------------------------------------------
//    testImplementation("org.junit.jupiter:junit-jupiter-api:5.10.2")
//    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.10.2")
//    testImplementation("org.junit.jupiter:junit-jupiter-params:5.10.2")

    // Potřebné pro anotace @BeforeEach, @AfterEach, @Test
//    testImplementation("org.jetbrains.kotlin:kotlin-test-junit5")

    // -------------------------------------------------------
    // MockK
    // -------------------------------------------------------
    testImplementation("io.mockk:mockk:1.13.10")

    // -------------------------------------------------------
    // Kotlin Coroutines test
    // -------------------------------------------------------
    testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.8.1")

    // -------------------------------------------------------
    // Optional: Assertions
    // -------------------------------------------------------
//    testImplementation("org.jetbrains.kotlin:kotlin-test")

    // -------------------------------------------------------
    // Mockito
    // -------------------------------------------------------
//    testImplementation("org.mockito:mockito-core:5.0")
//    testImplementation("org.mockito.kotlin:mockito-kotlin:5.1.0")
//    testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.8.0")

    testImplementation("io.mockk:mockk:1.13.9")
    testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.8.0")


}