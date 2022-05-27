package com.example.appipnotics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var btnAddTask:Button
    lateinit var etTask: EditText
    lateinit var rvTasks:RecyclerView

    lateinit var adapter:TaskAdapter


    var tasks = mutableListOf<String>()





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initUi()
    }

    private fun initUi() {
        initView()
        initListeners()
        initRecyclerView()
    }

    private fun initRecyclerView() {
        rvTasks.layoutManager = LinearLayoutManager(this)
        adapter = TaskAdapter(tasks)
        rvTasks.adapter = adapter

    }

    private fun initListeners() {
        btnAddTask.setOnClickListener{ addTask() }
    }

    private fun addTask() {
        val taskToAdd = etTask.text.toString()
        tasks.add(taskToAdd)
        adapter.notifyDataSetChanged()
    }


    private fun initView() {
        btnAddTask = findViewById(R.id.btnAddTask)
        etTask = findViewById(R.id.etTask)
        rvTasks = findViewById(R.id.etTask)

    }

    //fun test(name:String = "desconocido"){
        //val list = listOf("val1", "val2")
       // val list2 = mutableListOf("val1","val2")
          //  list2.add("hola")
       // example = name

   // }
    //{ return "Hola $name"
        //val nombre = true
        //val example:String = "Hola"
        //var example2:String = "Hola"
    //}
}



//Funcion 1
//fun test(name:String = "desconocido"):
//{ return "Hola $name"
//val nombre = true
//val example:String = "Hola"
//var example2:String = "Hola"
//}

//Funcio de arriba pero resumido KOTLIN
// fun test(name:String = "desconocido") = "Hola $name"








//Funcion 1
//class MainActivity : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//        test("Hola")
//    }
//
//    fun test(saludo:String = "hola"){
//        //val nombre = true
//        //val example:String = "Hola"
//        //var example2:String = "Hola"
//    }
//}




//Funcion2
//class MainActivity : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//        test("Aris")
//    }
//
//    fun test(name:String = "desconocido"):String{
//        return "Hola $name"
//        //val nombre = true
//        //val example:String = "Hola"
//        //var example2:String = "Hola"
//    }
//}
