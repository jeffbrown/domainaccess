package demo

class DemoController {

    def index() {
        def util = new SomeUtil()
        def number = util.getNumberOfPeople()

        render "There are $number Person instances"
    }
}
