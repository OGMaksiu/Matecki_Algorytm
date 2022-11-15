package com.barstool.matecki_algorytm

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val StosADD = findViewById<Button>(R.id.button)
        val StosDEL = findViewById<Button>(R.id.button2)
        val lastelement = findViewById<Button>(R.id.button3)
        val text = findViewById<TextView>(R.id.textView2)
        var liczby = LinkedList<Int>();
        val Wprowadzaniestos = findViewById<EditText>(R.id.editTextTextPersonName)
        StosADD.setOnClickListener {
            if(Wprowadzaniestos.text.toString() != ""){
                if (liczby.isEmpty()){
                    StosDEL.isEnabled = true
                    liczby.addFirst(Wprowadzaniestos.text.toString().toInt())
                    text.text = liczby.first.toString()
                }
                else {
                    liczby.add(Wprowadzaniestos.text.toString().toInt())
                    text.text = liczby.last.toString()
                }
            }
            else{
                Toast.makeText(baseContext, "Podaj jakas ilosc", Toast.LENGTH_SHORT).show()
            }
        }
        StosDEL.setOnClickListener {
            liczby.removeLast()
            if(liczby.isEmpty()){
                text.text = ""
                StosDEL.isEnabled = false
            }
            else{
                text.text = liczby.last.toString()
            }
        }
        lastelement.setOnClickListener {
            if (liczby.isEmpty()){
                Toast.makeText(baseContext, "Nie ma", Toast.LENGTH_SHORT).show()
            }
            else{
                text.text = liczby.last.toString() + " " + liczby.first.toString()

            }


            val queue: Queue<Int> = LinkedList<Int>()
            val queadd = findViewById<Button>(R.id.button4)
            val quedel = findViewById<Button>(R.id.button5)
            val queext = findViewById<Button>(R.id.button6)
            val queelement = findViewById<Button>(R.id.button7)
            val quein = findViewById<EditText>(R.id.editTextTextPersonName2)
            val text2 = findViewById<TextView>(R.id.textView5)

        queext.setOnClickListener {
            text2.text = queue.toString()
        }
        queelement.setOnClickListener {
            var pierwszy = queue.peek()
            text2.text = pierwszy.toString()
        }
        queadd.setOnClickListener {
            if(quein.text.toString() != "")
                queue.add(quein.text.toString().toInt())
        }
        quedel.setOnClickListener {
            queue.poll()
        }
        }
        }}
