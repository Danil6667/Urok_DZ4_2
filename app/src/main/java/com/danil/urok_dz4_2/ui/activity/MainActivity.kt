package com.danil.urok_dz4_2.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.danil.urok_dz4_2.ui.utlis.PreferenceHelper
import com.example.noteapp.R


class MainActivity : AppCompatActivity() {

    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.fragment_container) as NavHostFragment

        navController = navHostFragment.navController

        when (PreferenceHelper.isOnBoardShown) {
            true -> {
                navController.navigate(R.id.homeFragment)
            }
            else -> {
                navController.navigate(R.id.onBoardFragment)
            }
        }
    }
}
