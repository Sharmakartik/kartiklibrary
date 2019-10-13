#!/usr/bin/groovy

class Shell implements Serializable {
  def steps
  Shell(steps) {this.steps = steps}

    def mvn(args) {
      def mvnHome = tools 'maven'
      steps.sh "${mvnHome}/bin/mvn -o ${args}"
  }
}
