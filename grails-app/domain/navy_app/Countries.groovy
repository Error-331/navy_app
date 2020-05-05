package navy_app

class Country {
    String name
    String alpha2Code
    Date dateAdd
    Date dateModified

    static constraints = {
        name unique: true
        alpha2Code unique: true

        name nullable: false
        alpha2Code nullable: false
        dateAdd nullable: false
        dateModified nullable: false
    }

    static mapping = {
        table 'countries'

        id column: 'id'

        id sqlType: 'BIGINT'
        name sqlType: 'char(30)'
        alpha2Code sqlType: 'char(2)'

        dateAdd sqlType: 'DATETIME'
        dateModified sqlType: 'DATETIME'
    }
}
