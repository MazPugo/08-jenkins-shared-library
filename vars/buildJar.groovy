def call() {
    echo "building the application jar..."
    sh 'mvn package'
}
