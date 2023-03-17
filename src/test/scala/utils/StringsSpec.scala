package utils

import org.scalatest.wordspec.AnyWordSpec

class StringTest extends AnyWordSpec {

  "Strings" when {
    "given a note" should {
      "return 5 when given 4" in {
        assert(utils.Strings.findString(4) == 5)
      }
      "return 4 when given 5" in {
        assert(utils.Strings.findString(5) == 4)
      }
      "return 4 when given 6" in {
        assert(utils.Strings.findString(6) == 4)
      }
      "return 3 when given 10" in {
        assert(utils.Strings.findString(10) == 3)
      }
      "return 3 when given 11" in {
        assert(utils.Strings.findString(11) == 3)
      }
    }
  }
}
