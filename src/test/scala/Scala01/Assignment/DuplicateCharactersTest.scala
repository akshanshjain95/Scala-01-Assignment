package Scala01.Assignment

/**
  * Created by knoldus on 15/7/17.
  */
import org.scalatest.FunSuite

class DuplicateCharactersTest extends org.scalatest.FunSuite {

  val passString = new DuplicateCharacters

  test("Passing string with duplicates in between")
  {
    assert(passString.stringFilter("abcaabcccd") === "aacc")
  }

  test("Passing string with duplicates in the start")
  {
    assert(passString.stringFilter("aabcaabcccd") === "aaaacc")
  }

  test("Passing string with no duplicates")
  {
    assert(passString.stringFilter("abcdefgh") === "")
  }

  test("Passing empty string")
  {
    assert(passString.stringFilter("") === "")
  }
}
