package com.aim.aplicacionhabla

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import com.aim.aplicacionhabla.databinding.ActivityMainBinding
import com.robotemi.sdk.Robot
//import com.robotemi.sdk.Robot
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.*

class MainActivity : AppCompatActivity(), SearchView.OnQueryTextListener,AdapterView.OnItemSelectedListener {
    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: DogAdapter
    private val dogImages = mutableListOf<String>()
    private var robot: Robot?= null
    private var spinner:Spinner?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.serchDV.setOnQueryTextListener(this)
        initRecyclerView()
        robot = Robot.getInstance()
        spinner = findViewById(R.id.spinner)
        val adaptador = ArrayAdapter(this,android.R.layout.simple_spinner_item,GetUbicaciones()!!)
        spinner?.adapter = adaptador
    }
    private fun GetUbicaciones(): List<String> {
        val lista = mutableListOf<String>()
        if(robot != null)
            lista.add(0,"Selecciona un valor")
        lista.add((robot?.locations as MutableList<String>?).toString())
        return lista
    }

    private fun initRecyclerView() {
        adapter = DogAdapter(dogImages)
        binding.rvDogs.layoutManager = LinearLayoutManager(this)
        binding.rvDogs.adapter = adapter
    }

    private fun getRetrofit():Retrofit{
        return Retrofit.Builder()
            .baseUrl("https://dog.ceo/api/breed/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    private fun serchByName(query:String){
        CoroutineScope(Dispatchers.IO).launch {
            val call = getRetrofit().create(APIService::class.java).getDogsByBreeds("$query/images")
            val puppies = call.body()
            runOnUiThread {
                if(call.isSuccessful){
                val imagenes : List<String> = puppies?.images?: emptyList()
                    dogImages.clear()
                    dogImages.addAll(imagenes)
                    adapter.notifyDataSetChanged()
                }else{
                showError()
                }
            }
        }
    }

    private fun showError() {
        Toast.makeText(this,"Ha ocurrido un error",Toast.LENGTH_SHORT).show()
    }

    override fun onQueryTextSubmit(query: String?): Boolean {
        if(!query.isNullOrEmpty()){
            serchByName(query.lowercase(Locale.getDefault()))
        }
        return true
    }

    override fun onQueryTextChange(newText: String?): Boolean {
        return true
    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        val Ubicacion: String = GetUbicaciones()[position]
        Toast.makeText(this,"Posicion elegida:"+Ubicacion,Toast.LENGTH_LONG).show()
        if(robot != null)
            robot?.goTo(Ubicacion)
    }

    override fun onNothingSelected(parent: AdapterView<*>?) {
        TODO("Not yet implemented")
    }
}