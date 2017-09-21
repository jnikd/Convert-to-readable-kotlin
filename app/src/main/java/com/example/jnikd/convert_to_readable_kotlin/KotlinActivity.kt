package com.example.jnikd.convert_to_readable_kotlin

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.Menu
import android.view.MenuItem
import android.view.View

class KotlinActivity : AppCompatActivity() {

    // 画面遷移のIntent生成
    // Contextを使うためlazyで初期化
    private val nextScreenIntent by lazy { Intent(this, JavaActivity::class.java) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_java)
        val toolbar = findViewById(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)
        title = this.localClassName

        val fab = findViewById(R.id.fab) as FloatingActionButton
        fab.setOnClickListener { startActivity(nextScreenIntent) }
    }
}
