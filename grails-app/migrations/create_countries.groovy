databaseChangeLog = {
    changeSet(author: "Sergei (generated)", id: "1588549838879-1") {
        createTable(tableName: "countries") {
            column(autoIncrement: "true", name: "id", type: "BIGINT") {
                constraints(primaryKey: "true", primaryKeyName: "countriesPK")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "name", type: "CHAR(30)") {
                constraints(nullable: "false")
            }

            column(name: "date_add", type: "datetime") {
                constraints(nullable: "false")
            }

            column(name: "alpha2code", type: "CHAR(2)") {
                constraints(nullable: "false")
            }

            column(name: "date_modified", type: "datetime") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "Sergei (generated)", id: "1588549838879-3") {
        addUniqueConstraint(columnNames: "alpha2code", constraintName: "UC_COUNTRIESALPHA2CODE_COL", tableName: "countries")
    }

    changeSet(author: "Sergei (generated)", id: "1588549838879-4") {
        addUniqueConstraint(columnNames: "name", constraintName: "UC_COUNTRIESNAME_COL", tableName: "countries")
    }
}