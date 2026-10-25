   #!/usr/bin/env groovy

   def call() {
       echo "building the application jar..."
       sh 'mvn package'
   }