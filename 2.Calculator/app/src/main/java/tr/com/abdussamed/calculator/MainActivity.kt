package tr.com.abdussamed.calculator

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
        var refreshButton = findViewById<Button>(R.id.refresh_button)
        var textView = findViewById<TextView>(R.id.textView)
        var divButton = findViewById<Button>(R.id.divide_button)
        var multButton = findViewById<Button>(R.id.mult_button)
        var minusButton = findViewById<Button>(R.id.dif_button)
        var addButton = findViewById<Button>(R.id.tot_button)
        var equalButton = findViewById<Button>(R.id.equal_button)
        var modButton = findViewById<Button>(R.id.mod_button)
        var minConvButton = findViewById<Button>(R.id.min_con_button)
        var nineButton = findViewById<Button>(R.id.nine_button)
        var eightButton = findViewById<Button>(R.id.eight_button)
        var sevenButton = findViewById<Button>(R.id.seven_button)
        var sixButton = findViewById<Button>(R.id.six_button)
        var fiveButton = findViewById<Button>(R.id.five_button)
        var fourButton = findViewById<Button>(R.id.four_button)
        var threeButton = findViewById<Button>(R.id.three_button)
        var twoButton = findViewById<Button>(R.id.two_button)
        var oneButton = findViewById<Button>(R.id.one_button)
        var comaButton = findViewById<Button>(R.id.coma_button)
        var zeroButton = findViewById<Button>(R.id.zero_button)
        var dubZeroButton = findViewById<Button>(R.id.dub_zero_button)

        /*
        * -1 Hiçbir işlem seçilmedi
        * 0: Bölme işlemi
        * 1: Çarpma işlemi
        * 2: Çıkarma işlemi
        * 3: Toplama işlemi
         */
        var operation = -1
        var firstNum = 0

        refreshButton.setOnClickListener {
            firstNum = 0
            textView.text = "0"
            operation = -1
        }

        divButton.setOnClickListener {
            firstNum = textView.text.toString().toInt()
            textView.text = "0"
            operation = 0
        }

        multButton.setOnClickListener {
            firstNum = textView.text.toString().toInt()
            textView.text = "0"
            operation = 1
        }

        minusButton.setOnClickListener {
            firstNum = textView.text.toString().toInt()
            textView.text = "0"
            operation = 2
        }

        addButton.setOnClickListener {
            firstNum = textView.text.toString().toInt()
            textView.text = "0"
            operation = 3
        }

        nineButton.setOnClickListener {
            var text = textView.text.toString()
            if(text == "0"){
                textView.text = "9"
            } else {
                textView.append("9")
            }
        }

        eightButton.setOnClickListener {
            var text = textView.text.toString()
            if(text == "0"){
                textView.text = "8"
            } else {
                textView.append("8")
            }
        }

        sevenButton.setOnClickListener {
            var text = textView.text.toString()
            if(text == "0"){
                textView.text = "7"
            } else {
                textView.append("7")
            }
        }

        sixButton.setOnClickListener {
            var text = textView.text.toString()
            if(text == "0"){
                textView.text = "6"
            } else {
                textView.append("6")
            }
        }

        fiveButton.setOnClickListener {
            var text = textView.text.toString()
            if(text == "0"){
                textView.text = "5"
            } else {
                textView.append("5")
            }
        }

        fourButton.setOnClickListener {
            var text = textView.text.toString()
            if(text == "0"){
                textView.text = "4"
            } else {
                textView.append("4")
            }
        }

        threeButton.setOnClickListener {
            var text = textView.text.toString()
            if(text == "0"){
                textView.text = "3"
            } else {
                textView.append("3")
            }
        }

        twoButton.setOnClickListener {
            var text = textView.text.toString()
            if(text == "0"){
                textView.text = "2"
            } else {
                textView.append("2")
            }
        }

        oneButton.setOnClickListener {
            var text = textView.text.toString()
            if(text == "0"){
                textView.text = "1"
            } else {
                textView.append("1")
            }
        }

        zeroButton.setOnClickListener {
            var text = textView.text.toString()
            if(text == "0"){
                textView.text = "0"
            } else {
                textView.append("0")
            }
        }

        dubZeroButton.setOnClickListener {
            var text = textView.text.toString()
            if(text == "0"){
                textView.text = "0"
            } else {
                textView.append("00")
            }
        }

        equalButton.setOnClickListener {
            var secondNum = textView.text.toString().toInt()

            var total = when(operation) {
                0 -> firstNum / secondNum
                1 -> firstNum * secondNum
                2 -> firstNum - secondNum
                3 -> firstNum + secondNum
                else -> 0
            }

            textView.text = total.toString()
        }
    }
}