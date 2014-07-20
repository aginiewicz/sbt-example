import scala.language.experimental.macros
import scala.reflect.macros.Context

class Impl(val c: Context) {
  import c.universe._

  def hello = c.Expr[Unit](q"""println("Hello World")""")
}

object Macros {
  def hello: Unit = macro Impl.hello
}
