package com.example.alm3adl

import android.content.Intent
import android.os.*
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import androidx.appcompat.app.AlertDialog
import com.example.alm3adl.Gestion2anee.hsabm3dl2aneeGestion
import com.example.alm3adl.Gestion3anee.hsabm3dl3aneegestion
import com.example.alm3adl.bac.*
import com.example.alm3adl.flsafa2anee.hsabm3dl2aneeflsafa
import com.example.alm3adl.flsafa3anee.hsabm3dl3aneeflsafa
import com.example.alm3adl.literary.hsabm3dl1anneeliterary
import com.example.alm3adl.long2anee.hsabm3dl2aneelong
import com.example.alm3adl.long3anee.hsabm3dl3aneelong
import com.example.alm3adl.math2anee.hsabm3dl2anneemath
import com.example.alm3adl.math3anee.hsabm3dl3aneemath
import com.example.alm3adl.moyenclass.slider
import com.example.alm3adl.sentfic.hsabm3dl1anneesentfic
import com.example.alm3adl.sentfic2anee.hsabm3dl2aneesentfic
import com.example.alm3adl.sntfic3anee.hsabm3dl3aneesentfic
import com.example.alm3adl.tr2annee.hsabm3dl2anneeTR
import com.example.alm3adl.tr3anee.hsabm3dl3aneetr
import com.ramotion.fluidslider.FluidSlider
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.start1anee.view.*
import kotlinx.android.synthetic.main.start1anee.view.layout1anneeliterary
import kotlinx.android.synthetic.main.start2anee.view.*
import kotlinx.android.synthetic.main.start3anee.view.*
import kotlinx.android.synthetic.main.startbac.view.*


open class home : AppCompatActivity() {

    var x:AlertDialog? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)


        val progressdialog = AlertDialog.Builder(this)

        val view1:View = View.inflate(this,R.layout.progressdialog,null)

         x = progressdialog.setView(view1).create()

         x!!.window!!.setBackgroundDrawableResource(android.R.color.transparent)
 

        button1.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            val view: View = View.inflate(this,R.layout.start1anee, null)
            builder.setView(view).show()

            view.layout1anneesentfic.setOnClickListener {
                
                x!!.show()
                val intent = Intent(this, hsabm3dl1anneesentfic::class.java)
                startActivity(intent)

            }

            view.layout1anneeliterary.setOnClickListener {

                x!!.show()
                val intent = Intent(this, hsabm3dl1anneeliterary::class.java)
                startActivity(intent)

            }

        }


        button2.setOnClickListener {

            val builder = AlertDialog.Builder(this)
            
            val view: View = View.inflate(this,R.layout.start2anee, null)
            builder.setView(view).show()
            view.layout2anneemath.setOnClickListener {

                x!!.show()
                val intent = Intent(this, hsabm3dl2anneemath::class.java)
                startActivity(intent)

            }
            view.layout2anneesentfic.setOnClickListener {

                x!!.show()
                val intent = Intent(this, hsabm3dl2aneesentfic::class.java)
                startActivity(intent)

            }
            view.layout2aneegestion.setOnClickListener {

                x!!.show()
                val intent = Intent(this, hsabm3dl2aneeGestion::class.java)
                startActivity(intent)

            }
            view.layout2aneetr.setOnClickListener {

                x!!.show()
                val intent = Intent(this, hsabm3dl2anneeTR::class.java)
                startActivity(intent)

            }
            view.layout2aneelong.setOnClickListener {

                x!!.show()
                val intent = Intent(this, hsabm3dl2aneelong::class.java)
                startActivity(intent)

            }
            view.layout2aneeflsafa.setOnClickListener {

                x!!.show()
                val intent = Intent(this, hsabm3dl2aneeflsafa::class.java)
                    startActivity(intent)

            }

        }
        button3.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            
            val view: View = View.inflate(this,R.layout.start3anee, null)
            builder.setView(view).show()

            view.layout3aneemath.setOnClickListener {

                x!!.show()
                val intent = Intent(this, hsabm3dl3aneemath::class.java)
                startActivity(intent)

            }
            view.layout3anneesentfic.setOnClickListener {

                x!!.show()
                val intent = Intent(this, hsabm3dl3aneesentfic::class.java)
                startActivity(intent)

            }
            view.layout3aneegestion.setOnClickListener {

                x!!.show()
                val intent = Intent(this, hsabm3dl3aneegestion::class.java)
                startActivity(intent)

            }
            view.layout3aneetr.setOnClickListener {

                x!!.show()
                val intent = Intent(this, hsabm3dl3aneetr::class.java)
                startActivity(intent)

            }
            view.layout3aneelong.setOnClickListener {

                x!!.show()
                val intent = Intent(this, hsabm3dl3aneelong::class.java)
                startActivity(intent)

            }


            view.layout3aneeflsafa.setOnClickListener {

                x!!.show()
                val intent = Intent(this@home, hsabm3dl3aneeflsafa::class.java)
                startActivity(intent)

            }
        }

   button4.setOnClickListener {

            val builder=AlertDialog.Builder(this)
            val view:View=View.inflate(this,R.layout.startbac,null)
            builder.setView(view).show()

            view.mathbac.setOnClickListener {

                x!!.show()
                val intent=Intent(this,mathbac::class.java)
                startActivity(intent)

            }
            view.sentficbac.setOnClickListener {

                x!!.show()
                val intent=Intent(this,sentficbac::class.java)
                startActivity(intent)

            }
            view.gestionbac.setOnClickListener {

                x!!.show()
                val intent=Intent(this,gestionbac::class.java)
                startActivity(intent)

            }
            view.trbac.setOnClickListener {

                x!!.show()
                val intent=Intent(this,trbac::class.java)
                startActivity(intent)

            }
       view.longbac.setOnClickListener {

           x!!.show()
           val intent=Intent(this,longbac::class.java)
           startActivity(intent)

       }
       view.flsafabac.setOnClickListener {

           x!!.show()
           val intent=Intent(this,flsafabac::class.java)
           startActivity(intent)
        
       }
     
        }

    button5.setOnClickListener {
       val intent=Intent(this,slider::class.java)
        startActivity(intent)
    }
}

    override fun onResume() {
        x!!.cancel()
        super.onResume()
    }

}



