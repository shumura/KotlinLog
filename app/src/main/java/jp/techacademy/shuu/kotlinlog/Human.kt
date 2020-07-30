package jp.techacademy.shuu.kotlinlog

class Human: Animal, Thinkable {

    constructor(name: String, age: Int,hobby: String): super(name, age) {

    }

    override  fun say(){
        Log.d("kotlintest", "私の名前は" + this.name + "です。" + "年は" +this.age + "歳です。")
    }
    ovarride fun think(){
        Log.d("kotlinetst","私は" + this.hobby + "について考える。")
    }
}