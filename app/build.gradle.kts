plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)
    id("kotlin-kapt")

}

android {
    namespace = "com.example.cs481room"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.cs481room"
        minSdk = 29
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
   // implementation(libs.androidx.room.common)
    implementation("junit:junit:4.12")
   // implementation(libs.core.ktx)
   // implementation(libs.androidx.junit.ktx)
    //kapt("androidx.room:room-compiler:2.6.1")


    val room_version = "2.2.5"
    implementation("androidx.room:room-runtime:$room_version")
    //kapt("androidx.room:room-compiler:$room_version")

    testImplementation("junit:junit:4.12")
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}