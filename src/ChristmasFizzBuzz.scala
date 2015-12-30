/**
  * Created by Steve on 12/25/15.
  * Scala FizzBuzz Solution With A Christmas Twist
  */
object ChristmasFizzBuzz extends App {
  for (i <- 1 to 100) println(Seq(15->"Merry Christmas",5->"Christmas",3->"Merry").find(i%_._1==0).map(_._2).getOrElse(i))
}
