# Prerequisites
*  Git Client
*  JDK 1.8
*  Gradle
*  docker 


# SamppleSonarQubeProject

*  Start SonarQube Instance on remote|local|Container

*  Clone Project Locally using : git clone https://github.com/rajendrapenumalli/SampleSonarQubeProject.git

*  cd SampleSonarQubeProject directory



#### If Sonarqube Server Running Locally  

* Run Gradle Command:        gradle clean build check test jacocoTestReport sonarqube --info

#### If Sonarqube Server Running On remore (example: http://192.168.20.111:9000 )

* Run Gradle Command        gradle clean build check test sonarqube -Dsonar.host.url=http://192.168.20.111:9000 --stacktrace

* Run Gradle Command:        gradle clean build check test sonarqube -Dsonar.host.url=http://localhost:9000 --stacktrace
