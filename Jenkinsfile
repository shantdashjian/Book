pipeline {
    agent { docker 'maven:3.3.3' }
    stages {
        stage('build') {
            steps {
            		retry(3) {
            			sh 'echo "Hello World"'
            		}
            		
            		timeout(time: 3, unit: 'MINUTES') {
            			sh '''
                    echo "Multiline shell steps works too"
                    ls -lah
                		'''
            		}
                
            }
        }
    }
}