package example

@main def main() =
  val person = Person()
  person.setName("test")  // Should be generated by Lombok
  println(person.getName())
