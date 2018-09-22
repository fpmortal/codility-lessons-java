package lesson02

import yspec.YSpecSuite

class OddOccurrencesInArraySpec extends YSpecSuite {

  "lesson02/OddOccurrencesInArray.yaml".run { input: Array[Int] =>
    new OddOccurrencesInArray().solution(input)
  }
}
