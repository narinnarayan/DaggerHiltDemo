package com.mobiotics.daggerhiltdemo.ui.mainactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.mobiotics.daggerhiltdemo.R
import com.mobiotics.daggerhiltdemo.di.module.activitymodule.Header
import com.mobiotics.daggerhiltdemo.di.module.activitymodule.Title
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val viewModel by lazy {
        ViewModelProvider(this).get(MainViewModel::class.java)
    }

    @Inject
    @Title
    lateinit var title: String

    @Inject
    @Header
    lateinit var header :String
    
    lateinit var mTvNames : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var mTvHeader = findViewById<TextView>(R.id.xTvMainHeader)
        mTvNames = findViewById(R.id.xTvNames)

        mTvHeader.text = "$header \n $title"
        observers()

    }

    private fun observers() {
        viewModel.getNames().observe(this, Observer { 
            it.forEachIndexed { index, s ->
                mTvNames.text = it[3]
            }
        })
    }
}