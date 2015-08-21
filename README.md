gatling-gradle
==============

Use gradle to run gatling tests

## Config

Global gatling configs can be set in conf/gatling.conf file

Data files for Feeds should be put in data/ dir

## Usage

### Basic
`gradle gatling`

or

`gradle clean gatling`

### Advanced

#### With JavaOpts

If your gatling tests expect JavaOpt arguments

`gradle clean gatling -PjvmArgs="-Dusers=10"`


#### Single Simulation
By default all simulations are run, if you want to only run a single simulation**

`gradle clean gatling -Psim="{simulation}"`

Example: 

`gradle clean gatling -Psim="simulations.basic.BasicWithDataFeedSimulation"`


## Report location

All reports are saved in build/reports/*


## Setup in IDEs

`gradle eclipse`

or

`gradle idea`

