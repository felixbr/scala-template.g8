import org.scalatest._
import GreetingFormatter._

class GreetingFormatterSpec extends WordSpec with MustMatchers {

  val greeting = "Hello"
  val receiver = "World"

  "The .format function" must {
    "return a well formatted greeting" in {
      format(greeting, receiver) mustEqual "Hello, World!"
    }
  }
}
