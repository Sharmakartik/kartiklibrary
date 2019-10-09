#!/usr/bin/groovy

class Shell implements Serializable {
  def steps
  Shell(steps) {this.steps = steps}

    def mvn(args) {
    steps.sh "${steps.tool 'maven'}C:/Users/Karti/.jenkins/tools/hudson.tasks.Maven_MavenInstallation/maven/bin/mvn -o ${args}"
  }
}
