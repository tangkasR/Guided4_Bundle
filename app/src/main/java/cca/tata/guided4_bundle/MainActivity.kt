package cca.tata.guided4_bundle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    private lateinit var nama: TextInputEditText
    private lateinit var nim: TextInputEditText
    private lateinit var fakultas: TextInputEditText
    private lateinit var prodi: TextInputEditText
    private lateinit var btnRegister: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nama = findViewById(R.id.etNama)
        nim = findViewById(R.id.etNIM)
        fakultas = findViewById(R.id.etFakultas)
        prodi = findViewById(R.id.etProgramStudi)
        btnRegister = findViewById(R.id.etRegister)

        btnRegister.setOnClickListener {
            val intent = Intent(this, NextActivity::class.java)
            val mBundle = Bundle()

            mBundle.putString("nama", nama.text.toString())
            mBundle.putString("nim", nim.text.toString())
            mBundle.putString("fakultas", fakultas.text.toString())
            mBundle.putString("prodi", prodi.text.toString())
            intent.putExtra("register", mBundle)

            startActivity(intent)
        }
    }
}