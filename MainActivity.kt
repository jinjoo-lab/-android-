package com.example.ex1
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.io.IOException

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         var edit1 :EditText  = findViewById(R.id.edit1)
         var edit2 :EditText = findViewById(R.id.edit2)
        lateinit var button: Button
        var result : TextView= findViewById(R.id.result)
        button=findViewById(R.id.b1)
        button.setOnClickListener {
            if(edit1.text.isEmpty() || edit2.text.isEmpty())
            {
                Toast.makeText(this,"input error",Toast.LENGTH_SHORT).show()
            }
            else {
                var num1: Double = edit1.getText().toString().toDouble()
                var num2: Double = edit2.getText().toString().toDouble()
                var num3 :Double=num1+num2
                result.text="계산 결과 : "+num3
            }
            false

        }
        button=findViewById(R.id.b2)
        button.setOnClickListener {
            if(edit1.text.isEmpty() || edit2.text.isEmpty())
            {
                Toast.makeText(this,"input error",Toast.LENGTH_SHORT).show()
            }
            else {
                var num1: Double = edit1.getText().toString().toDouble()
                var num2: Double = edit2.getText().toString().toDouble()
                var num3 :Double=num1-num2
                result.text="계산 결과 : "+num3
            }
            false
        }
        button=findViewById(R.id.b3)
        button.setOnClickListener {
            if(edit1.text.isEmpty() || edit2.text.isEmpty())
            {
                Toast.makeText(this,"input error",Toast.LENGTH_SHORT).show()
            }
            else {
                var num1: Double = edit1.getText().toString().toDouble()
                var num2: Double = edit2.getText().toString().toDouble()
                var num3 :Double=num1*num2
                result.text="계산 결과 : "+num3
            }
            false
        }
        button=findViewById(R.id.b4)
        button.setOnClickListener {
            if(edit1.text.isEmpty() || edit2.text.isEmpty())
            {
                Toast.makeText(this,"input error",Toast.LENGTH_SHORT).show()
            }
            else {
                var num1: Double = edit1.getText().toString().toDouble()
                var num2: Double = edit2.getText().toString().toDouble()
                if(num2==0.0)
                {
                    Toast.makeText(this,"Arithmetic error",Toast.LENGTH_SHORT).show()
                }
                else {
                    var num3: Double = num1 / num2
                    result.text = "계산 결과 : " + num3
                }
            }
            false
        }
        button=findViewById(R.id.b5)
        button.setOnClickListener {
            if(edit1.text.isEmpty() || edit2.text.isEmpty())
            {
                Toast.makeText(this,"input error",Toast.LENGTH_SHORT).show()
            }
            else {
                var num1: Double = edit1.getText().toString().toDouble()
                var num2: Double = edit2.getText().toString().toDouble()
                if(num2==0.0)
                {
                    Toast.makeText(this,"Arithmetic error",Toast.LENGTH_SHORT).show()
                }
                else {
                    var num3: Double = num1 % num2
                    result.setText("계산 결과 : " + num3)
                }
            }
            false
        }
    }

}