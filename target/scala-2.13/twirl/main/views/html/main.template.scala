
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Html,MessagesRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(content: Html)(implicit request: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html>
    <head>
        <title>Computers database</title>
        
        """),format.raw/*14.47*/("""
        """),format.raw/*15.9*/("""<link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(/*15.70*/routes/*15.76*/.Assets.at("stylesheets/bootstrap.min.css")),format.raw/*15.119*/("""">
        
        <link rel="stylesheet" media="screen" href=""""),_display_(/*17.54*/routes/*17.60*/.Assets.at("stylesheets/main.css")),format.raw/*17.94*/(""""/> 
        
        
    </head>
    <body>
        
        <header class="topbar">
            <h1 class="fill" id="header-title">
                <a href=""""),_display_(/*25.27*/routes/*25.33*/.HomeController.index()),format.raw/*25.56*/("""">
                    Play sample application &mdash; Computer database
                </a>
            </h1>
        </header>
        
        <section id="main">
            """),_display_(/*32.14*/content),format.raw/*32.21*/("""
        """),format.raw/*33.9*/("""</section>
        
    </body>
</html>
"""))
      }
    }
  }

  def render(content:Html,request:MessagesRequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(content)(request)

  def f:((Html) => (MessagesRequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (content) => (request) => apply(content)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-01-20T22:00:19.623578
                  SOURCE: /Users/Sujata/IdeaProjects/AnormScalaInMemorySample/app/views/main.scala.html
                  HASH: 9b98ea743449fe86d31c122149cb28662c98eb54
                  MATRIX: 748->1|898->58|925->59|1046->651|1082->660|1170->721|1185->727|1250->770|1342->835|1357->841|1412->875|1600->1036|1615->1042|1659->1065|1866->1245|1894->1252|1930->1261
                  LINES: 21->1|26->2|27->3|32->14|33->15|33->15|33->15|33->15|35->17|35->17|35->17|43->25|43->25|43->25|50->32|50->32|51->33
                  -- GENERATED --
              */
          