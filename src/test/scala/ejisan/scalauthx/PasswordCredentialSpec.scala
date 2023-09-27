package luckyslevin.authx

import scala.concurrent._
import scala.concurrent.duration._
import scala.concurrent.ExecutionContext.Implicits.global
import org.specs2.mutable.Specification

class PasswordCredentialSpec extends Specification {
  val factory = HashedCredentialFactory.get
  val timeout = 10.second

  "PasswordCredential" should {
    "supports serialization" in {
      val x = Await.result(factory.generate("test"), timeout)
      val y = HashedCredential.fromString(x.toString)
      (x == y) must beEqualTo (true)
    }
  }
}
