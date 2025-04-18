pipeline {
    agent any

    stages {
        stage('Checkout Code') {
            steps {
                git branch: 'main', url: 'https://github.com/kikitha13/PizzaBillGenerator.git'
            }
        }

        stage('Build') {
            steps {
                echo 'Compiling Java files...'
                sh 'mkdir -p build'
                sh 'javac -d build src/oops/*.java'
            }
        }

        stage('Test') {
            steps {
                echo 'Running the application...'
                sh 'java -cp build oops.Main'
            }
        }

        stage('Deploy') {
            steps {
                echo 'Creating JAR file...'
                sh 'jar cfv build/PizzaBillApp.jar -C build .'
                
                echo 'Running the JAR file...'
                sh 'nohup java -jar build/PizzaBillApp.jar > output.log 2>&1 &'
                
                echo 'Deployment complete! Check output.log for details.'
            }
        }
    }
}

