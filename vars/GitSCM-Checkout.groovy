// File: vars/GitSCM-Checkout.groovy

def call(url, depth, branch, gitCredentials) {
        def credentials = gitCredentials("$gitCredentials")
        def username = credentials.username
        def password = credentials.password
        
        def parts = url.split("://", 2)
        def protocol = parts[0] + "://"
        def gitRepository = parts[1]
        
        sh "git clone --depth 1 --branch ${branch} ${protocol}${username}:${password}@${gitRepository} ."
}
