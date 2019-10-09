#!/usr/bin/groovy

class Shell implements Serializable {
  def steps
  Shell(steps) {this.steps = steps}

    def mvn(args) {
    steps.sh "${steps.tool 'maven'}\hudson.tasks.Maven_MavenInstallation\maven\bin\mvn -o ${args}"
  }
}
