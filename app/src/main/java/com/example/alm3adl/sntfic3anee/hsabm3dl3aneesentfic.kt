package com.example.alm3adl.sntfic3anee

import android.app.ProgressDialog
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
import com.example.alm3adl.math3anee.Result3aneemath
import kotlinx.android.synthetic.main.alert.view.*
import kotlinx.android.synthetic.main.hsabm3dl1anneesentfic.*
import kotlinx.android.synthetic.main.hsabm3dl1anneesentfic.checkBoxm3faamz
import kotlinx.android.synthetic.main.hsabm3dl1anneesentfic.checkBoxm3fasport
import kotlinx.android.synthetic.main.hsabm3dl1anneesentfic.checkBoxm3fatchkilia
import kotlinx.android.synthetic.main.hsabm3dl1anneesentfic.m_3
import kotlinx.android.synthetic.main.hsabm3dl1anneesentfic.m_a
import kotlinx.android.synthetic.main.hsabm3dl1anneesentfic.m_amz
import kotlinx.android.synthetic.main.hsabm3dl1anneesentfic.m_e
import kotlinx.android.synthetic.main.hsabm3dl1anneesentfic.m_f
import kotlinx.android.synthetic.main.hsabm3dl1anneesentfic.m_f_3
import kotlinx.android.synthetic.main.hsabm3dl1anneesentfic.m_f_a
import kotlinx.android.synthetic.main.hsabm3dl1anneesentfic.m_f_amz
import kotlinx.android.synthetic.main.hsabm3dl1anneesentfic.m_f_e
import kotlinx.android.synthetic.main.hsabm3dl1anneesentfic.m_f_f
import kotlinx.android.synthetic.main.hsabm3dl1anneesentfic.m_f_fi
import kotlinx.android.synthetic.main.hsabm3dl1anneesentfic.m_f_i
import kotlinx.android.synthetic.main.hsabm3dl1anneesentfic.m_f_m
import kotlinx.android.synthetic.main.hsabm3dl1anneesentfic.m_f_s
import kotlinx.android.synthetic.main.hsabm3dl1anneesentfic.m_f_t
import kotlinx.android.synthetic.main.hsabm3dl1anneesentfic.m_f_tj
import kotlinx.android.synthetic.main.hsabm3dl1anneesentfic.m_fi
import kotlinx.android.synthetic.main.hsabm3dl1anneesentfic.m_i
import kotlinx.android.synthetic.main.hsabm3dl1anneesentfic.m_i_3
import kotlinx.android.synthetic.main.hsabm3dl1anneesentfic.m_i_a
import kotlinx.android.synthetic.main.hsabm3dl1anneesentfic.m_i_amz
import kotlinx.android.synthetic.main.hsabm3dl1anneesentfic.m_i_e
import kotlinx.android.synthetic.main.hsabm3dl1anneesentfic.m_i_f
import kotlinx.android.synthetic.main.hsabm3dl1anneesentfic.m_i_fi
import kotlinx.android.synthetic.main.hsabm3dl1anneesentfic.m_i_i
import kotlinx.android.synthetic.main.hsabm3dl1anneesentfic.m_i_m
import kotlinx.android.synthetic.main.hsabm3dl1anneesentfic.m_i_s
import kotlinx.android.synthetic.main.hsabm3dl1anneesentfic.m_i_t
import kotlinx.android.synthetic.main.hsabm3dl1anneesentfic.m_i_tj
import kotlinx.android.synthetic.main.hsabm3dl1anneesentfic.m_m
import kotlinx.android.synthetic.main.hsabm3dl1anneesentfic.m_s
import kotlinx.android.synthetic.main.hsabm3dl1anneesentfic.m_t
import kotlinx.android.synthetic.main.hsabm3dl1anneesentfic.m_t_3
import kotlinx.android.synthetic.main.hsabm3dl1anneesentfic.m_t_a
import kotlinx.android.synthetic.main.hsabm3dl1anneesentfic.m_t_amz
import kotlinx.android.synthetic.main.hsabm3dl1anneesentfic.m_t_e
import kotlinx.android.synthetic.main.hsabm3dl1anneesentfic.m_t_f
import kotlinx.android.synthetic.main.hsabm3dl1anneesentfic.m_t_fi
import kotlinx.android.synthetic.main.hsabm3dl1anneesentfic.m_t_i
import kotlinx.android.synthetic.main.hsabm3dl1anneesentfic.m_t_m
import kotlinx.android.synthetic.main.hsabm3dl1anneesentfic.m_t_s
import kotlinx.android.synthetic.main.hsabm3dl1anneesentfic.m_t_t
import kotlinx.android.synthetic.main.hsabm3dl1anneesentfic.m_t_tj
import kotlinx.android.synthetic.main.hsabm3dl1anneesentfic.m_tj
import kotlinx.android.synthetic.main.hsabm3dl2aneeflsafa.*
import kotlinx.android.synthetic.main.hsabm3dl3aneemath.*
import kotlinx.android.synthetic.main.hsabm3dl3aneemath.m_f_fl
import kotlinx.android.synthetic.main.hsabm3dl3aneemath.m_fl
import kotlinx.android.synthetic.main.hsabm3dl3aneemath.m_i_fl
import kotlinx.android.synthetic.main.hsabm3dl3aneemath.m_t_fl
import kotlinx.android.synthetic.main.hsabm3dl3aneesentfic.*
import java.math.RoundingMode

