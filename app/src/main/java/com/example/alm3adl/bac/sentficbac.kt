package com.example.alm3adl.bac

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputFilter
import android.view.LayoutInflater
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.core.content.ContextCompat
import com.example.alm3adl.InputFilterMinMax
import com.example.alm3adl.R
import com.example.alm3adl.home
import kotlinx.android.synthetic.main.alertdialogbac.view.*
import kotlinx.android.synthetic.main.mathbac.`is`
import kotlinx.android.synthetic.main.mathbac.amz
import kotlinx.android.synthetic.main.mathbac.ar
import kotlinx.android.synthetic.main.mathbac.checkBoxm3faamz
import kotlinx.android.synthetic.main.mathbac.checkBoxm3fasport
import kotlinx.android.synthetic.main.mathbac.fi
import kotlinx.android.synthetic.main.mathbac.fl
import kotlinx.android.synthetic.main.mathbac.m_amz
import kotlinx.android.synthetic.main.mathbac.m_ar
import kotlinx.android.synthetic.main.mathbac.m_fi
import kotlinx.android.synthetic.main.mathbac.m_fl
import kotlinx.android.synthetic.main.mathbac.m_is
import kotlinx.android.synthetic.main.mathbac.m_ma
import kotlinx.android.synthetic.main.mathbac.m_ol
import kotlinx.android.synthetic.main.mathbac.m_sp
import kotlinx.android.synthetic.main.mathbac.m_tj
import kotlinx.android.synthetic.main.mathbac.ma
import kotlinx.android.synthetic.main.mathbac.ol
import kotlinx.android.synthetic.main.mathbac.sp
import kotlinx.android.synthetic.main.mathbac.tj
import kotlinx.android.synthetic.main.sentficbac.*
import java.math.RoundingMode

