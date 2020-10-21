package com.xulf.collection
import org.junit.Test

class ListTest {
  @Test
  def testTake():Unit = {
    val list = List(1, 2, 3, 4)
    println(list.take(3))
  }
}
