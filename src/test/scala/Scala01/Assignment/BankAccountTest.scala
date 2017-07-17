package Scala01.Assignment

import org.scalatest.FunSuite
import PanConversion._

class BankAccountTest extends FunSuite {

  val bank = new BankAccount("Akshansh", "AZYPJ3462B")

  test("Crediting 1000 rupees")
  {
    val afterCredit = bank credit 1000
    assert(afterCredit.balance === 1000)
  }

  test("Debiting amount less than that present in account")
  {
    val afterCredit = bank credit 2000
    val afterDebit = afterCredit debit 1000
    assert(afterDebit.balance === 1000)
  }

  test("Debiting amount more than that present in account")
  {
    val afterDebit = bank debit 1000
    assert(afterDebit.balance === 0)
  }

  test("Testing static method name")
  {
    assert(BankAccount.name() === "State Bank of Knoldus")
  }

  test("Testing static method number")
  {
    assert(BankAccount.number() === 1123456789L)
  }

  test("Testing static method address")
  {
    assert(BankAccount.address() === "B-62,\nSector-56,\nNoida")
  }

  test("Testing static method details")
  {
    assert(BankAccount.details() === "State Bank of Knoldus\n1123456789\nB-62,\nSector-56,\nNoida")
  }

}
