package xyz.yoandroide.calculadorakotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun presionarDigito(view:View){
        val tv_num2: TextView = findViewById(R.id.tv_num2)
        var num2: String = tv_num2.text.toString()

        when(view.id){
            R.id.button0 -> tv_num2.setText(num2 + "0")
            R.id.button1 -> tv_num2.setText(num2 + "1")
            R.id.button2 -> tv_num2.setText(num2 + "2")
            R.id.button3 -> tv_num2.setText(num2 + "3")
            R.id.button4 -> tv_num2.setText(num2 + "4")
            R.id.button5 -> tv_num2.setText(num2 + "5")
            R.id.button6 -> tv_num2.setText(num2 + "6")
            R.id.button7 -> tv_num2.setText(num2 + "7")
            R.id.button8 -> tv_num2.setText(num2 + "8")
            R.id.button9 -> tv_num2.setText(num2 + "9")
            R.id.buttonC -> tv_num2.setText(num2 + "C")
            R.id.buttonsuma -> tv_num2.setText(num2 + "+")
            R.id.buttonpunto -> tv_num2.setText(num2 + ".")
        }
    }
}