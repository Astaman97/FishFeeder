package com.astaman.fishfeeder

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.astaman.fishfeeder.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this,R.layout.activity_main)
        val navCtrl = this.findNavController(R.id.navhost_fragment)


        //NavigationUI.setupActionBarWithNavController(this, navCtrl)

        //logika untuk bootom menu
        NavigationUI.setupWithNavController(binding.bottomNav, navCtrl)

    }


}