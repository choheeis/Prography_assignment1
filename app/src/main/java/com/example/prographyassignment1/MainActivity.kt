package com.example.prographyassignment1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        replaceFragment(HomeFragment())

        /** bottom navigation Fragment Replace */
        bottom_nav.setOnNavigationItemSelectedListener { item ->
            when(item.itemId){
                R.id.item_home -> {
                    replaceFragment(HomeFragment())
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.item_promotion -> {
                    replaceFragment(PromotionFragment())
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.item_trip -> {
                    replaceFragment(TripFragment())
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.item_mypage -> {
                    replaceFragment(MypageFragment())
                    return@setOnNavigationItemSelectedListener true
                }
                else -> {
                    return@setOnNavigationItemSelectedListener false
                }
            }
        }
    }

    private fun replaceFragment(fragment: Fragment){
        val fragmentTransaction: FragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frameLayout, fragment)
        fragmentTransaction.commit()
    }
}
