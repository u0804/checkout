package capgemini.checkout

case class Basket(stock: Stock*)

sealed trait Stock {
  val price: BigDecimal
}

case object Apple extends Stock {
  val price = BigDecimal(0.60)
}

case object Orange extends Stock {
  val price = BigDecimal(0.25)
}
