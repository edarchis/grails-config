package sample

import grails.transaction.Transactional

@Transactional
class OneService {
    def theOtherService

    def getDataFromOtherService() {
        theOtherService.klet()
    }
}