class sentficbac : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sentficbac)
        ar.filters= arrayOf<InputFilter>(InputFilterMinMax(0.0F,20.0F))
        onelong.filters= arrayOf<InputFilter>(InputFilterMinMax(0.0F,20.0F))
        twolong.filters= arrayOf<InputFilter>(InputFilterMinMax(0.0F,20.0F))
        `is`.filters= arrayOf<InputFilter>(InputFilterMinMax(0.0F,20.0F))
        tj.filters= arrayOf<InputFilter>(InputFilterMinMax(0.0F,20.0F))
        ma.filters= arrayOf<InputFilter>(InputFilterMinMax(0.0F,20.0F))
        ol.filters= arrayOf<InputFilter>(InputFilterMinMax(0.0F,20.0F))
        fi.filters= arrayOf<InputFilter>(InputFilterMinMax(0.0F,20.0F))
        fl.filters= arrayOf<InputFilter>(InputFilterMinMax(0.0F,20.0F))
        sp.filters= arrayOf<InputFilter>(InputFilterMinMax(0.0F,20.0F))
        amz.filters= arrayOf<InputFilter>(InputFilterMinMax(0.0F,20.0F))
        checkBoxm3fasport.setOnClickListener {
            if (checkBoxm3fasport.isChecked){
                m_sp.text="0.0"
                m_sp.setTextColor(ContextCompat.getColor(this,R.color.transparnt))
                sp.setText("0.0")
                sp.setTextColor(ContextCompat.getColor(this,R.color.transparnt))
                sp.isEnabled=false
            }else{
                m_sp.text="1"
                m_sp.setTextColor(ContextCompat.getColor(this,R.color.bleu))
                sp.setText("")
                sp.hint = "0/20"
                sp.setTextColor(ContextCompat.getColor(this,R.color.black))
                sp.isEnabled=true
            }
        }
        checkBoxm3faamz.setOnClickListener {
            if (checkBoxm3faamz.isChecked){
                m_amz.text="0.0"
                m_amz.setTextColor(ContextCompat.getColor(this,R.color.transparnt))
                amz.setText("0.0")
                amz.setTextColor(ContextCompat.getColor(this,R.color.transparnt))
                amz.isEnabled=false
            }else{
                m_amz.text="2"
                m_amz.setTextColor(ContextCompat.getColor(this,R.color.bleu))
                amz.setText("")
                amz.hint = "0/20"
                amz.setTextColor(ContextCompat.getColor(this,R.color.black))
                amz.isEnabled=true
            }
        }
        buttonvidesentfic.setOnClickListener {
            ar.setText("")
            onelong.setText("")
            twolong.setText("")
            `is`.setText("")
            tj.setText("")
            ma.setText("")
            ol.setText("")
            fi.setText("")
            fl.setText("")
            sp.setText("")
            amz.setText("")
            ar.hint = "0/20"
            onelong.hint = "0/20"
            twolong.hint = "0/20"
            `is`.hint = "0/20"
            tj.hint = "0/20"
            ma.hint = "0/20"
            ol.hint = "0/20"
            fi.hint = "0/20"
            fl.hint = "0/20"
            if (checkBoxm3faamz.isChecked){
                sp.setText("0.0")
                amz.setText("0.0")
            }else{
                sp.hint="0/20"
                amz.hint="0/20"
            }

        }
        bacsentfic.setOnClickListener {
            try {

                val alm3dl= (( (ar.text.toString().toFloat()*m_ar.text.toString().toFloat() )+(twolong.text.toString().toFloat()*m_twolong.text.toString().toFloat())+(onelong.text.toString().toFloat()*m_onelong.text.toString().toFloat())+(`is`.text.toString().toFloat()*m_is.text.toString().toFloat())+(tj.text.toString().toFloat()*m_tj.text.toString().toFloat())+(ma.text.toString().toFloat()*m_ma.text.toString().toFloat())+(ol.text.toString().toFloat()*m_ol.text.toString().toFloat())+(fi.text.toString().toFloat()*m_fi.text.toString().toFloat())+(fl.text.toString().toFloat()*m_fl.text.toString().toFloat())+(sp.text.toString().toFloat()*m_sp.text.toString().toFloat())+(amz.text.toString().toFloat()*m_amz.text.toString().toFloat()))/(m_ar.text.toString().toFloat()+m_onelong.text.toString().toFloat()+m_twolong.text.toString().toFloat()+m_is.text.toString().toFloat()+m_tj.text.toString().toFloat()+m_ma.text.toString().toFloat()+m_ol.text.toString().toFloat()+m_fi.text.toString().toFloat()+m_fl.text.toString().toFloat()+m_sp.text.toString().toFloat()+m_amz.text.toString().toFloat())).toBigDecimal().setScale(2,
                    RoundingMode.HALF_EVEN).toFloat()


                val builder= AlertDialog.Builder(this)
                val inflater=getSystemService(LAYOUT_INFLATER_SERVICE) as LayoutInflater
                val view: View =inflater.inflate(R.layout.alertdialogbac,null)
                if (alm3dl>=10){
                    view.kari.setBackgroundColor(ContextCompat.getColor(this,R.color.fbutton_color_emerald))
                    view.textViewalm3dl.text = alm3dl.toString()
                    view.textViewalm3dl.setTextColor(ContextCompat.getColor(this,R.color.fbutton_color_nephritis))
                    view.textViewmlahda.text="الف مبروك!!"
                    view.textViewmlahda.setTextColor(ContextCompat.getColor(this,R.color.fbutton_color_nephritis))
                    view.imageView.setImageResource(R.drawable.winner)
                }else{
                    view.kari.setBackgroundColor(ContextCompat.getColor(this,R.color.fbutton_color_pomegranate))
                    view.textViewalm3dl.text = alm3dl.toString()
                    view.textViewalm3dl.setTextColor(ContextCompat.getColor(this,R.color.fbutton_color_pomegranate))
                    view.textViewmlahda.text="للأسف راسب!!"
                    view.textViewmlahda.setTextColor(ContextCompat.getColor(this,R.color.fbutton_color_pomegranate))
                    view.imageView.setImageResource(R.drawable.sad)
                }
                builder.setView(view).show()
            }catch (Ex:Exception){
                Toast.makeText(this,"إملأ جميع النقاط و حدد المعفى", Toast.LENGTH_LONG).show()
            }
        }



    }

    override fun onBackPressed() {
        super.onBackPressed()
        val intent= Intent(this, home::class.java)
        startActivity(intent)
    }


    }
