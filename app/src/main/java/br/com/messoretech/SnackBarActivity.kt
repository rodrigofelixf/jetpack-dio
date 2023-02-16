package br.com.messoretech

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import br.com.messoretech.databinding.ActivitySnackBarBinding
import com.google.android.material.snackbar.Snackbar

class SnackBarActivity : AppCompatActivity() {
    private val binding by lazy { ActivitySnackBarBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        //binding.showing.setOnClickListener {
        //    Snackbar.make(it, "Click First Buttom", Snackbar.LENGTH_SHORT)
        //       .show()
//
        binding.imgProfile.setOnClickListener {
            startActivity(BottomAppBarActivity.createIntent(this))
        }


    }

    companion object {
        fun createIntent(context: Context): Intent = Intent(context, SnackBarActivity::class.java)
    }

}
