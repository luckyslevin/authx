package luckyslevin.authx

import scala.collection.SetOps

class HashedCredentialFactorySet(factories: Set[HashedCredentialFactory])
  extends scala.collection.Set[HashedCredentialFactory] {

  override def diff(that: scala.collection.Set[HashedCredentialFactory]): HashedCredentialFactorySet = this.diff(that)

  def contains(key: HashedCredentialFactory): Boolean =
    factories.contains(key)

  def iterator: Iterator[HashedCredentialFactory] =
    factories.iterator

  override def +(elem: HashedCredentialFactory): HashedCredentialFactorySet =
    new HashedCredentialFactorySet(factories + elem)

  override def -(elem: HashedCredentialFactory): HashedCredentialFactorySet =
    new HashedCredentialFactorySet(factories - elem)
}

object HashedCredentialFactorySet {
  val a = new HashedCredentialFactorySet(Set())

  def apply(elems: HashedCredentialFactory*): HashedCredentialFactorySet =
    new HashedCredentialFactorySet(Set(elems:_*))

  def empty: HashedCredentialFactorySet = apply()
}
