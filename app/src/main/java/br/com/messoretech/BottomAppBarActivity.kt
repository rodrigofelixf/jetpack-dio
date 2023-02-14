package br.com.messoretech

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.messoretech.databinding.ActivityBottomAppBarBinding
import br.com.messoretech.extenstions.toast


class BottomAppBarActivity : AppCompatActivity() {
    private val binding by lazy { ActivityBottomAppBarBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.bottomAppBar.setOnMenuItemClickListener {
            when(it.itemId) {
                R.id.favorite -> {
                    toast("Click Favorite")
                    true
                }
                R.id.search -> {
                    toast("Click Search")
                    true
                }
                R.id.more -> {
                    toast("Click more")
                    true
                }
                else -> false
            }
        }
    }

    companion object {
        fun createIntent(context: Context): Intent = Intent(context, BottomAppBarActivity::class.java)
    }



}
