package com.jcn.businesscard.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import com.jcn.businesscard.App
import com.jcn.businesscard.R
import com.jcn.businesscard.data.BusinessCard
import com.jcn.businesscard.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_add_business_card.*

class AddBusinessCardActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private val mainViewModel: MainViewModel by viewModels {
        MainViewModelFactory((application as App).repository)
    }

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
            val businessCard = BusinessCard(
                nome = til_nome.editText?.text.toString(),
                empresa = til_empresa.editText?.text.toString(),
                fone = til_fone.editText?.text.toString(),
                email = til_email.editText?.text.toString(),
                cor = til_cor.editText?.text.toString()
            )
            mainViewModel.insert(businessCard)
            Toast.makeText(this, R.string.label_show_success, Toast.LENGTH_SHORT).show()
            finish()
        }
    }
}