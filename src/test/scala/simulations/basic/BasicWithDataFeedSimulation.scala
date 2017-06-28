
package simulations.basic

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._





class BasicWithDataFeedSimulation extends Simulation {

    val scn = scenario("My Simple Scenario")
      .feed(csv("queries.csv").circular)
      .exec(http("My favorite search engine")
      .get("https://www.google.com/")
      .queryParam("q", "${query}")
      )

    setUp(scn
      .inject(rampUsers(Integer.getInteger("users", 1)) over 5.seconds)
    )
}

