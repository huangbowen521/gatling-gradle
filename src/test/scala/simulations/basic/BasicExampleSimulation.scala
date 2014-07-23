package simulations.basic

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import io.gatling.http.Headers.Names._
import scala.concurrent.duration._
import bootstrap._
import assertions._

class BasicExampleSimulation extends Simulation {

  val scn = scenario("My Simple Scenario")
    .exec(http("My favorite search engine")
    .get("http://www.google.com"))


  setUp(scn.inject(ramp(3 users) over (10 seconds)))
}
