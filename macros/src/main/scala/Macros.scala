import scala.language.experimental.macros
import scala.reflect.macros.Context

class Impl(val c: Context) {
  import c.universe._

  def poly[T: c.WeakTypeTag] = c.literal(c.weakTypeOf[T].toString)

  def hello = c.Expr[Unit](q"""println("Hello World")""")
}

object Macros {
  def poly[T] = macro Impl.poly[T]

  def hello: Unit = macro Impl.hello
}
