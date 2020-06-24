import net.exoego.scalajs.types.util.Factory
import scala.scalajs.js

object Example {
  def main(args: Array[String]): Unit = {
    val config: ConfigObject = ConfigObject(x = 1)
    println(config.x)
    println(config.y)
  }
}

@Factory
trait ConfigObject extends js.Object {
  var x: Int
  var y: js.UndefOr[Int]
}
