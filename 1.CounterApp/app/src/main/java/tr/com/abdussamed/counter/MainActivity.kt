package tr.com.abdussamed.counter

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var textView = findViewById<TextView>(R.id.counter_text)
        var button = findViewById<Button>(R.id.counter_button)

        button.setOnClickListener {
            var text = textView.text.toString()
            var number = text.toInt() + 1
            textView.text = number.toString()
        }
    }
}