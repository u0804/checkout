package capgemini.checkout

object Checkout {

  val handlerApple: Basket => BigDecimal =
    basket => Apple.price * ((basket.stock collect { case apple @ Apple => 1 }).sum.toInt/2)

  val handlerOrange: Basket => BigDecimal =
    basket => Orange.price * ((basket.stock collect { case orange @ Orange => 1 }).sum.toInt/3)

  def total(basket: Basket): BigDecimal = {
    val handlers = List(handlerApple, handlerOrange)
//    val deduction = handlers.foldLeft(BigDecimal(0)) {
//      (subtotal, deduct) => subtotal + deduct(basket)
//    }
    val deduction=0
    basket.stock.map(_.price).sum - deduction
  }
}