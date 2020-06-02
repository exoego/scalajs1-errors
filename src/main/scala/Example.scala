import io.lemonlabs.uri.Url

object Foo {
  def main(args: Array[String]): Unit = {
    val params = Map.empty[String,String]
    val queryParams = Url.parse("/").addParams(params.map(v => v._1 -> v._2))
    println(queryParams)
  }
}
