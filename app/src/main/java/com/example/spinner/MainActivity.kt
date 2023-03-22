package com.example.spinner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity(),AdapterView.OnItemSelectedListener {
    lateinit var txtTitulo: TextView
    lateinit var txtCaracteristicas: TextView
    lateinit var spLenguajes: Spinner

    var lenguajes = arrayOf("JAVA", "KOTLIN", "PHP", "SWIFT", "C#", "C++", "Dart", "JS")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // inicializar
        txtTitulo = findViewById(R.id.tituloventana)
        txtCaracteristicas = findViewById(R.id.caracteristica)
        spLenguajes = findViewById(R.id.spLenguaje)
        // crear adaptador
        val adaptador = ArrayAdapter(this, android.R.layout.simple_spinner_item, lenguajes)
        // como se comportara
        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spLenguajes.adapter = adaptador
        spLenguajes.onItemSelectedListener = this
    }

    override fun onItemSelected(p0: AdapterView<*>?, p1: View?, posicion: Int, p3: Long) {
        val valorSeleccionado = lenguajes[posicion]
        Toast.makeText(this,"seleciono $valorSeleccionado", Toast.LENGTH_SHORT).show()
        when(posicion){
            0 -> {
                txtTitulo.setText("JAVA")
                txtCaracteristicas.setText("lenguaje que utiliza programacion orientada a objetos ")

            }
            1 -> {
                txtTitulo.setText("KOTLIN")
                txtCaracteristicas.setText("Lenguaje exclusivo de androi ")
            }
            2-> {
                txtTitulo.setText("PHP")
                txtCaracteristicas.setText("es un lenguaje de programación de uso general que se utiliza, sobre todo, en el entorno del desarrollo web")
            }
            3->{
                txtTitulo.setText("SWIFT")
                txtCaracteristicas.setText("lenguaje de programación poderoso e intuitivo creado por Apple para desarrollar apps de iOS, Mac, Apple TV y Apple Watch. Está diseñado para brindar a los desarrolladores más libertad que nunca.")
            }
            4->{
                txtTitulo.setText("C#")
                txtCaracteristicas.setText("es un lenguaje de programación moderno, basado en objetos y con seguridad de tipos. C# permite a los desarrolladores crear muchos tipos de aplicaciones seguras y sólidas que se ejecutan en . NET.")
            }
            5->{
                txtTitulo.setText("C++")
                txtCaracteristicas.setText("proporciona bibliotecas estándar altamente optimizadas. Asimismo, permite el acceso a características de hardware de bajo nivel para maximizar la velocidad y minimizar los requisitos de memoria")
        }
            6-> {
               txtTitulo.setText("Dart")
                txtCaracteristicas.setText("es un lenguaje open source desarrollado en Google con el objetivo de permitir a los desarrolladores utilizar un lenguaje orientado a objetos y con análisis estático de tipo.")
    }
            7-> {
                txtTitulo.setText("JS")
                txtCaracteristicas.setText("s un lenguaje de programación que los desarrolladores utilizan para hacer páginas web interactivas. Desde actualizar fuentes de redes sociales a mostrar animaciones y mapas interactivos, las funciones de JavaScript pueden mejorar la experiencia del usuario de un sitio web.")
            }}}
    override fun onNothingSelected(p0: AdapterView<*>?) {

    }
}