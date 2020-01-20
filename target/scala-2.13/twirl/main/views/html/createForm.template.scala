
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

object createForm extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[Computer],Seq[scala.Tuple2[String, String]],MessagesRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(computerForm: Form[Computer], companies: Seq[(String, String)])(implicit requestHeader: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import views.html.helper._


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main/*5.6*/ {_display_(Seq[Any](format.raw/*5.8*/("""
    
    """),format.raw/*7.5*/("""<h1>Add a computer</h1>
    
    """),_display_(/*9.6*/form(routes.HomeController.save())/*9.40*/ {_display_(Seq[Any](format.raw/*9.42*/("""
        
        """),format.raw/*11.9*/("""<fieldset>
            """),_display_(/*12.14*/CSRF/*12.18*/.formField),format.raw/*12.28*/("""
            """),_display_(/*13.14*/inputText(computerForm("name"), Symbol("_label") -> "Computer name", Symbol("_help") -> "")),format.raw/*13.105*/("""
            """),_display_(/*14.14*/inputText(computerForm("introduced"), Symbol("_label") -> "Introduced date", Symbol("_help") -> "")),format.raw/*14.113*/("""
            """),_display_(/*15.14*/inputText(computerForm("discontinued"), Symbol("_label") -> "Discontinued date", Symbol("_help") -> "")),format.raw/*15.117*/("""

            """),_display_(/*17.14*/select(
                computerForm("company"), 
                companies, 
                Symbol("_label") -> "Company", Symbol("_default") -> "-- Choose a company --",
                Symbol("_showConstraints") -> false
            )),format.raw/*22.14*/("""
        """),format.raw/*23.9*/("""</fieldset>

        <p>Dates are in yyyy-MM-dd format</p>
        
        <div class="actions">
            <input type="submit" value="Create this computer" class="btn primary"> or 
            <a href=""""),_display_(/*29.23*/routes/*29.29*/.HomeController.list()),format.raw/*29.51*/("""" class="btn">Cancel</a>
        </div>
        
    """)))}),format.raw/*32.6*/("""
    
""")))}),format.raw/*34.2*/("""
"""))
      }
    }
  }

  def render(computerForm:Form[Computer],companies:Seq[scala.Tuple2[String, String]],requestHeader:MessagesRequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(computerForm,companies)(requestHeader)

  def f:((Form[Computer],Seq[scala.Tuple2[String, String]]) => (MessagesRequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (computerForm,companies) => (requestHeader) => apply(computerForm,companies)(requestHeader)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-01-20T22:00:19.650822
                  SOURCE: /Users/Sujata/IdeaProjects/AnormScalaInMemorySample/app/views/createForm.scala.html
                  HASH: f629e8b48202200ab9709a3b93b8e838e774b2fc
                  MATRIX: 798->1|982->115|1037->113|1064->142|1091->144|1102->148|1140->150|1176->160|1235->194|1277->228|1316->230|1361->248|1412->272|1425->276|1456->286|1497->300|1610->391|1651->405|1772->504|1813->518|1938->621|1980->636|2239->874|2275->883|2509->1090|2524->1096|2567->1118|2651->1172|2688->1179
                  LINES: 21->1|24->3|27->2|28->4|29->5|29->5|29->5|31->7|33->9|33->9|33->9|35->11|36->12|36->12|36->12|37->13|37->13|38->14|38->14|39->15|39->15|41->17|46->22|47->23|53->29|53->29|53->29|56->32|58->34
                  -- GENERATED --
              */
          