package lesson02

import yspec.YSpecSuite

class CyclicRotationSpec extends YSpecSuite {

  "lesson02/CyclicRotation.yaml".run { input: CyclicRotationInput =>
    new CyclicRotation().solution(input.xs, input.k)
  }
}

case class CyclicRotationInput(xs: Array[Int], k: Int)
