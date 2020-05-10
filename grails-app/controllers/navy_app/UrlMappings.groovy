package navy_app

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        get "/country/$id"(controller: "country", action: "index")
        post "/country"(controller: "country", action: "save")
        put "/country"(controller: "country", action: "update")
        delete "/country/$id"(controller: "country", action: "delete")

        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
