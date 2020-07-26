package com.example.codechallange2

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.codechallange2.databinding.ActivityMainBinding
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {
    private lateinit var bindingView: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingView = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingView.root)

        supportActionBar?.hide()

        var choiceList = ArrayList<Any>()

        choiceList.add("rock")
        choiceList.add("paper")
        choiceList.add("scissors")

        bindingView.pemain1.visibility = View.INVISIBLE
        bindingView.comp.visibility = View.INVISIBLE
        bindingView.draw.visibility = View.INVISIBLE


        var computerChoose: Any

        bindingView.paperPlayer.setOnClickListener {
            Log.d("paper", "Player memilih paper")
            Collections.shuffle(choiceList)

            computerChoose = choiceList[0]

            Log.d("computer choose", "$computerChoose")

            bindingView.rockPlayer.visibility = View.INVISIBLE
            bindingView.scissorPlayer.visibility = View.INVISIBLE
            bindingView.paperPlayer.setBackgroundColor(Color.parseColor("#F2F6F6"))
            bindingView.paperPlayer.isClickable = false

            when(computerChoose) {
                "rock" -> {
                    bindingView.rockComp.setBackgroundColor(Color.parseColor("#F2F6F6"))
                    bindingView.paperComp.visibility = View.INVISIBLE
                    bindingView.scissorComp.visibility = View.INVISIBLE
                    bindingView.pemain1.visibility = View.VISIBLE
                    bindingView.vs.visibility = View.INVISIBLE
                }
                "paper" -> {
                    bindingView.paperComp.setBackgroundColor(Color.parseColor("#F2F6F6"))
                    bindingView.rockComp.visibility = View.INVISIBLE
                    bindingView.scissorComp.visibility = View.INVISIBLE
                    bindingView.draw.visibility = View.VISIBLE
                    bindingView.vs.visibility = View.INVISIBLE
                }
                "scissors" -> {
                    bindingView.scissorComp.setBackgroundColor(Color.parseColor("#F2F6F6"))
                    bindingView.rockComp.visibility = View.INVISIBLE
                    bindingView.paperComp.visibility = View.INVISIBLE
                    bindingView.comp.visibility = View.VISIBLE
                    bindingView.vs.visibility = View.INVISIBLE
                }
            }
        }

        bindingView.rockPlayer.setOnClickListener {
            Log.d("paper", "Player memilih paper")
            Collections.shuffle(choiceList)

            computerChoose = choiceList[0]

            Log.d("computer choose", "$computerChoose")

            bindingView.paperPlayer.visibility = View.INVISIBLE
            bindingView.scissorPlayer.visibility = View.INVISIBLE
            bindingView.rockPlayer.setBackgroundColor(Color.parseColor("#F2F6F6"))
            bindingView.rockPlayer.isClickable = false

            when(computerChoose) {
                "rock" -> {
                    bindingView.rockComp.setBackgroundColor(Color.parseColor("#F2F6F6"))
                    bindingView.paperComp.visibility = View.INVISIBLE
                    bindingView.scissorComp.visibility = View.INVISIBLE
                    bindingView.draw.visibility = View.VISIBLE
                    bindingView.vs.visibility = View.INVISIBLE
                }
                "paper" -> {
                    bindingView.paperComp.setBackgroundColor(Color.parseColor("#F2F6F6"))
                    bindingView.rockComp.visibility = View.INVISIBLE
                    bindingView.scissorComp.visibility = View.INVISIBLE
                    bindingView.comp.visibility = View.VISIBLE
                    bindingView.vs.visibility = View.INVISIBLE
                }
                "scissors" -> {
                    bindingView.scissorComp.setBackgroundColor(Color.parseColor("#F2F6F6"))
                    bindingView.rockComp.visibility = View.INVISIBLE
                    bindingView.paperComp.visibility = View.INVISIBLE
                    bindingView.pemain1.visibility = View.VISIBLE
                    bindingView.vs.visibility = View.INVISIBLE
                }
            }
        }

        bindingView.scissorPlayer.setOnClickListener {
            Log.d("paper", "Player memilih paper")
            Collections.shuffle(choiceList)

            computerChoose = choiceList[0]

            Log.d("computer choose", "$computerChoose")

            bindingView.rockPlayer.visibility = View.INVISIBLE
            bindingView.paperPlayer.visibility = View.INVISIBLE
            bindingView.scissorPlayer.setBackgroundColor(Color.parseColor("#F2F6F6"))
            bindingView.scissorPlayer.isClickable = false

            when(computerChoose) {
                "rock" -> {
                    bindingView.rockComp.setBackgroundColor(Color.parseColor("#F2F6F6"))
                    bindingView.paperComp.visibility = View.INVISIBLE
                    bindingView.scissorComp.visibility = View.INVISIBLE
                    bindingView.comp.visibility = View.VISIBLE
                    bindingView.vs.visibility = View.INVISIBLE
                }
                "paper" -> {
                    bindingView.paperComp.setBackgroundColor(Color.parseColor("#F2F6F6"))
                    bindingView.rockComp.visibility = View.INVISIBLE
                    bindingView.scissorComp.visibility = View.INVISIBLE
                    bindingView.pemain1.visibility = View.VISIBLE
                    bindingView.vs.visibility = View.INVISIBLE
                }
                "scissors" -> {
                    bindingView.scissorComp.setBackgroundColor(Color.parseColor("#F2F6F6"))
                    bindingView.rockComp.visibility = View.INVISIBLE
                    bindingView.paperComp.visibility = View.INVISIBLE
                    bindingView.draw.visibility = View.VISIBLE
                    bindingView.vs.visibility = View.INVISIBLE
                }
            }
        }

        bindingView.restart.setOnClickListener{
            recreate()
        }


    }
}