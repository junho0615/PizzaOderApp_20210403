package com.neppplus.pizzaoderapp_20210403

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_edit_nickname.*

class EditNicknameActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_nickname)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

        okBtn.setOnClickListener {
            val inputNick = newNicknameEdt.text.toString()
            val resultIntent = Intent()
            resultIntent.putExtra("nick", inputNick)
            setResult(Activity.RESULT_OK, resultIntent)
            finish()
        }
    }

    override fun setValues() {
    }


}