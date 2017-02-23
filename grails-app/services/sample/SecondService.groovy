package sample

import grails.transaction.Transactional

@Transactional
class SecondService {

    def klet() {
        "mariette"
    }
}
