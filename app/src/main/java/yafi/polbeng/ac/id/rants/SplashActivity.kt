package yafi.polbeng.ac.id.rants

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_splash)

            goToMainActivity()
//        Handler(Looper.getMainLooper()).postDelayed({
//        }, 500L)
    }
    
    private fun goToMainActivity(){
        val intent = Intent(this, MainActivity::class.java).also {
            startActivity(it)
            finish()
        }
    }
}