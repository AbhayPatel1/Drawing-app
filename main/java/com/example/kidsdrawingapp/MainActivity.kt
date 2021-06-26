package com.example.kidsdrawingapp

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       var drawingView = DrawingView(this,null)

        drawingView.setSizeForBrush(20.toFloat())




    }
    fun showbrushdialogbox(){
    val brushDialog1 = Dialog(this)
    brushDialog1.setContentView(R.layout.brush_size_dialog)
    brushDialog1.setTitle("Brush Size")






        var smallbtn = DrawingView(  ,null)
        smallbtn.setSizeForBrush()




    }



}