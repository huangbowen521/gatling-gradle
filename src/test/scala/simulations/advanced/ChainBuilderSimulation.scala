package simulations.advanced

import io.gatling.core.Predef._
import scala.concurrent.duration._

/**
 * Advanced Example using ChaingBuilder for modular setup
 */
class ChainBuilderSimulation extends Simulation {

    val chain = exec(chainbuilder.Actions.getGoogle())
    val advancedExample = scenario("AdvancedExample").exec(chain)

    setUp(advancedExample
      .inject(rampUsers(Integer.getInteger("users", 1)) over 5.seconds)
    )
}