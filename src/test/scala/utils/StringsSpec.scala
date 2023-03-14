package utils

import org.scalatest.funspec.AnyFunSpec

class StringTest extends AnyFunSpec {

  describe("the findString function returns the correct index") {

    it("takes 4, returns 5") {
      assert(utils.Strings.findString(4) == 5)
    }

  }
}
