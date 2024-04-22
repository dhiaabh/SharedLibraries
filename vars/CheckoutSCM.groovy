// File: vars/GitSCM-Checkout.groovy
// def call() {
//         echo "retrieved!"
// }
// def call(url, depth, branch, gitCredentials) {
def call(String url, String depth, String branch, String username, String password) {
// def call(String url, String depth, String branch) {
        // def credentials = gitCredentials("$gitCredentials")
        // def username = credentials.username
        // def password = credentials.password
        
        def parts = url.split("://", 2)
        def protocol = parts[0] + "://"
        def gitRepository = parts[1]
        
        sh "echo ${protocol}"
        sh "echo ${gitRepository}"
        sh "echo ${depth}"
        sh "echo ${branch}"

        sh "git clone --depth 1 --branch ${branch} ${protocol}${username}:${password}@${gitRepository} ."


}
