package oop_164021_AziAprianto.week02

import com.sun.org.apache.xml.internal.security.keys.keyresolver.KeyResolver.length

class Student (val name: String, val nim: String, var major: String) {
    init {
      if (nim.length != 5){
          println("WARNING: Objek tercipta dengan NIM ($nim) yang tidak valid!")
          println("Data mahasiswa $name mungkin akan bermaslah di sistem.")
        } else {
            println("LOG: Objek Student $name berhasil dialokasikan di Memory.")
        }
    }
    constructor(name: String, nim: String) : this(name, nim, major = "Non-Matriculated"){
        println("LOG: Menggunakan constructor jalur umum (Tanpa Jurusan).")
    }
}