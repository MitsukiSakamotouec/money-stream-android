package com.example.moneystream.presenters.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.moneystream.R
import kotlinx.android.synthetic.main.activity_invite.*
import kotlinx.android.synthetic.main.my_toolbar.view.*

class InviteActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_invite)

        toolbar_activity_invite.pageTitle.text = getString(R.string.title_invite)

    }
}