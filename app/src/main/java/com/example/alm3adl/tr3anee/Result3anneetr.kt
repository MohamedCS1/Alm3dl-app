package com.example.alm3adl.tr3anee

import android.annotation.SuppressLint
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
import kotlinx.android.synthetic.main.resulet1eranneesentfic.textView34
import kotlinx.android.synthetic.main.resulet1eranneesentfic.textView40
import kotlinx.android.synthetic.main.result3anneetr.*

class Result3anneetr : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.result3anneetr)

        val bundle=intent.extras
        val alm3dl =bundle!!.getDouble("alm3dl")
        val m3dlarab=bundle.getDouble("m3dlarab")
        val m3dlfrance=bundle.getDouble("m3dlfrance")
        val m3dlislamia=bundle.getDouble("m3dlislamia")
        val m3dlenglish=bundle.getDouble("m3dlenglish")
        val m3dltj=bundle.getDouble("m3dltj")
        val m3dlmath=bundle.getDouble("m3dlmath")
        val m3dlfizik=bundle.getDouble("m3dlfizik")
        val m3dlsport=bundle.getDouble("m3dlsport")
        val m3dlamazighia=bundle.getDouble("m3dlamazighia")
        val m3dltchnlojia=bundle.getDouble("m3dltchnlojia")
        val m3dlflsafa=bundle.getDouble("m3dlflsafa")
        val m3amlatflmwad=bundle.getDouble("m3amlatflmwad")
        val m3mlat=bundle.getDouble("m3amlat")
        val ttm=bundle.getDouble("ttm")
        textviewttm3anneetr.text=ttm.toString()

        textView193.text=m3dlflsafa.toString()
        textView17.text=m3dlarab.toString()
        textView18.text=m3dlfrance.toString()
        textView20.text=m3dlenglish.toString()
        textView22.text=m3dlislamia.toString()
        textView25.text=m3dltj.toString()
        textView28.text=m3dlmath.toString()
        textView34.text=m3dlfizik.toString()
        textView40.text=m3dltchnlojia.toString()
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
        mlahda3anneetr.text="الملاحظة=$mlahda"
        textView14.text= ("المعدل----->$alm3dl----->$najh").toString()
        m3ml3anneetr.text="مجموع المعاملات=$m3mlat"
        m3mlflmwad3anneetr.text="مجموع المعدلات مضروبة في معاملاتها=$m3amlatflmwad"
        if (m3dlamazighia==0.0){
            textView19.text = "معفى"
        }else{
            textView19.text=m3dlamazighia.toString()}

        if (m3dlsport==0.0){
            textView31.text = "معفى"
        }else{ textView31.text=m3dlsport.toString()}

    }
    }
