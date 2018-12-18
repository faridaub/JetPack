package com.example.prasa.navsample.ui.welcome

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import com.example.prasa.navsample.R
import kotlinx.android.synthetic.main.welcome_me_activity.*

class AboutUs : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_us)


        val host = NavHostFragment.create(R.navigation.about_us_nav)
        supportFragmentManager.beginTransaction().replace(R.id.container, host).setPrimaryNavigationFragment(host).commit()

    }
}
