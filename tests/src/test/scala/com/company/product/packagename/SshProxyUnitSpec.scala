package com.company.product.packagename

import java.util.concurrent.TimeUnit._
import java.util.concurrent.{TimeoutException, TimeUnit}
import java.io.{BufferedReader, File}

import scala.concurrent.duration.{Duration, TimeUnit}
import scala.language.reflectiveCalls
import scala.concurrent.{Await, Future, Promise}
import scala.util.{Failure, Success}
import scala.collection.immutable.{Set, Map, List}
import scala.collection.mutable.ListBuffer

import org.apache.commons.io.FileUtils
import com.typesafe.config.ConfigFactory
import org.slf4j.LoggerFactory
import org.scalatest._

import akka.testkit._
import akka.actor._
import akka.pattern.ask
import akka.cluster.Cluster
import akka.actor.SupervisorStrategy.{Escalate, Resume}
import akka.dispatch.MessageDispatcher
import akka.util.Timeout
import akka.camel
import akka.camel.CamelExtension

@Ignore
@DoNotDiscover
class SomeTest extends TestKit(ActorSystem("test"))
      with ImplicitSender
      with FlatSpecLike
      with Matchers
      with BeforeAndAfterAll {

  "A test" should "pass" in {
    true should be (true)
  }
}
