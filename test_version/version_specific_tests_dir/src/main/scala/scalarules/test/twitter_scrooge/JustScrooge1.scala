package scalarules.test.twitter_scrooge

import scalarules.test.twitter_scrooge.thrift.Struct1
import scalarules.test.twitter_scrooge.thrift.thrift2.Struct2A
import scalarules.test.twitter_scrooge.thrift.thrift2.Struct2B
import scalarules.test.twitter_scrooge.thrift.thrift2.thrift3.Struct3

object JustScrooge1 {
  val classes = Seq(classOf[Struct1], classOf[Struct2A], classOf[Struct2B], classOf[Struct3])

  def main(args: Array[String]) {
    print(s"classes ${classes.mkString(",")}")
  }
}
