package capgemini.checkout

import org.specs2.mutable.Specification
import Checkout.total

class Step2 extends Specification {
  "Basket" should {
    "Empty basket" in {total(Basket()) mustEqual 0.00}
    "One apple" in {total(Basket(Apple)) mustEqual 0.60 }
    "Two apples" in {total(Basket(Apple, Apple)) mustEqual 0.60}
    "Three apples" in {total(Basket(Apple, Apple, Apple)) mustEqual 0.60*2}
    "Two apples and an orange" in {total(Basket(Apple, Apple, Orange)) mustEqual 0.60+0.25}
    "One orange" in {total(Basket(Orange)) mustEqual 0.25}
    "Two oranges" in {total(Basket(Orange, Orange)) mustEqual 0.25*2}
    "Three oranges" in {total(Basket(Orange, Orange, Orange)) mustEqual 0.25*2}
    "Three oranges and an apple" in {total(Basket(Orange, Orange, Orange, Apple)) mustEqual 0.25*2+0.60}
    "Eight oranges" in {total(Basket(Orange, Orange, Orange, Orange, Orange, Orange, Orange, Orange)) mustEqual 0.25*6}
    "Three apples and three oranges" in {total(Basket(Apple, Apple, Apple, Orange, Orange, Orange)) mustEqual 0.60*2+0.25*2}
  }
}