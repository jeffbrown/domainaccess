class BootStrap {

    def init = { servletContext ->
        ['Jeff', 'Graeme'].each { new demo.Person(name: it).save() }
    }
    def destroy = {
    }
}
