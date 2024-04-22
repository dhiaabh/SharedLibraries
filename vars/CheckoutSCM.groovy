// File: vars/CheckoutSCM.groovy
def call(String url, String depth, String branch, String username, String password) {
        def parts = url.split("://", 2)
        def protocol = parts[0] + "://"
        def gitRepository = parts[1]
        
        sh "echo ${protocol}"
        sh "echo ${gitRepository}"
        sh "echo ${depth}"
        sh "echo ${branch}"

        sh "git clone --depth 1 --branch ${branch} ${protocol}${username}:${password}@${gitRepository}"

        echo " ####################################################"
}
