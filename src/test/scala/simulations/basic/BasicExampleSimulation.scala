package simulations.basic

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._


class BasicExampleSimulation extends Simulation {

  val scn = scenario("My Simple Scenario")
    .exec(http("My favorite search engine")
    .get("http://www.google.com"))

    setUp(scn
      .inject(rampUsers(1) over 1.seconds)
    )
}
