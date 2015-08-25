package simulations.advanced.chainbuilder

import io.gatling.core.Predef._
import io.gatling.core.structure.ChainBuilder
import io.gatling.http.Predef._


/**
 * Actions for ChainBuilder Examples
 */
object Actions {

    def getGoogle(): ChainBuilder = {
        group("ChainBuilderExample") {
            exec(
                http("My favorite search engine via Chainbuilder")
                  .get("http://www.google.com")
            )
        }
    }

}
