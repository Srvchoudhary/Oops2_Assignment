class person(val name: String, val age: Int) extends Ordered {
  def check(p: person) {

    if(this.name.equals(p.name)) {
        println(this.age.<(p.age))
      }
    else{
      println(this.name.length.<(p.name.length))
    }
  }
}

