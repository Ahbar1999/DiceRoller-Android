package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.diceroller.ui.theme.DiceRollerTheme
import org.w3c.dom.Text
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    private lateinit var dice: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//         set content to layout xml file present in res folder (R)
        setContentView(R.layout.layout)
        val rollButton = findViewById<Button>(R.id.roll_button)
//         rollButton.text = "Text Changed"
        rollButton.setOnClickListener {
//            Toast.makeText(this, "Button Clicked!", Toast.LENGTH_SHORT).show()
            rollDice()
        }
        dice = findViewById<ImageView>(R.id.dice_img)
    }

    private fun rollDice() {
        val drawableResource = when (Random.nextInt(6) + 1) {
            1 -> R.drawable.perspective_dice_six_faces_one
            2 -> R.drawable.perspective_dice_six_faces_two
            3 -> R.drawable.perspective_dice_six_faces_three
            4 -> R.drawable.perspective_dice_six_faces_four
            5 -> R.drawable.perspective_dice_six_faces_five
            else -> R.drawable.perspective_dice_six_faces_six
        }

        dice.setImageResource(drawableResource)
    }
}