#!/usr/bin/groovy

class Shell implements Serializable {
  def steps
  Shell(steps) {this.steps = steps}

    def mvn(args) {
    steps.sh "${steps.tool 'maven'}\tools\hudson.tasks.Maven_MavenInstallation\maven\bin -o ${args}"
  }
}
