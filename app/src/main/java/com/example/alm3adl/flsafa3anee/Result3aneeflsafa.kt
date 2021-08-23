package com.example.alm3adl.flsafa3anee

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.example.alm3adl.R
import kotlinx.android.synthetic.main.result3aneeflsafa.*
import kotlinx.android.synthetic.main.result3aneelong.textView14
import kotlinx.android.synthetic.main.result3aneelong.textView17
import kotlinx.android.synthetic.main.result3aneelong.textView18
import kotlinx.android.synthetic.main.result3aneelong.textView19
import kotlinx.android.synthetic.main.result3aneelong.textView20
import kotlinx.android.synthetic.main.result3aneelong.textView22
import kotlinx.android.synthetic.main.result3aneelong.textView25
import kotlinx.android.synthetic.main.result3aneelong.textView28
import kotlinx.android.synthetic.main.result3aneelong.textView31
import kotlinx.android.synthetic.main.result3aneelong.textView322
import kotlinx.android.synthetic.main.result3aneelong.textView35

class Result3aneeflsafa : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.result3aneeflsafa)
        val bundle=intent.extras
        val alm3dl =bundle!!.getFloat("alm3dl")
        val m3dlarab=bundle.getFloat("m3dlarab")
        val m3dlfrance=bundle.getFloat("m3dlfrance")
        val m3dlislamia=bundle.getFloat("m3dlislamia")
        val m3dlenglish=bundle.getFloat("m3dlenglish")
        val m3dltj=bundle.getFloat("m3dltj")
        val m3dlmath=bundle.getFloat("m3dlmath")
        val m3dlsport=bundle.getFloat("m3dlsport")
        val m3dltchkilia=bundle.getFloat("m3dltchkilia")
        val m3dlamazighia=bundle.getFloat("m3dlamazighia")
        val m3dlflsafa=bundle.getFloat("m3dlflsafa")
        val m3amlatflmwad=bundle.getFloat("m3amlatflmwad")
        val m3mlat=bundle.getFloat("m3amlat")
        val ttm=bundle.getFloat("ttm")
        textviewttm3anneeflsafa.text=ttm.toString()
        textView322.text=m3dlflsafa.toString()
        textView17.text=m3dlarab.toString()
        textView18.text=m3dlfrance.toString()
        textView20.text=m3dlenglish.toString()
        textView22.text=m3dlislamia.toString()
        textView25.text=m3dltj.toString()
        textView28.text=m3dlmath.toString()

        val najh=if (alm3dl>=10){
            "ناجح"
        }else{
            "راسب"
        }
        val mlahda=if (alm3dl<10) {
            "يمكنك العمل أكثر"
        }else if (alm3dl>=10 && alm3dl<=12){
            "مقبول يمكنك العمل أكثر"
        }else if (alm3dl>12 && alm3dl<=15){
            "جيد يمكنك العمل أكثر"
        }else{
            "ممتاز"
        }
        if (alm3dl<10){
            textView14.setBackgroundColor(ContextCompat.getColor(this,R.color.fbutton_color_pomegranate))
        }
        mlahda3anneeflsafa.text="الملاحظة=$mlahda"
        textView14.text= ("المعدل----->$alm3dl----->$najh").toString()
        m3ml3anneeflsafa.text="مجموع المعاملات=$m3mlat"
        m3mlflmwad3anneeflsafa.text="مجموع المعدلات مضروبة في معاملاتها=$m3amlatflmwad"

        if (m3dlamazighia==0.0F){
            textView19.text = "معفى"
        }else{
            textView19.text=m3dlamazighia.toString()}
        if (m3dltchkilia==0.0F){
            textView35.text = "معفى"
        }else{
            textView35.text=m3dltchkilia.toString()
        }

        if (m3dlsport==0.0F){
            textView31.text = "معفى"
        }else{ textView31.text=m3dlsport.toString()}


    }
}

