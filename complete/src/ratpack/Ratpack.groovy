import static ratpack.groovy.Groovy.ratpack

ratpack {

  handlers {

    get('hello') {
      render "Hello, World!"
    }

    get('hello/:name') {
      render "Hello, " + pathTokens['name'] + "!"
    }

  }

}
