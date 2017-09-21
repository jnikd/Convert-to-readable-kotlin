package com.example.jnikd.convert_to_readable_kotlin

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_java.*
import kotlinx.android.synthetic.main.content_java.*

class KotlinActivity : AppCompatActivity() {

    // applyを使えば、ここで初期化を完了できる
    private val bundle = Bundle().apply {
        putString("key1", "value1")
        putString("key2", "value2")
    }

    // Contextを使うためlazyで初期化
    private val nextScreenIntent by lazy {
        Intent(this, JavaActivity::class.java).apply {
            putExtra("bundle", bundle)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_java)

        setSupportActionBar(toolbar)
        title = this.localClassName

        // 複数のプロパティ操作をまとめる
        textView.apply {
            text = getString(R.string.main_text_kotlin)
            textSize = 20f
        }

        // Kotlin Android Extensionsを使ってfindViewByIdを削除
        fab.setOnClickListener { startActivity(nextScreenIntent) }
    }
}
