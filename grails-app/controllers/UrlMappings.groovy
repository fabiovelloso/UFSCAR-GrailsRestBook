class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?"{
            constraints {
                // apply constraints here
            }
        }

        "/book"(resources: "book")
        
        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
