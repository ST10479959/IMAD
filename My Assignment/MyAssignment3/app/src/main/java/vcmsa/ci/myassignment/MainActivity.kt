package vcmsa.ci.myassignment

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        val timeEditText: EditText = findViewById(R.id.TimeEditText)
        val suggestionTextView: TextView = findViewById(R.id.SuggestTextView)
        val suggestButton: Button = findViewById(R.id.SuggestBotton)
        suggestButton.setOnClickListener {
            val time = timeEditText.text.toString().toLowerCase()
            suggestionTextView.text = when (time) {
                "morning" -> "Eggs"
                "mid-morning" -> "Fruit"
                "afternoon" -> "Sandwich"
                "mid-afternoon" -> "Yogurt"
                "dinner" -> "Pasta"
                else -> "Invalid time"
            }
        }

        val resetButton: Button = findViewById(R.id.ResetBotton)
        resetButton.setOnClickListener {
            timeEditText.text.clear()
            suggestionTextView.text = ""


}

























        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}