class hsabm3dl3aneesentfic : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.hsabm3dl3aneesentfic)
        val databack = getSharedPreferences("3anneesentfic", MODE_PRIVATE)

        checkBoxm3fatchkilia.isChecked=  databack.getBoolean("ischeckt",false)
        checkBoxm3fasport.isChecked=  databack.getBoolean("ischeckspo",false)
        checkBoxm3faamz.isChecked=  databack.getBoolean("ischeckamz",false)
        checkBoxm3fattm3anneesentfic.isChecked=databack.getBoolean("ischeckttm",false)

        if (checkBoxm3fatchkilia.isChecked) {
            m_t_t.isEnabled = false
            m_t_t.setText(R.string.viditext)
            m_t_t.setTextColor(ContextCompat.getColor(this,R.color.transparnt))
            m_f_t.isEnabled = false
            m_f_t.setText(R.string.viditext)
            m_f_t.setTextColor(ContextCompat.getColor(this,R.color.transparnt))
            m_i_t.isEnabled = false
            m_i_t.setText(R.string.viditext)
            m_i_t.setTextColor(ContextCompat.getColor(this,R.color.transparnt))
            m_t.isEnabled = false
            m_t.setText(R.string.viditext)
            m_t.setTextColor(ContextCompat.getColor(this,R.color.transparnt))
        } else {
            m_t_t.isEnabled = true
            m_t_t.setText(R.string.amhiklch)
            m_t_t.setHint(R.string.hint3chrin)
            m_t_t.setTextColor(ContextCompat.getColor(this,R.color.black))
            m_f_t.isEnabled = true
            m_f_t.setText(R.string.amhiklch)
            m_f_t.setHint(R.string.hint3chrin)
            m_f_t.setTextColor(ContextCompat.getColor(this,R.color.black))
            m_i_t.isEnabled = true
            m_i_t.setText(R.string.amhiklch)
            m_i_t.setHint(R.string.hint3chrin)
            m_i_t.setTextColor(ContextCompat.getColor(this,R.color.black))
            m_t.isEnabled = true
            m_t.setText(R.string.amhiklch)
            m_t.setHint(R.string.hintZero)
            m_t.setTextColor(ContextCompat.getColor(this,R.color.bleu))
        }
        if (checkBoxm3fasport.isChecked) {
            m_t_s.isEnabled = false
            m_t_s.setText(R.string.viditext)
            m_t_s.setTextColor(ContextCompat.getColor(this,R.color.transparnt))
            m_f_s.isEnabled = false
            m_f_s.setText(R.string.viditext)
            m_f_s.setTextColor(ContextCompat.getColor(this,R.color.transparnt))
            m_i_s.isEnabled = false
            m_i_s.setText(R.string.viditext)
            m_i_s.setTextColor(ContextCompat.getColor(this,R.color.transparnt))
            m_s.isEnabled = false
            m_s.setText(R.string.viditext)
            m_s.setTextColor(ContextCompat.getColor(this,R.color.transparnt))

        } else {
            m_t_s.isEnabled = true
            m_t_s.setText(R.string.amhiklch)
            m_t_s.setHint(R.string.hint3chrin)
            m_t_s.setTextColor(ContextCompat.getColor(this,R.color.black))
            m_f_s.isEnabled = true
            m_f_s.setText(R.string.amhiklch)
            m_f_s.setHint(R.string.hint3chrin)
            m_f_s.setTextColor(ContextCompat.getColor(this,R.color.black))
            m_i_s.isEnabled = true
            m_i_s.setText(R.string.amhiklch)
            m_i_s.setHint(R.string.hint3chrin)
            m_i_s.setTextColor(ContextCompat.getColor(this,R.color.black))
            m_s.isEnabled = true
            m_s.setText(R.string.amhiklch)
            m_s.setHint(R.string.hintZero)
            m_s.setTextColor(ContextCompat.getColor(this,R.color.bleu))
        }

        if (checkBoxm3faamz.isChecked) {
            m_t_amz.isEnabled = false
            m_t_amz.setText(R.string.viditext)
            m_t_amz.setTextColor(ContextCompat.getColor(this,R.color.transparnt))
            m_f_amz.isEnabled = false
            m_f_amz.setText(R.string.viditext)
            m_f_amz.setTextColor(ContextCompat.getColor(this,R.color.transparnt))
            m_i_amz.isEnabled = false
            m_i_amz.setText(R.string.viditext)
            m_i_amz.setTextColor(ContextCompat.getColor(this,R.color.transparnt))
            m_amz.isEnabled = false
            m_amz.setText(R.string.viditext)
            m_amz.setTextColor(ContextCompat.getColor(this,R.color.transparnt))
        } else {
            m_t_amz.isEnabled = true
            m_t_amz.setText(R.string.amhiklch)
            m_t_amz.setHint(R.string.hint3chrin)
            m_t_amz.setTextColor(ContextCompat.getColor(this,R.color.black))
            m_f_amz.isEnabled = true
            m_f_amz.setText(R.string.amhiklch)
            m_f_amz.setHint(R.string.hint3chrin)
            m_f_amz.setTextColor(ContextCompat.getColor(this,R.color.black))
            m_i_amz.isEnabled = true
            m_i_amz.setText(R.string.amhiklch)
            m_i_amz.setHint(R.string.hint3chrin)
            m_i_amz.setTextColor(ContextCompat.getColor(this,R.color.black))
            m_amz.isEnabled = true
            m_amz.setText(R.string.amhiklch)
            m_amz.setHint(R.string.hintZero)
            m_amz.setTextColor(ContextCompat.getColor(this,R.color.bleu))
        }
        if(checkBoxm3fattm3anneesentfic.isChecked){
            ttm3anneesentfic.isEnabled=false
            ttm3anneesentfic.setText(R.string.viditext)
            ttm3anneesentfic.setTextColor(ContextCompat.getColor(this,R.color.transparnt))
        }else{
            ttm3anneesentfic.isEnabled=true
            ttm3anneesentfic.setText(R.string.amhiklch)
            ttm3anneesentfic.setHint(R.string.hint3chrin)
            ttm3anneesentfic.setTextColor(ContextCompat.getColor(this,R.color.black))
        }
        m_t_a.setText(databack.getString("m_t_a", ""))
        m_f_a.setText(databack.getString("m_f_a", ""))
        m_i_a.setText(databack.getString("m_i_a", ""))
        m_a.setText(databack.getString("m_a", ""))
        m_t_f.setText(databack.getString("m_t_f", ""))
        m_f_f.setText(databack.getString("m_f_f", ""))
        m_i_f.setText(databack.getString("m_i_f", ""))
        m_f.setText(databack.getString("m_f", ""))
        m_t_e.setText(databack.getString("m_t_e", ""))
        m_f_e.setText(databack.getString("m_f_e", ""))
        m_i_e.setText(databack.getString("m_i_e", ""))
        m_e.setText(databack.getString("m_e", ""))
        m_t_t.setText(databack.getString("m_t_t", ""))
        m_f_t.setText(databack.getString("m_f_t", ""))
        m_i_t.setText(databack.getString("m_i_t", ""))
        m_t.setText(databack.getString("m_t", ""))
        m_t_tj.setText(databack.getString("m_t_tj", ""))
        m_f_tj.setText(databack.getString("m_f_tj", ""))
        m_i_tj.setText(databack.getString("m_i_tj", ""))
        m_tj.setText(databack.getString("m_tj", ""))
        m_t_m.setText(databack.getString("m_t_m", ""))
        m_f_m.setText(databack.getString("m_f_m", ""))
        m_i_m.setText(databack.getString("m_i_m", ""))
        m_m.setText(databack.getString("m_m", ""))
        m_t_3.setText(databack.getString("m_t_3", ""))
        m_f_3.setText(databack.getString("m_f_3", ""))
        m_i_3.setText(databack.getString("m_i_3", ""))
        m_3.setText(databack.getString("m_3", ""))
        m_t_fi.setText(databack.getString("m_t_fi", ""))
        m_f_fi.setText(databack.getString("m_f_fi", ""))
        m_i_fi.setText(databack.getString("m_i_fi", ""))
        m_fi.setText(databack.getString("m_fi", ""))
        m_t_fl.setText(databack.getString("m_t_fl", ""))
        m_f_fl.setText(databack.getString("m_f_fl", ""))
        m_i_fl.setText(databack.getString("m_i_fl", ""))
        m_fl.setText(databack.getString("m_fl", ""))
        m_t_s.setText(databack.getString("m_t_s", ""))
        m_f_s.setText(databack.getString("m_f_s", ""))
        m_i_s.setText(databack.getString("m_i_s", ""))
        m_s.setText(databack.getString("m_s", ""))
        m_t_amz.setText(databack.getString("m_t_amz", ""))
        m_f_amz.setText(databack.getString("m_f_amz", ""))
        m_i_amz.setText(databack.getString("m_i_amz", ""))
        m_amz.setText(databack.getString("m_amz", ""))
        m_t_i.setText(databack.getString("m_t_i", ""))
        m_f_i.setText(databack.getString("m_f_i", ""))
        m_i_i.setText(databack.getString("m_i_i", ""))
        m_i.setText(databack.getString("m_i", ""))
        ttm3anneesentfic.setText(databack.getString("ttm3anneesentfic",""))

        m_t_a.filters = arrayOf<InputFilter>(InputFilterMinMax(0.0F, 20.0F))
        m_f_a.filters = arrayOf<InputFilter>(InputFilterMinMax(0.0F, 20.0F))
        m_i_a.filters = arrayOf<InputFilter>(InputFilterMinMax(0.0F, 20.0F))
        m_t_f.filters = arrayOf<InputFilter>(InputFilterMinMax(0.0F, 20.0F))
        m_f_f.filters = arrayOf<InputFilter>(InputFilterMinMax(0.0F, 20.0F))
        m_i_f.filters = arrayOf<InputFilter>(InputFilterMinMax(0.0F, 20.0F))
        m_t_e.filters = arrayOf<InputFilter>(InputFilterMinMax(0.0F, 20.0F))
        m_f_e.filters = arrayOf<InputFilter>(InputFilterMinMax(0.0F, 20.0F))
        m_i_e.filters = arrayOf<InputFilter>(InputFilterMinMax(0.0F, 20.0F))
        m_t_tj.filters = arrayOf<InputFilter>(InputFilterMinMax(0.0F, 20.0F))
        m_f_tj.filters = arrayOf<InputFilter>(InputFilterMinMax(0.0F, 20.0F))
        m_i_tj.filters = arrayOf<InputFilter>(InputFilterMinMax(0.0F, 20.0F))
        m_t_m.filters = arrayOf<InputFilter>(InputFilterMinMax(0.0F, 20.0F))
        m_f_m.filters = arrayOf<InputFilter>(InputFilterMinMax(0.0F, 20.0F))
        m_i_m.filters = arrayOf<InputFilter>(InputFilterMinMax(0.0F, 20.0F))
        m_t_3.filters = arrayOf<InputFilter>(InputFilterMinMax(0.0F, 20.0F))
        m_f_3.filters = arrayOf<InputFilter>(InputFilterMinMax(0.0F, 20.0F))
        m_i_3.filters = arrayOf<InputFilter>(InputFilterMinMax(0.0F, 20.0F))
        m_t_fi.filters = arrayOf<InputFilter>(InputFilterMinMax(0.0F, 20.0F))
        m_f_fi.filters = arrayOf<InputFilter>(InputFilterMinMax(0.0F, 20.0F))
        m_i_fi.filters = arrayOf<InputFilter>(InputFilterMinMax(0.0F, 20.0F))
        m_t_s.filters = arrayOf<InputFilter>(InputFilterMinMax(0.0F, 20.0F))
        m_f_s.filters = arrayOf<InputFilter>(InputFilterMinMax(0.0F, 20.0F))
        m_i_s.filters = arrayOf<InputFilter>(InputFilterMinMax(0.0F, 20.0F))
        m_t_amz.filters = arrayOf<InputFilter>(InputFilterMinMax(0.0F, 20.0F))
        m_f_amz.filters = arrayOf<InputFilter>(InputFilterMinMax(0.0F, 20.0F))
        m_i_amz.filters = arrayOf<InputFilter>(InputFilterMinMax(0.0F, 20.0F))
        m_t_t.filters = arrayOf<InputFilter>(InputFilterMinMax(0.0F, 20.0F))
        m_f_t.filters = arrayOf<InputFilter>(InputFilterMinMax(0.0F, 20.0F))
        m_i_t.filters = arrayOf<InputFilter>(InputFilterMinMax(0.0F, 20.0F))
        m_t_i.filters = arrayOf<InputFilter>(InputFilterMinMax(0.0F, 20.0F))
        m_f_i.filters = arrayOf<InputFilter>(InputFilterMinMax(0.0F, 20.0F))
        m_i_i.filters = arrayOf<InputFilter>(InputFilterMinMax(0.0F, 20.0F))
        m_t_fl.filters = arrayOf<InputFilter>(InputFilterMinMax(0.0F, 20.0F))
        m_f_fl.filters = arrayOf<InputFilter>(InputFilterMinMax(0.0F, 20.0F))
        m_i_fl.filters = arrayOf<InputFilter>(InputFilterMinMax(0.0F, 20.0F))
        ttm3anneesentfic.filters= arrayOf<InputFilter>(InputFilterMinMax(0.0F,20.0F))
        checkBoxm3fatchkilia.setOnClickListener {
            if (checkBoxm3fatchkilia.isChecked) {
                m_t_t.isEnabled = false
                m_t_t.setText(R.string.viditext)
                m_t_t.setTextColor(ContextCompat.getColor(this,R.color.transparnt))
                m_f_t.isEnabled = false
                m_f_t.setText(R.string.viditext)
                m_f_t.setTextColor(ContextCompat.getColor(this,R.color.transparnt))
                m_i_t.isEnabled = false
                m_i_t.setText(R.string.viditext)
                m_i_t.setTextColor(ContextCompat.getColor(this,R.color.transparnt))
                m_t.isEnabled = false
                m_t.setText(R.string.viditext)
                m_t.setTextColor(ContextCompat.getColor(this,R.color.transparnt))
            } else {
                m_t_t.isEnabled = true
                m_t_t.setText(R.string.amhiklch)
                m_t_t.setHint(R.string.hint3chrin)
                m_t_t.setTextColor(ContextCompat.getColor(this,R.color.black))
                m_f_t.isEnabled = true
                m_f_t.setText(R.string.amhiklch)
                m_f_t.setHint(R.string.hint3chrin)
                m_f_t.setTextColor(ContextCompat.getColor(this,R.color.black))
                m_i_t.isEnabled = true
                m_i_t.setText(R.string.amhiklch)
                m_i_t.setHint(R.string.hint3chrin)
                m_i_t.setTextColor(ContextCompat.getColor(this,R.color.black))
                m_t.isEnabled = true
                m_t.setText(R.string.amhiklch)
                m_t.setHint(R.string.hintZero)
                m_t.setTextColor(ContextCompat.getColor(this,R.color.bleu))
            }



        }

        checkBoxm3fasport.setOnClickListener {
            if (checkBoxm3fasport.isChecked) {
                m_t_s.isEnabled = false
                m_t_s.setText(R.string.viditext)
                m_t_s.setTextColor(ContextCompat.getColor(this,R.color.transparnt))
                m_f_s.isEnabled = false
                m_f_s.setText(R.string.viditext)
                m_f_s.setTextColor(ContextCompat.getColor(this,R.color.transparnt))
                m_i_s.isEnabled = false
                m_i_s.setText(R.string.viditext)
                m_i_s.setTextColor(ContextCompat.getColor(this,R.color.transparnt))
                m_s.isEnabled = false
                m_s.setText(R.string.viditext)
                m_s.setTextColor(ContextCompat.getColor(this,R.color.transparnt))
            } else {
                m_t_s.isEnabled = true
                m_t_s.setText(R.string.amhiklch)
                m_t_s.setHint(R.string.hint3chrin)
                m_t_s.setTextColor(ContextCompat.getColor(this,R.color.black))
                m_f_s.isEnabled = true
                m_f_s.setText(R.string.amhiklch)
                m_f_s.setHint(R.string.hint3chrin)
                m_f_s.setTextColor(ContextCompat.getColor(this,R.color.black))
                m_i_s.isEnabled = true
                m_i_s.setText(R.string.amhiklch)
                m_i_s.setHint(R.string.hint3chrin)
                m_i_s.setTextColor(ContextCompat.getColor(this,R.color.black))
                m_s.isEnabled = true
                m_s.setText(R.string.amhiklch)
                m_s.setHint(R.string.hintZero)
                m_s.setTextColor(ContextCompat.getColor(this,R.color.bleu))
            }

        }
        checkBoxm3faamz.setOnClickListener {
            if (checkBoxm3faamz.isChecked) {
                m_t_amz.isEnabled = false
                m_t_amz.setText(R.string.viditext)
                m_t_amz.setTextColor(ContextCompat.getColor(this,R.color.transparnt))
                m_f_amz.isEnabled = false
                m_f_amz.setText(R.string.viditext)
                m_f_amz.setTextColor(ContextCompat.getColor(this,R.color.transparnt))
                m_i_amz.isEnabled = false
                m_i_amz.setText(R.string.viditext)
                m_i_amz.setTextColor(ContextCompat.getColor(this,R.color.transparnt))
                m_amz.isEnabled = false
                m_amz.setText(R.string.viditext)
                m_amz.setTextColor(ContextCompat.getColor(this,R.color.transparnt))
            } else {
                m_t_amz.isEnabled = true
                m_t_amz.setText(R.string.amhiklch)
                m_t_amz.setHint(R.string.hint3chrin)
                m_t_amz.setTextColor(ContextCompat.getColor(this,R.color.black))
                m_f_amz.isEnabled = true
                m_f_amz.setText(R.string.amhiklch)
                m_f_amz.setHint(R.string.hint3chrin)
                m_f_amz.setTextColor(ContextCompat.getColor(this,R.color.black))
                m_i_amz.isEnabled = true
                m_i_amz.setText(R.string.amhiklch)
                m_i_amz.setHint(R.string.hint3chrin)
                m_i_amz.setTextColor(ContextCompat.getColor(this,R.color.black))
                m_amz.isEnabled = true
                m_amz.setText(R.string.amhiklch)
                m_amz.setHint(R.string.hintZero)
                m_amz.setTextColor(ContextCompat.getColor(this,R.color.bleu))
            }
        }
        checkBoxm3fattm3anneesentfic.setOnClickListener {
            if(checkBoxm3fattm3anneesentfic.isChecked){
                ttm3anneesentfic.isEnabled=false
                ttm3anneesentfic.setText(R.string.viditext)
                ttm3anneesentfic.setTextColor(ContextCompat.getColor(this,R.color.transparnt))
            }else{
                ttm3anneesentfic.isEnabled=true
                ttm3anneesentfic.setText(R.string.amhiklch)
                ttm3anneesentfic.setHint(R.string.hint3chrin)
                ttm3anneesentfic.setTextColor(ContextCompat.getColor(this,R.color.black))
            }
        }

        buttonAutom3amlat3aneesentfic.setOnClickListener {
            m_a.setText("3")
            m_f.setText("2")
            m_e.setText("2")
            m_i.setText("2")
            m_tj.setText("2")
            m_m.setText("5")
            m_3.setText("6")
            m_fi.setText("5")
            m_fl.setText("2")
            if(checkBoxm3fatchkilia.isChecked){
                m_t.setText("0.0")
            }else{
                m_t.setText("1")
            }

            if (checkBoxm3faamz.isChecked){
                m_amz.setText("0.0")
            }else{
                m_amz.setText("2")
            }
            if (checkBoxm3fasport.isChecked){
                m_s.setText("0.0")
            }else{
                m_s.setText("1")
            }
        }
        buttonvide3anneesentfic.setOnClickListener {
            m_t_a.setText("")
            m_f_a.setText("")
            m_i_a.setText("")
            m_a.setText("")
            m_t_f.setText("")
            m_f_f.setText("")
            m_i_f.setText("")
            m_f.setText("")
            m_t_e.setText("")
            m_f_e.setText("")
            m_i_e.setText("")
            m_e.setText("")
            m_t_i.setText("")
            m_f_i.setText("")
            m_i_i.setText("")
            m_i.setText("")
            m_t_tj.setText("")
            m_f_tj.setText("")
            m_i_tj.setText("")
            m_tj .setText("")
            m_t_m .setText("")
            m_f_m .setText("")
            m_i_m.setText("")
            m_m.setText("")
            m_t_3.setText("")
            m_f_3.setText("")
            m_i_3.setText("")
            m_3.setText("")
            m_t_fi.setText("")
            m_f_fi.setText("")
            m_i_fi.setText("")
            m_fi.setText("")
            m_t_fl.setText("")
            m_f_fl.setText("")
            m_i_fl.setText("")
            m_fl.setText("")
            m_t_s.setText("")
            m_f_s.setText("")
            m_i_s.setText("")
            m_s.setText("")
            m_t_amz .setText("")
            m_f_amz.setText("")
            m_i_amz.setText("")
            m_amz.setText("")
            m_t_t .setText("")
            m_f_t .setText("")
            m_i_t .setText("")
            m_t.setText("")
            ttm3anneesentfic.setText("")
            m_t_a.hint = "0/20"
            m_f_a.hint = "0/20"
            m_i_a.hint = "0/20"
            m_a.hint = "0"
            m_t_f.hint = "0/20"
            m_f_f.hint = "0/20"
            m_i_f.hint = "0/20"
            m_f.hint = "0"
            m_t_e.hint = "0/20"
            m_f_e.hint = "0/20"
            m_i_e.hint = "0/20"
            m_e.hint = "0"
            m_t_i.hint = "0/20"
            m_f_i.hint = "0/20"
            m_i_i.hint = "0/20"
            m_i.hint = "0"
            m_t_tj.hint = "0/20"
            m_f_tj.hint = "0/20"
            m_i_tj.hint = "0/20"
            m_tj.hint = "0"
            m_t_m.hint = "0/20"
            m_f_m.hint = "0/20"
            m_i_m.hint = "0/20"
            m_m.hint = "0"
            m_t_3.hint = "0/20"
            m_f_3.hint = "0/20"
            m_i_3.hint = "0/20"
            m_3.hint = "0"
            m_t_fi.hint = "0/20"
            m_f_fi.hint = "0/20"
            m_i_fi.hint = "0/20"
            m_fi.hint = "0"
            m_t_fl.hint = "0/20"
            m_f_fl.hint = "0/20"
            m_i_fl.hint = "0/20"
            m_fl.hint = "0"
            ttm3anneesentfic.hint="0/20"
            if (checkBoxm3fasport.isChecked){

                m_t_s.setText("0.0")
                m_f_s.setText("0.0")
                m_i_s.setText("0.0")
                m_s.setText("0.0")
            }else{
                m_t_s.hint = "0/20"
                m_f_s.hint = "0/20"
                m_i_s.hint = "0/20"
                m_s.hint = "0"
            }

            if (checkBoxm3faamz.isChecked){
                m_t_amz.setText("0.0")
                m_f_amz.setText("0.0")
                m_i_amz.setText("0.0")
                m_amz.setText("0.0")

            }else{
                m_t_amz.hint = "0/20"
                m_f_amz.hint = "0/20"
                m_i_amz.hint = "0/20"
                m_amz.hint = "0"
            }

            if (checkBoxm3fatchkilia.isChecked){
                m_t_t.setText("0.0")
                m_f_t.setText("0.0")
                m_i_t.setText("0.0")
                m_t.setText("0.0")

            }else{
                m_t_t.hint = "0/20"
                m_f_t.hint = "0/20"
                m_i_t.hint = "0/20"
                m_t.hint = "0"
            }
            if (checkBoxm3fattm3anneesentfic.isChecked){
                ttm3anneesentfic.setText("0.0")
            }else{
                ttm3anneesentfic.hint="0/20"
            }
        }
    }
    override fun onBackPressed() {
        super.getOnBackPressedDispatcher()
        val builder = AlertDialog.Builder(this, R.style.CustomDialog)
        val inflator = getSystemService(LAYOUT_INFLATER_SERVICE) as LayoutInflater

        val alertt = inflator.inflate(R.layout.alert,null)

        builder.setView(alertt)

        builder.show()
        alertt.buYes.setOnClickListener {
            val pref = getSharedPreferences("3anneesentfic", MODE_PRIVATE)
            val edit = pref.edit()
            edit.putString("m_t_a", m_t_a.text.toString())
            edit.putString("m_f_a", m_f_a.text.toString())
            edit.putString("m_i_a", m_i_a.text.toString())
            edit.putString("m_a", m_a.text.toString())
            edit.putString("m_t_f", m_t_f.text.toString())
            edit.putString("m_f_f", m_f_f.text.toString())
            edit.putString("m_i_f", m_i_f.text.toString())
            edit.putString("m_f", m_f.text.toString())
            edit.putString("m_t_e", m_t_e.text.toString())
            edit.putString("m_f_e", m_f_e.text.toString())
            edit.putString("m_i_e", m_i_e.text.toString())
            edit.putString("m_e", m_e.text.toString())
            edit.putString("m_t_t", m_t_t.text.toString())
            edit.putString("m_f_t", m_f_t.text.toString())
            edit.putString("m_i_t", m_i_t.text.toString())
            edit.putString("m_t", m_t.text.toString())
            edit.putString("m_t_tj", m_t_tj.text.toString())
            edit.putString("m_f_tj", m_f_tj.text.toString())
            edit.putString("m_i_tj", m_i_tj.text.toString())
            edit.putString("m_tj", m_tj.text.toString())
            edit.putString("m_t_m", m_t_m.text.toString())
            edit.putString("m_f_m", m_f_m.text.toString())
            edit.putString("m_i_m", m_i_m.text.toString())
            edit.putString("m_m", m_m.text.toString())
            edit.putString("m_t_3", m_t_3.text.toString())
            edit.putString("m_f_3", m_f_3.text.toString())
            edit.putString("m_i_3", m_i_3.text.toString())
            edit.putString("m_3", m_3.text.toString())
            edit.putString("m_t_fi", m_t_fi.text.toString())
            edit.putString("m_f_fi", m_f_fi.text.toString())
            edit.putString("m_i_fi", m_i_fi.text.toString())
            edit.putString("m_fi", m_fi.text.toString())
            edit.putString("m_t_fl", m_t_fl.text.toString())
            edit.putString("m_f_fl", m_f_fl.text.toString())
            edit.putString("m_i_fl", m_i_fl.text.toString())
            edit.putString("m_fl", m_fl.text.toString())
            edit.putString("m_t_s", m_t_s.text.toString())
            edit.putString("m_f_s", m_f_s.text.toString())
            edit.putString("m_i_s", m_i_s.text.toString())
            edit.putString("m_s", m_s.text.toString())
            edit.putString("m_t_amz", m_t_amz.text.toString())
            edit.putString("m_f_amz", m_f_amz.text.toString())
            edit.putString("m_i_amz", m_i_amz.text.toString())
            edit.putString("m_amz", m_amz.text.toString())
            edit.putString("m_t_i", m_t_i.text.toString())
            edit.putString("m_f_i", m_f_i.text.toString())
            edit.putString("m_i_i", m_i_i.text.toString())
            edit.putString("m_i", m_i.text.toString())
            edit.putString("ttm3anneesentfic",ttm3anneesentfic.text.toString())
            if (checkBoxm3fatchkilia.isChecked) {
                edit.putBoolean("ischeckt", true)
            }else{
                edit.putBoolean("ischeckt", false)
            }
            if (checkBoxm3faamz.isChecked){
                edit.putBoolean("ischeckamz",true)
            }else{
                edit.putBoolean("ischeckamz",false)
            }
            if (checkBoxm3fasport.isChecked){
                edit.putBoolean("ischeckspo",true)
            }else{
                edit.putBoolean("ischeckspo",false)
            }
            if (checkBoxm3fattm3anneesentfic.isChecked){
                edit.putBoolean("ischeckttm",true)
            }else{
                edit.putBoolean("ischeckttm",false)
            }


            edit.apply()

            Toast.makeText(this, "تم الحفظ", Toast.LENGTH_LONG).show()
            finish()

        }


        alertt.buNo.setOnClickListener {
            val V=""
            val dataput = getSharedPreferences("3anneesentfic", MODE_PRIVATE)
            val edit = dataput.edit()
            edit.putString("m_t_a", V)
            edit.putString("m_f_a", V)
            edit.putString("m_i_a", V)
            edit.putString("m_a", V)
            edit.putString("m_t_f", V)
            edit.putString("m_f_f", V)
            edit.putString("m_i_f", V)
            edit.putString("m_f", V)
            edit.putString("m_t_e", V)
            edit.putString("m_f_e", V)
            edit.putString("m_i_e", V)
            edit.putString("m_e", V)
            edit.putString("m_t_tj", V)
            edit.putString("m_f_tj", V)
            edit.putString("m_i_tj", V)
            edit.putString("m_tj", V)
            edit.putString("m_t_m", V)
            edit.putString("m_f_m", V)
            edit.putString("m_i_m", V)
            edit.putString("m_m", V)
            edit.putString("m_t_3", V)
            edit.putString("m_f_3", V)
            edit.putString("m_i_3", V)
            edit.putString("m_3", V)
            edit.putString("m_t_fi", V)
            edit.putString("m_f_fi", V)
            edit.putString("m_i_fi", V)
            edit.putString("m_fi", V)
            edit.putString("m_t_fl", V)
            edit.putString("m_f_fl", V)
            edit.putString("m_i_fl", V)
            edit.putString("m_fl", V)
            edit.putString("m_t_s", V)
            edit.putString("m_f_s", V)
            edit.putString("m_i_s", V)
            edit.putString("m_s", V)
            edit.putString("m_t_amz", V)
            edit.putString("m_f_amz", V)
            edit.putString("m_i_amz", V)
            edit.putString("m_amz", V)
            edit.putString("m_t_t", V)
            edit.putString("m_f_t", V)
            edit.putString("m_i_t", V)
            edit.putString("m_t", V)
            edit.putString("m_t_i", V)
            edit.putString("m_f_i", V)
            edit.putString("m_i_i", V)
            edit.putString("m_i", V)
            edit.putString("ttm3anneesentfic",V)
            if (checkBoxm3fatchkilia.isChecked){
                edit.putBoolean("ischeckt",false)
            }else{
                edit.putBoolean("ischeckt",false)
            }
            if (checkBoxm3faamz.isChecked){
                edit.putBoolean("ischeckamz",false)
            }else{
                edit.putBoolean("ischeckamz",false)
            }
            if (checkBoxm3fasport.isChecked){
                edit.putBoolean("ischeckspo",false)
            }else{
                edit.putBoolean("ischeckspo",false)
            }

            if (checkBoxm3fattm3anneesentfic.isChecked){
                edit.putBoolean("ischeckttm",false)
            }else{
                edit.putBoolean("ischeckttm",false)
            }

            edit.apply()
            finish()

        }

    }

    fun hsabntija3antiseptic(view: View) {
        try {
        val arab = (m_t_a.text.toString().toFloat() + m_f_a.text.toString()
            .toFloat() + (m_i_a.text.toString().toFloat() * 2)) / 4
        val m3dlarab = arab * m_a.text.toString().toFloat()

        val france: Float =
            (m_t_f.text.toString().toFloat() + m_f_f.text.toString()
                .toFloat() + (m_i_f.text.toString().toFloat() * 2)) / 4
        val m3dlfrance: Float = france * m_f.text.toString().toFloat()

        val english: Float =
            (m_t_e.text.toString().toFloat() + m_f_e.text.toString()
                .toFloat() + (m_i_e.text.toString().toFloat() * 2)) / 4
        val m3dlenglish: Float = english * m_e.text.toString().toFloat()

        val islamia: Float =
            (m_t_i.text.toString().toFloat() + m_f_i.text.toString()
                .toFloat() + (m_i_i.text.toString().toFloat() * 2)) / 4
        val m3dlislamia: Float = islamia * m_i.text.toString().toFloat()


        val tj: Float = (m_t_tj.text.toString().toFloat() + m_f_tj.text.toString()
            .toFloat() + (m_i_tj.text.toString().toFloat() * 2)) / 4
        val m3dltj: Float = tj * m_tj.text.toString().toFloat()

        val math: Float = (m_t_m.text.toString().toFloat() + m_f_m.text.toString()
            .toFloat() + (m_i_m.text.toString().toFloat() * 2)) / 4
        val m3dlmath: Float = math * m_m.text.toString().toFloat()

        val alom: Float = (m_t_3.text.toString().toFloat() + m_f_3.text.toString()
            .toFloat() + (m_i_3.text.toString().toFloat() * 2)) / 4
        val m3dlalom: Float = alom * m_3.text.toString().toFloat()

        val fizik: Float =
            (m_t_fi.text.toString().toFloat() + m_f_fi.text.toString()
                .toFloat() + (m_i_fi.text.toString().toFloat() * 2)) / 4
        val m3dlfizik: Float = fizik * m_fi.text.toString().toFloat()

        val trbiatchkilia: Float =
            (m_t_t.text.toString().toFloat() + m_f_t.text.toString()
                .toFloat() + (m_i_t.text.toString().toFloat() * 2)) / 4
        val m3dltrbiatchkilia: Float =
            trbiatchkilia * m_t.text.toString().toFloat()

        val sport: Float =
            (m_t_s.text.toString().toFloat() + m_f_s.text.toString()
                .toFloat() + (m_i_s.text.toString().toFloat() * 2)) / 4
        val m3dlsport: Float = sport * m_s.text.toString().toFloat()

        val amazighia: Float = (m_t_amz.text.toString().toFloat() + m_f_amz.text.toString().toFloat() + (m_i_amz.text.toString().toFloat() * 2)) / 4
        val m3dlamazighia: Float = amazighia * m_amz.text.toString().toFloat()

        val flsafa: Float = (m_t_fl.text.toString().toFloat() + m_f_fl.text.toString().toFloat() + (m_i_fl.text.toString().toFloat() * 2)) / 4
        val m3dlflsafa: Float = flsafa * m_fl.text.toString().toFloat()
            var ttm:Float=ttm3anneesentfic.text.toString().toFloat()

            if (ttm<=10.0){
                ttm=0.0F
            }else{
                ttm=ttm-10
            }
        val alm3dl =
            (m3dlarab + m3dlfrance + m3dlenglish + m3dlislamia + m3dltj + m3dlmath + m3dlalom + m3dlfizik + m3dlsport + m3dltrbiatchkilia+m3dlamazighia+ m3dlflsafa+ttm) / (m_a.text.toString()
                .toFloat() + m_f.text.toString().toFloat() + m_e.text.toString()
                .toFloat() + m_i.text.toString().toFloat() + m_tj.text.toString()
                .toFloat() + m_m.text.toString().toFloat() + m_3.text.toString()
                .toFloat() + m_fi.text.toString().toFloat() + m_t.text.toString()
                .toFloat() + m_s.text.toString().toFloat()+m_amz.text.toString().toFloat()+m_fl.text.toString().toFloat())
val m3amlat=m_a.text.toString()
    .toFloat() + m_f.text.toString().toFloat() + m_e.text.toString()
    .toFloat() + m_i.text.toString().toFloat() + m_tj.text.toString()
    .toFloat() + m_m.text.toString().toFloat() + m_3.text.toString()
    .toFloat() + m_fi.text.toString().toFloat() + m_t.text.toString()
    .toFloat() + m_s.text.toString().toFloat()+m_amz.text.toString().toFloat()+m_fl.text.toString().toFloat()

        val dd = alm3dl.toBigDecimal().setScale(2, RoundingMode.HALF_EVEN).toFloat()

val m3amlatflmwad = m3dlarab + m3dlfrance + m3dlenglish + m3dlislamia + m3dltj + m3dlmath + m3dlalom + m3dlfizik + m3dlsport + m3dltrbiatchkilia+m3dlamazighia+ m3dlflsafa+ttm
            val intent = Intent(this, Result3aneesentfic::class.java)
            intent.putExtra("alm3dl", dd)
            intent.putExtra("m3dlarab", arab.toBigDecimal().setScale(2, RoundingMode.HALF_EVEN).toFloat())
            intent.putExtra("m3dlfrance", france.toBigDecimal().setScale(2, RoundingMode.HALF_EVEN).toFloat())
            intent.putExtra("m3dlislamia", islamia.toBigDecimal().setScale(2, RoundingMode.HALF_EVEN).toFloat())
            intent.putExtra("m3dlenglish", english.toBigDecimal().setScale(2, RoundingMode.HALF_EVEN).toFloat())
            intent.putExtra("m3dltj", tj.toBigDecimal().setScale(2, RoundingMode.HALF_EVEN).toFloat())
            intent.putExtra("m3dlmath", math.toBigDecimal().setScale(2, RoundingMode.HALF_EVEN).toFloat())
            intent.putExtra("m3dl3lom", alom.toBigDecimal().setScale(2, RoundingMode.HALF_EVEN).toFloat())
            intent.putExtra("m3dlfizik", fizik.toBigDecimal().setScale(2, RoundingMode.HALF_EVEN).toFloat())
            intent.putExtra("m3dlsport", sport.toBigDecimal().setScale(2, RoundingMode.HALF_EVEN).toFloat())
            intent.putExtra("m3dltchkilia", trbiatchkilia.toBigDecimal().setScale(2, RoundingMode.HALF_EVEN).toFloat())
            intent.putExtra("m3dlamazighia",amazighia.toBigDecimal().setScale(2, RoundingMode.HALF_EVEN).toFloat())
            intent.putExtra("m3dlflsafa",flsafa.toBigDecimal().setScale(2, RoundingMode.HALF_EVEN).toFloat())
            intent.putExtra("m3amlat", m3amlat)
            intent.putExtra("m3amlatflmwad",m3amlatflmwad)
            intent.putExtra("ttm",ttm)
            this.startActivity(intent)

    } catch (ex: Exception) {
            Toast.makeText(
                this,
                "املا حميع النقاط و المعاملات و حدد المعفى منها",
                Toast.LENGTH_LONG
            ).show()
    }
    }
}

