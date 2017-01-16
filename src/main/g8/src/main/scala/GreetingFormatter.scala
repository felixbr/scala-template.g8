object GreetingFormatter {

  def format(greeting: String, receiver: String): String = {
    s"\$greeting, \$receiver!"
  }

}
