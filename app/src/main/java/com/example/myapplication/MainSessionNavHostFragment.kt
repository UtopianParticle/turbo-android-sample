package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import dev.hotwire.turbo.config.TurboPathConfiguration
import dev.hotwire.turbo.session.TurboSessionNavHostFragment
import kotlin.reflect.KClass

class MainSessionNavHostFragment : TurboSessionNavHostFragment() {
    override val sessionName = "main"
    override val startLocation = "https://dd7b-2001-8a0-7a9f-800-6115-a4b4-eebc-addf.ngrok-free.app"

    override val registeredActivities: List<KClass<out AppCompatActivity>>
        get() = listOf(
            // Leave empty unless you have more
            // than one TurboActivity in your app
        )

    override val registeredFragments: List<KClass<out Fragment>>
        get() = listOf(
            WebFragment::class
            // And any other TurboFragments in your app
        )

    override val pathConfigurationLocation: TurboPathConfiguration.Location
        get() = TurboPathConfiguration.Location(
            assetFilePath = "json/configuration.json",
            remoteFileUrl = "https://turbo.hotwired.dev/demo/configurations/android-v1.json"
        )
}