package grails.config

class OneController {
    def theService
    def theOtherService

    def index() {
        render status:200, text: theService.getDataFromOtherService()
    }

    def direct() {
        render status:200, text: theOtherService.klet()
    }
}
