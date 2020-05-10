package navy_app

import grails.gorm.transactions.*

class CountryController {

    static scope = "singleton"
    static defaultAction = "index"

    static responseFormats = ['json']

    def index(Long id) {
        respond Country.findById(id)
    }

    def save() {
        params.dateAdd = new Date();
        params.dateModified = new Date();

        def country = new Country(params)
        country.save()

        respond country
    }

    @Transactional
    def update() {
        def country = Country.findById(params.id)

        country.name = params.name
        country.alpha2Code = params.alpha2Code
        country.dateModified = new Date()

        country.save(flush: true)

        respond country
    }

    @Transactional
    def delete(Long id) {
        def country = Country.findById(id)
        country.delete(flush: true)

        respond country
    }
}
