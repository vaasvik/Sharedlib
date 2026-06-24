def call() {
    stage('Build Stage') {
        sh 'mvn clean package'
    }
}
