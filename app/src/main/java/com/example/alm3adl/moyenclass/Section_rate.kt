package com.example.alm3adl.moyenclass

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.text.Editable
import android.text.InputFilter
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import com.example.alm3adl.InputFilterMinMax
import com.example.alm3adl.R
import com.example.alm3adl.R.id
import kotlinx.android.synthetic.main.ahsb.view.*
import kotlinx.android.synthetic.main.section_rate.*
import kotlinx.android.synthetic.main.student.view.*
import kotlinx.android.synthetic.main.total.view.*
import java.lang.Exception
import java.math.RoundingMode


class Section_rate : AppCompatActivity() {
    var myadapter: Myadapter? = null
    var arraystudent = ArrayList<Student>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.section_rate)
        val bundle = intent.extras
        val numberofstudent = bundle!!.getInt("namberstudent")

        listview1.itemsCanFocus
        val adapter = Myadapter(arraystudent, this)
        listview1.adapter = adapter

        var i: Int = 1
        for (i in 1..numberofstudent) {

            arraystudent.add(Student("التلميذ $i", ""))
        }

        val d: Int = numberofstudent + 1
        if (d == d) {

            arraystudent.add(Student("ahseb", ""))
        }


    }

    @Suppress("UNREACHABLE_CODE")
    class Myadapter : BaseAdapter {

        var context: Context? = null
        var arraystudentlocale = ArrayList<Student>()

        constructor(arraystudent: ArrayList<Student>, context: Context?) {
            this.context = context
            this.arraystudentlocale = arraystudent
        }

        override fun getCount(): Int {
            return arraystudentlocale.size
        }

        override fun getItem(position: Int): Any {
            return position
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }

        @SuppressLint("ViewHolder", "SetTextI18n")
        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

            val inflater = context!!.getSystemService(LAYOUT_INFLATER_SERVICE) as LayoutInflater
            val student = inflater.inflate(R.layout.student, parent, false)
            val button = inflater.inflate(R.layout.ahsb, parent, false)

            button.buequals.setOnClickListener {
                try {
                    var akbr: Int = 0
                    var totalpoint: Float = 0.0F
                    for (i in 0..arraystudentlocale.size - 2) {

                        var poinI = arraystudentlocale[i]

                        if (poinI.point!!.toString().toFloat() >= 10) {
                            akbr++
                        }
                        totalpoint += poinI.point!!.toString().toFloat()

                    }
                    val moyen = totalpoint / (arraystudentlocale.size - 1)
                    val builder = AlertDialog.Builder(context!!)
                    val total = inflater.inflate(R.layout.total, null)

                    if (moyen >= 10) {
                        total.textViewtotal.setTextColor(
                            ActivityCompat.getColor(
                                context!!,
                                R.color.fbutton_color_emerald
                            )
                        )
                        total.layoutouter.setBackgroundColor(
                            ActivityCompat.getColor(
                                context!!,
                                R.color.fbutton_color_emerald
                            )
                        )
                        total.po.setTextColor(
                            ActivityCompat.getColor(
                                context!!,
                                R.color.fbutton_color_emerald
                            )
                        )
                    } else {
                        total.textViewtotal.setTextColor(
                            ActivityCompat.getColor(
                                context!!,
                                R.color.fbutton_color_pomegranate
                            )
                        )
                        total.layoutouter.setBackgroundColor(
                            ActivityCompat.getColor(
                                context!!,
                                R.color.fbutton_color_pomegranate
                            )
                        )
                        total.po.setTextColor(
                            ActivityCompat.getColor(
                                context!!,
                                R.color.fbutton_color_pomegranate
                            )
                        )
                    }
                    builder.setView(total).show()
                    total.textViewtotal.text =
                        "${moyen.toBigDecimal().setScale(2, RoundingMode.HALF_EVEN)}"
                    total.po.text =
                        "عدد التلاميذ الناجحين $akbr من أصل ${arraystudentlocale.size - 1}"
                } catch (ex: Exception) {
                    Toast.makeText(context, "إملأ جميع النقاط", Toast.LENGTH_LONG).show()
                }
            }
            val stu = arraystudentlocale[position]
            if (stu.name.toString() == "ahseb") {

                return button

            } else {
                student.name.text = stu.name.toString()
                val editText = student.findViewById<View>(id.point) as EditText
                editText.filters = arrayOf<InputFilter>(InputFilterMinMax(0.0F, 20.0F))
                editText.setText(stu.point.toString())
                editText.addTextChangedListener(object : TextWatcher {
                    override fun beforeTextChanged(
                        s: CharSequence?,
                        start: Int,
                        count: Int,
                        after: Int
                    ) {

                    }

                    override fun onTextChanged(
                        s: CharSequence?,
                        start: Int,
                        before: Int,
                        count: Int
                    ) {

                    }

                    override fun afterTextChanged(s: Editable?) {
                        stu.point = editText.text.toString()

                    }

                })

                return student

            }

        }

    }

}
