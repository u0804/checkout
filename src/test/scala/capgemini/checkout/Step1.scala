package capgemini.checkout

import org.specs2.mutable.Specification
import Checkout.total

class Step1 extends Specification {
  "Basket" should {
    "Empty basket" in {total(Basket()) mustEqual 0.00}
    "One apple" in {total(Basket(Apple)) mustEqual 0.60 }
    "Two apples" in {total(Basket(Apple, Apple)) mustEqual 0.60*2}
    "One orange" in {total(Basket(Orange)) mustEqual 0.25}
    "Two oranges" in {total(Basket(Orange, Orange)) mustEqual 0.25*2}
    "Two apples and an orange" in {total(Basket(Apple, Apple, Orange)) mustEqual 0.60*2+0.25}
  }
}