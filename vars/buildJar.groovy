#!/user/bin/env groovy
<<<<<<< HEAD

=======
>>>>>>> f2761a5daba08dbb7538b1f5510c6566966bb9e9
def call() {
    echo "building the application for branch $GIT_BRANCH"
    sh 'mvn package'
}