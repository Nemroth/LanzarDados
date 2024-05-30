package com.example.lanzardados

import android.media.MediaPlayer
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        var mp3 = MediaPlayer.create(this,R.raw.soundtrack)
        mp3.start()

        val btnLanzar: Button = findViewById(R.id.btnLanzar)
        btnLanzar.setOnClickListener{
            Tiempo()



        }
    }
    private fun rollDice(){
        val numero: Int = lanzar(12)
        val txtResultado: TextView = findViewById(R.id.txtResultado)
        txtResultado.text = numero.toString()


       var ImagenRecurso = when(numero){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            7 -> R.drawable.dice_7
            8 -> R.drawable.dice_8
            9 -> R.drawable.dice_9
            10 -> R.drawable.dice_10
            11 -> R.drawable.dice_11
            else -> R.drawable.dice_12

        }
        val imgDado: ImageView = findViewById(R.id.imgDado)
        imgDado.setImageResource(ImagenRecurso)
    }
    private fun lanzar(max: Int): Int{
       return    (1..max).random()
    }
    private fun Tiempo(){
        object : CountDownTimer(5000, 200) {
            override fun onTick(p0: Long) {
                rollDice()
            }

            override fun onFinish() {

            }

        }.start()
    }
}
/*⠀⠀
⠀⠀       ⢀⠨⠭⢭⣭⢭⡥⠭⠕⡀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⣀⠄⠂⠉⢷⣠⣼⡛⣘⣷⣀⡶⠉⠐⠠⡀⠀⠀⠀⠀⠀
⠀⠀⠀⢀⠬⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀    ⠀⠀⢧⡀⠀⠀⠀
⠀⠀⢀⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀    ⠀⠀⠀⢰⡀⠀⠀
⠀⠀⡌⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀    ⠀⠀⠀⢱⠀⠀
⠀⠀⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀     ⠀⠀⠀⠀⠀⠸⠀⠀
⡔⠊⡀⠀⢰⡤⠄⣀⠀⠀⠀⠀⠀⠀⠀  ⠀⠀⠀⣀⠠⠤⡆⠀⢈⠐⢢
⡇⠀⢇⣀⠀⠈⢆⠀⠈⠁⠒⡠⠤⠤⢄⠒⠈⠁⠀⡠⠁ ⢃⣄⡸⠀⢸
⠃⠀⡆⠀⠀⠀⠄⠈⠐⠒⠈⠀⡤⢤⠀⠁⠒⠂⢁⠠⠂⠀⠀⢱⠀⠸
⠀⢀⣗⣲⢷⠀⠀⠀⠉⢀⡂⣤⡒⣒⣄⠠⡄⠉⠀⠀⠀⡶⣖⡺⡀⠈
⡀⡁⡏⣇⢿⠀⠈⠀⠰⢁⢷⡇⡷⣿⢸⡷⡈⠆⠀⠁⠀⡿⣿⢿⠈⢀
⠘⠧⡧⠴⣸⠀⠂⠀⡎⣇⡞⡏⣇⣼⢹⢲⢱⢓⠀⠀⠀⣇⠦⢼⠰⠂
⠀⠈⢏⡔⠈⠀⢏⢿⠁⢿⡇⣇⡿⣿⣼⢸⣿⠈⡝⠙⠐⠁⢪⡚⠁⠀
⠀⠀⠀⠑⠚⠀⠒⠙⠦⠜⠷⣏⣃⣛⣹⠾⠣⠴⠋⠒⠀⠐⠊⠀⠀⠀
⠀⠀◹†◸ ~ Adeptus Astartes ~ ◹†◸⠀
*/