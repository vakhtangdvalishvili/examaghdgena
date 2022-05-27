package com.example.exam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val nameText = findViewById<TextView>(R.id.name).text.toString()
        val x1 = findViewById<TextView>(R.id.X1).text.toString()
        val x2 = findViewById<TextView>(R.id.X2).text.toString()
        val x3 = findViewById<TextView>(R.id.X3).text.toString()
        val x4 = findViewById<TextView>(R.id.X4).text.toString()
        val mm = findViewById<TextView>(R.id.MM).text.toString()
        val yy = findViewById<TextView>(R.id.YY).text.toString()
        val cvv = findViewById<TextView>(R.id.CVV).text.toString()



        findViewById<Button>(R.id.button2).setOnClickListener{


                if (nameText.isEmpty())
                    Toast.makeText(this, "შეიყვანეთ სახელი",Toast.LENGTH_LONG).show()
                else if (x1.length != 4 && x2.length != 4 && x3.length != 4 && x4.length != 4)
                    Toast.makeText(this, "შეიყვანეთ 16 ნიშანი სწორად", Toast.LENGTH_LONG).show()
                else if ((mm.length > 2 || mm.isEmpty() || mm.toInt() > 12)  && (yy.length > 2 || yy.isEmpty() ) )
                    Toast.makeText(this, "სწორად შეიყვანეთ თარიღი", Toast.LENGTH_LONG).show()
                else if (cvv.length != 3 || cvv.isEmpty())
                    Toast.makeText(this, "სწორად შეიყვანეთ CVV კოდი", Toast.LENGTH_LONG).show()

                else Toast.makeText(this, "success", Toast.LENGTH_LONG).show()
        }

    }
}


