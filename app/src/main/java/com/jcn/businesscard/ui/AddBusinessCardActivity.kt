package com.jcn.businesscard.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jcn.businesscard.R
import kotlinx.android.synthetic.main.activity_add_business_card.*

class AddBusinessCardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_business_card)
        insertListeners()
    }

    private fun insertListeners() {
        bt_close.setOnClickListener {
            finish()
        }

        bt_confirm.setOnClickListener {

        }
    }
}