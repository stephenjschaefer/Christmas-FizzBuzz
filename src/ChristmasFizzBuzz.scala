/**
  * Created by Steve on 12/25/15.
  * Scala FizzBuzz Solution With A Christmas Twist
  */
object ChristmasFizzBuzz extends App {
  val list = List.range(1,101).foreach(i => println(if ((i%5==0)&&(i%3==0)) "Merry Christmas" else if((i%5==0)&&(i%3!=0)) "Christmas" else if((i%5!=0)&&(i%3==0)) "Merry" else i))
}
