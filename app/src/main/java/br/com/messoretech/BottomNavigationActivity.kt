package br.com.messoretech

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.messoretech.databinding.ActivityBottomNavigationBinding

class BottomNavigationActivity : AppCompatActivity() {
    private val binding by lazy { ActivityBottomNavigationBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.bottomNavigation.setOnItemSelectedListener { item ->
           when ( item.itemId ) {
               R.id.home -> {}
               R.id.star -> {}
           }
        }
    }


    companion object {
        fun createIntent(context: Context): Intent = Intent(context, BottomNavigationActivity::class.java)
    }

}
