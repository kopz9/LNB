package com.example.lnb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.widget.Toolbar
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.lnb.databinding.ActivityMainBinding
import com.example.lnb.databinding.BottomSheetLayoutBinding
import com.google.android.material.bottomsheet.BottomSheetDialog



class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding


    private val viewModel : MainViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen().apply {
            setVisible(viewModel.isLoading.value)
        }
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        setSupportActionBar(binding.toolbar)






    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.menu_bottom -> {
                val bottomSheetDialog = BottomSheetDialog(this, R.style.BottomSheetDialog)
                val view = layoutInflater.inflate(R.layout.bottom_sheet_layout, null)
                bottomSheetDialog.setContentView(view)
                bottomSheetDialog.show()
                
                true
            }
            R.id.menu_search -> {
                true
            }
            else -> super.onOptionsItemSelected(item)

//    para criar a 2 bottomsheetdialog -> vai precisar mover esse else de cima pra baixo
        //        R.id.layoutCadastro -> {
//                val bottomSheetDialog2 = BottomSheetDialog(this, R.style.BottomSheetDialog2)
//                val view2 = layoutInflater.inflate(R.layout.bottom_sheet_layout, null)
            //    bottomSheetDialog.setContentView(view)
            //    bottomSheetDialog.show()

//              true
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }


}



