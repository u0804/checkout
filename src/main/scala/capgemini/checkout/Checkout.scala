package capgemini.checkout

object Checkout {
  def total(basket: Basket): BigDecimal = {basket.stock.map(_.price).sum}
}