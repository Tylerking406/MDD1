package com.cscmdd.alphabetbook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.title = "Overview"

        val buttonA = findViewById<Button>(R.id.buttonA)
        val buttonB = findViewById<Button>(R.id.buttonB)
        val buttonC = findViewById<Button>(R.id.buttonC)
        val buttonD = findViewById<Button>(R.id.buttonD)
        val buttonE = findViewById<Button>(R.id.buttonE)
        val buttonF = findViewById<Button>(R.id.buttonF)
        val buttonG = findViewById<Button>(R.id.buttonG)
        val buttonH = findViewById<Button>(R.id.buttonH)
        val buttonI = findViewById<Button>(R.id.buttonI)
        val buttonJ = findViewById<Button>(R.id.buttonJ)
        val buttonK = findViewById<Button>(R.id.buttonK)
        val buttonL = findViewById<Button>(R.id.buttonL)
        val buttonM = findViewById<Button>(R.id.buttonM)
        val buttonN = findViewById<Button>(R.id.buttonN)
        val buttonO = findViewById<Button>(R.id.buttonO)
        val buttonP = findViewById<Button>(R.id.buttonP)
        val buttonQ = findViewById<Button>(R.id.buttonQ)
        val buttonR = findViewById<Button>(R.id.buttonR)
        val buttonS = findViewById<Button>(R.id.buttonS)
        val buttonT = findViewById<Button>(R.id.buttonT)
        val buttonU = findViewById<Button>(R.id.buttonU)
        val buttonV = findViewById<Button>(R.id.buttonV)
        val buttonW = findViewById<Button>(R.id.buttonW)
        val buttonX = findViewById<Button>(R.id.buttonX)
        val buttonY = findViewById<Button>(R.id.buttonY)
        val buttonZ = findViewById<Button>(R.id.buttonZ)

        val intent = Intent(this, LetterActivity::class.java)

        buttonA.setOnClickListener{
            intent.putExtra("POSITION", 0)
            startActivity(intent)
        }

        buttonB.setOnClickListener{
            intent.putExtra("POSITION", 1)
            startActivity(intent)
        }

        buttonC.setOnClickListener{
            intent.putExtra("POSITION", 2)
            startActivity(intent)
        }

        buttonD.setOnClickListener{
            intent.putExtra("POSITION", 3)
            startActivity(intent)
        }

        buttonE.setOnClickListener{
            intent.putExtra("POSITION", 4)
            startActivity(intent)
        }

        buttonF.setOnClickListener{
            intent.putExtra("POSITION", 5)
            startActivity(intent)
        }

        buttonG.setOnClickListener{
            intent.putExtra("POSITION", 6)
            startActivity(intent)
        }

        buttonH.setOnClickListener{
            intent.putExtra("POSITION", 7)
            startActivity(intent)
        }

        buttonI.setOnClickListener{
            intent.putExtra("POSITION", 8)
            startActivity(intent)
        }

        buttonJ.setOnClickListener{
            intent.putExtra("POSITION", 9)
            startActivity(intent)
        }

        buttonK.setOnClickListener{
            intent.putExtra("POSITION", 10)
            startActivity(intent)
        }

        buttonL.setOnClickListener{
            intent.putExtra("POSITION", 11)
            startActivity(intent)
        }

        buttonM.setOnClickListener{
            intent.putExtra("POSITION", 12)
            startActivity(intent)
        }

        buttonN.setOnClickListener{
            intent.putExtra("POSITION", 13)
            startActivity(intent)
        }

        buttonO.setOnClickListener{
            intent.putExtra("POSITION", 14)
            startActivity(intent)
        }

        buttonP.setOnClickListener{
            intent.putExtra("POSITION", 15)
            startActivity(intent)
        }

        buttonQ.setOnClickListener{
            intent.putExtra("POSITION", 16)
            startActivity(intent)
        }

        buttonR.setOnClickListener{
            intent.putExtra("POSITION", 17)
            startActivity(intent)
        }

        buttonS.setOnClickListener{
            intent.putExtra("POSITION", 18)
            startActivity(intent)
        }

        buttonT.setOnClickListener{
            intent.putExtra("POSITION", 19)
            startActivity(intent)
        }

        buttonU.setOnClickListener{
            intent.putExtra("POSITION", 20)
            startActivity(intent)
        }

        buttonV.setOnClickListener{
            intent.putExtra("POSITION", 21)
            startActivity(intent)
        }

        buttonW.setOnClickListener{
            intent.putExtra("POSITION", 22)
            startActivity(intent)
        }

        buttonX.setOnClickListener{
            intent.putExtra("POSITION", 23)
            startActivity(intent)
        }

        buttonY.setOnClickListener{
            intent.putExtra("POSITION", 24)
            startActivity(intent)
        }

        buttonZ.setOnClickListener{
            intent.putExtra("POSITION", 25)
            startActivity(intent)
        }
    }
}