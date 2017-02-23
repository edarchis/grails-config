import sample.AlternateSecondService
import sample.OneService

// Place your Spring DSL code here
beans = {
    theService(OneService)
    theOtherService(AlternateSecondService)
}
