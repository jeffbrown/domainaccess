package demo

class DemoController {

    def index() {
        def util = new SomeUtil()
        def number = util.getNumberOfPeople()

        render "There are $number Person instances"
    }

    def countByName() {
        def util = new SomeUtil()
        def number = util.countByName('Jeff')

        render "There are $number Person instances named Jeff"
    }
}
