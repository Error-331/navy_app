databaseChangeLog = {
    changeSet(author: "Sergei (generated)", id: "1588476208251-2") {
        createTable(tableName: "phone_codes") {
            column(autoIncrement: "true", name: "id", type: "BIGINT") {
                constraints(primaryKey: "true", primaryKeyName: "phone_codesPK")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }
        }
    }
}