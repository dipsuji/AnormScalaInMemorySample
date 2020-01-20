// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/Sujata/IdeaProjects/AnormScalaInMemorySample/conf/routes
// @DATE:Mon Jan 20 22:00:19 JST 2020


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
