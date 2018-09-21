package lesson01

import yspec.YSpecSuite

class BinaryGapSpec extends YSpecSuite {

  "lesson01/BinaryGap.yaml".run { input: Int =>
    new BinaryGap().solution(input)
  }
}
