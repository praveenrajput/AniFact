package com.praveen.anifact


object Dependencies {

    object BuildPlugins {
        val androidApplication by lazy { "com.android.application" }
        val kotlinAndroid by lazy { "org.jetbrains.kotlin.android" }
    }

    object Android {
        val coreKtx by lazy { "androidx.core:core-ktx:${Versions.ktx}" }
        val runtimeKtx by lazy { "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.runtimeKtx}" }
        val activity by lazy { "androidx.activity:activity-compose:${Versions.activity}" }
    }

    object Compose {
        val UI by lazy { "androidx.compose.ui:ui:${Versions.composeVersion}" }
        val material by lazy { "androidx.compose.material3:material3:${Versions.material}" }
        val uiTooling by lazy { "androidx.compose.ui:ui-tooling:${Versions.composeVersion}" }
    }

    object Test {
        val junit by lazy { "junit:junit:${Versions.jUnit}" }
        val composeTestManifest by lazy { "androidx.compose.ui:ui-test-manifest:${Versions.composeVersion}" }
    }
}
