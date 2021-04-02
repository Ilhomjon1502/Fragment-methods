package com.ilhomjon.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val blankFragment = BlankFragment()
//        val fragmentManager = supportFragmentManager
//        val transaction = fragmentManager.beginTransaction()
//        transaction.add(R.id.container, blankFragment)
//        transaction.commit()

        val fistFragment = FirstFragment()
        val secondFragmnet = SecondFragmnet()

        btn_add.setOnClickListener {
            val supportFragmentManager = supportFragmentManager
            val beginTransaction = supportFragmentManager.beginTransaction()
            beginTransaction.add(R.id.container, fistFragment)
            beginTransaction.commit()

            //qaytishni bosganda fragmentni yopadi
            beginTransaction.addToBackStack(fistFragment.toString())
        }

        btn_remove.setOnClickListener {
            val supportFragmentManager = supportFragmentManager
            val beginTransaction = supportFragmentManager.beginTransaction()
            beginTransaction.remove(fistFragment)
            beginTransaction.commit()
        }

        btn_replace.setOnClickListener {
            val supportFragmentManager = supportFragmentManager
            val beginTransaction = supportFragmentManager.beginTransaction()
            beginTransaction.replace(R.id.container,secondFragmnet)
            beginTransaction.commit()
        }

        btn_hide.setOnClickListener {
            val supportFragmentManager = supportFragmentManager
            val beginTransaction = supportFragmentManager.beginTransaction()
            beginTransaction.hide(fistFragment)
            beginTransaction.commit()
        }

        btn_show.setOnClickListener {
            val beginTransaction = supportFragmentManager.beginTransaction()
            beginTransaction.show(fistFragment)
            beginTransaction.commit()
        }
    }
}