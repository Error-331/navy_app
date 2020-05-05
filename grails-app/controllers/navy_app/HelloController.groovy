package navy_app

class HelloController {

    static scope = "singleton"

    def index() {
        def newCountry = new Country(
                name: "Ukraine",
                alpha2Code: "ua",
                dateAdd: new Date(),
                dateModified: new Date()
        )
        newCountry.save()

        //render "Hello World!"
        println request.properties
        render request
    }
}
