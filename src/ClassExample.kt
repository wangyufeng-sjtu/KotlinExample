open class Base{
    //Base后面有无括号决定了它是否有primary constructor
    private var prop = 1
    constructor(){
        println("Base constructor: value is ${this.prop}")
    }
    init{
        println("Base init: value is ${this.prop}")
    }
    fun getProp(): Int{ return this.prop }
    fun setProp(i:Int){ prop=i }
}

class Mybase: Base {
    constructor(i:Int){
        super.setProp(i)
        println("Derive constructor: value is ${super.getProp()}")
    }
    //由于primary constructor为空，所以想加在primary constructor里面的代码可以写在init里
    //init代码块执行顺序早于second constructor
    init{
        println("Derive init: value is ${super.getProp()}")
    }
}

fun main() {
    Mybase(2)
}