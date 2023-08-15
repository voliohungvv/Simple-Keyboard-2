package com.simplemobiletools.keyboard

import android.app.Application
import androidx.emoji2.bundled.BundledEmojiCompatConfig
import androidx.emoji2.text.EmojiCompat
import com.airbnb.lottie.Lottie
import com.airbnb.lottie.LottieConfig
import com.simplemobiletools.commons.extensions.checkUseEnglish
import com.simplemobiletools.keyboard.extensions.isDeviceInDirectBootMode

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        if (!isDeviceInDirectBootMode) {
            checkUseEnglish()
        }
        setupEmojiCompat()
//        Lottie.initialize(
//            LottieConfig.Builder()
//                .setEnableSystraceMarkers(true)..build()
//        )
    }

    private fun setupEmojiCompat() {
        val config = BundledEmojiCompatConfig(this)
        EmojiCompat.init(config)
    }
}
