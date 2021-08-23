package com.example.alm3adl.long2anee

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.example.alm3adl.R
import kotlinx.android.synthetic.main.resulet1eranneesentfic.textView14
import kotlinx.android.synthetic.main.resulet1eranneesentfic.textView17
import kotlinx.android.synthetic.main.resulet1eranneesentfic.textView18
import kotlinx.android.synthetic.main.resulet1eranneesentfic.textView19
import kotlinx.android.synthetic.main.resulet1eranneesentfic.textView20
import kotlinx.android.synthetic.main.resulet1eranneesentfic.textView22
import kotlinx.android.synthetic.main.resulet1eranneesentfic.textView25
import kotlinx.android.synthetic.main.resulet1eranneesentfic.textView28
import kotlinx.android.synthetic.main.resulet1eranneesentfic.textView31
import kotlinx.android.synthetic.main.resulet1eranneesentfic.textView32
import kotlinx.android.synthetic.main.resulet1eranneesentfic.textView35
import kotlinx.android.synthetic.main.resulet2aneelong.*

class Resulet2aneelong : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.resulet2aneelong)
        val bundle=intent.extras
        val alm3dl =bundle!!.getFloat("alm3dl")
        val m3dlarab=bundle.getFloat("m3dlarab")
        val m3dlfrance=bundle.getFloat("m3dlfrance")
        val m3dlislamia=bundle.getFloat("m3dlislamia")
        val m3dlenglish=bundle.getFloat("m3dlenglish")
        val m3dltj=bundle.getFloat("m3dltj")
        val m3dlmath=bundle.getFloat("m3dlmath")
        val m3dl3long=bundle.getFloat("m3dl3long")
        val m3dlsport=bundle.getFloat("m3dlsport")
        val m3dltchkilia=bundle.getFloat("m3dltchkilia")
        val m3dlamazighia=bundle.getFloat("m3dlamazighia")
        var m3amlatflmwad=bundle.getFloat("m3amlatflmwad")
        val m3mlat=bundle.getFloat("m3amlat")
        val ttm=bundle.getFloat("ttm")
        textviewttm2anneelong.text=ttm.toString()

        textView17.text=m3dlarab.toString()
        textView18.text=m3dlfrance.toString()
        textView20.text=m3dlenglish.toString()
        textView22.text=m3dlislamia.toString()
        textView25.text=m3dltj.toString()
        textView28.text=m3dlmath.toString()
        textView32.text=m3dl3long.toString()

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
        mlahda2anneelong.text="الملاحظة=$mlahda"
        textView14.text= ("المعدل----->$alm3dl----->$najh").toString()
        m3ml2anneelong.text="مجموع المعاملات=$m3mlat"
        m3mlflmwad2anneelong.text="مجموع المعدلات مضروبة في معاملاتها=$m3amlatflmwad"

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
