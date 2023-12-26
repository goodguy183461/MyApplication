package com.example.myapplication

import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.os.CountDownTimer
import android.view.Window
import android.widget.ImageView
import androidx.activity.ComponentActivity

class GraphActivity : ComponentActivity() {
    private var timer: CountDownTimer? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.graph)
        val export: ImageView = findViewById(R.id.imageView26)


        export.setOnClickListener {
            popup1()
        }
        val change: ImageView = findViewById(R.id.imageView10)

        change.setOnClickListener {
            val intent = Intent(this@GraphActivity, AboutActivity::class.java)
            startActivity(intent)
        }

    }

    private fun popup1() {
        val pop1 = Dialog(this)
        pop1.requestWindowFeature(Window.FEATURE_NO_TITLE)
        pop1.setCancelable(false)
        pop1.setContentView(R.layout.popup2_1)
        pop1.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        timer = object : CountDownTimer(3500, 500) {
            override fun onTick(millisUntilFinished: Long) {

            }

            override fun onFinish() {
                pop1.dismiss()
                popup2()
            }

        }
        timer?.start()
        pop1.show()

    }

    private fun popup2() {
        val pop2 = Dialog(this)
        pop2.requestWindowFeature(Window.FEATURE_NO_TITLE)
        pop2.setCancelable(false)
        pop2.setContentView(R.layout.popup2_2)
        pop2.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        val ok: ImageView = pop2.findViewById(R.id.imageView22)
        ok.setOnClickListener {
            pop2.dismiss()
        }
        pop2.show()
    }
}