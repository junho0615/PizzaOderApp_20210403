package com.neppplus.pizzaoderapp_20210403.fragments

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.neppplus.pizzaoderapp_20210403.EditNicknameActivity
import com.neppplus.pizzaoderapp_20210403.R
import kotlinx.android.synthetic.main.fragment_my_profile.*

class MyProfileFragment : Fragment() {

    val REQ_FOR_NICKNAME = 1001

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_my_profile, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        editNicknameBtn.setOnClickListener {
            val myIntent = Intent(activity, EditNicknameActivity::class.java)
            startActivityForResult(myIntent, REQ_FOR_NICKNAME)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == REQ_FOR_NICKNAME) {
            if (requestCode == Activity.RESULT_OK) {
                val newNickname = data?.getStringExtra("nick")

                nicknameTxt.text = newNickname
            }
        }
    }
}