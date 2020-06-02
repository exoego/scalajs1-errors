import io.lemonlabs.uri.Url

object Foo {
  def main(args: Array[String]): Unit = {
    val params = Map.empty[String,String]
    val withParams = Url.parse("/").addParams(params)
    println(withParams)
  }
}
