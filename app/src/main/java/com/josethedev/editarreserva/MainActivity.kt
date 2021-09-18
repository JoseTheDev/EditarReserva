package com.josethedev.editarreserva

import android.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mAlertDialogBtn =  findViewById<Button>(R.id.act_reserva)
        mAlertDialogBtn.setOnClickListener(){
            val mAlertDialog = AlertDialog.Builder(this@MainActivity)
            //mAlertDialog.setTitle("Pop Up!")
            mAlertDialog.setMessage("Hola Mundo")
            mAlertDialog.setPositiveButton("OK"){dialog, id->
                dialog.dismiss()
            }
            mAlertDialog.show()
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.cerrar, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {
            R.id.accessibility_custom_action_0 -> {
                finish();
                true;
            }
            else -> {
                super.onOptionsItemSelected(item)
            }
        }


    }
