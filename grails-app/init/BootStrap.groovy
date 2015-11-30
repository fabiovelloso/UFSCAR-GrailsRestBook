
import br.ufscar.grails.rest.Book

class BootStrap {

    def init = { servletContext ->
        new Book(name: "HTML", isbn: "123").save()
        new Book(name: "Java",  isbn: "456").save()
    }
    def destroy = {
    }
}
