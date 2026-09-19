package oop_164021_AziAprianto.Week04

class Developer(name: String, baseSalary: Int, val progammingLanguage: String) : Employee(name, baseSalary){
    override fun work(){
        println("$name sedang ngoding menggunakan $progammingLanguage")
    }
}