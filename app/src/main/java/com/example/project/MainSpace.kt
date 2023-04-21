package com.example.project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.FrameLayout
import android.widget.ImageButton
import androidx.navigation.NavController
import androidx.navigation.Navigation.findNavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.project.databinding.ActivityMainBinding
import com.google.android.material.*
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.navigation.NavigationBarItemView

class MainSpace : AppCompatActivity() {

    //private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_space)

        val btnMsg = findViewById<ImageButton>(R.id.btnMsg)
        btnMsg.setOnClickListener{
            val intent = Intent(this,MessagesActivity::class.java)
            startActivity(intent)
            //finish()
        }

        /*binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)*/

        val navView: BottomNavigationView = findViewById<BottomNavigationView>(R.id.nav_view)
        val navController = findNavController(R.id.nav_host_fragment_activity_main)
        navView.setItemIconTintList(null)

        val menu = navView.menu
        val menuItem = menu.getItem(2)
        val navigationBarItemView: NavigationBarItemView = navView.findViewById(menuItem.itemId)
        val iconView: View = navigationBarItemView.findViewById(com.google.android.material.R.id.navigation_bar_item_icon_view)

        val iconViewParams: FrameLayout.LayoutParams = iconView.layoutParams as FrameLayout.LayoutParams
        iconViewParams.width = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 32F, resources.displayMetrics).toInt()
        iconViewParams.height = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 32F, resources.displayMetrics).toInt()
//        iconViewParams.bottomMargin = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 10F, resources.displayMetrics).toInt()
        iconView.layoutParams = iconViewParams
        /*val appBarConfiguration = AppBarConfiguration(setOf(
            R.id.FirstFragment,
            R.id.SecondFragment,
            R.id.ThirdFragment,
            R.id.FourthFragment,
            R.id.FifthFragment,
            ))
        setupActionBarWithNavController(navController, appBarConfiguration)*/
        recursiveClipChildrenAndClipToPadding(navView)
        navView.setupWithNavController(navController)


    }

    fun recursiveClipChildrenAndClipToPadding(parent: ViewGroup) {

        if(parent is BottomNavigationView){
            val bottomNavigationView = parent as BottomNavigationView
            bottomNavigationView.clipChildren = false
            bottomNavigationView.clipToPadding = false
        }
        for (i in 0 until parent.childCount) {
            val child = parent.getChildAt(i)
            if (child is ViewGroup) {
                val vGroup = child as ViewGroup
                vGroup.clipChildren = false
                vGroup.clipToPadding = false
                recursiveClipChildrenAndClipToPadding(vGroup)
            }
        }
    }


}