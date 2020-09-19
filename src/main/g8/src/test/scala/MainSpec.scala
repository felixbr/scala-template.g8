import org.scalatest._
import org.scalatest.wordspec.AnyWordSpec
import org.scalatest.matchers.must

class MainSpec extends AnyWordSpec with must.Matchers {

  "1 + 1" must {
    "equal 2" in {
      (1 + 1) mustBe 2
    }
  }
}
