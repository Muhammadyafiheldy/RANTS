package yafi.polbeng.ac.id.rants

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.text.InputType
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import yafi.polbeng.ac.id.rants.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge() // Enable edge-to-edge display if supported

        // Initialize View Binding
        ActivityLoginBinding.inflate(layoutInflater).also { binding = it }
        setContentView(binding.root)

        // Set listener for CheckBox "Show Password"
        binding.showPasswordCheckbox.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                // Show password
                binding.editText2.inputType = InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD
            } else {
                // Hide password
                binding.editText2.inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD
            }
            // Keep cursor at the end of the text
            binding.editText2.setSelection(binding.editText2.text.length)
        }

        // Listener for the "Register" button
        binding.daftarButton.setOnClickListener {
            // Create an Intent to start RegisterActivity
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }

        // Set up window insets for the main view
        ViewCompat.setOnApplyWindowInsetsListener(binding.main) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    }
