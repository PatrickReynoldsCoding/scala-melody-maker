package utils

import org.scalatest.wordspec.AnyWordSpec

class StringTest extends AnyWordSpec {

  "Strings" when {
    "given 4" should {
      "return 5" in {
        assert(utils.Strings.findString(4) == 5)
      }
    }
  }
}
