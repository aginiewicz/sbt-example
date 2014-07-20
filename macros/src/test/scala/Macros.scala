import org.scalatest._

import Macros._

class ExampleSpec extends FlatSpec with Matchers {
  "Macro" should "be callable" in {
    hello
  }
}
