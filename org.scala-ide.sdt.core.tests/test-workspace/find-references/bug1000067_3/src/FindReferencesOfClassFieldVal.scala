class Referred {
  var aVar = 0
  val aVal/*ref*/ = 0
  def aMethod = 2
}

class Referring {
  val obj = new Referred

  def anotherMethod: Unit = {
    obj.aVar
    obj.aVal
    obj.aMethod
  }

  def yetAnotherMethod: Unit = {
    obj.aVar
    obj.aVal
    obj.aMethod
  }
}
