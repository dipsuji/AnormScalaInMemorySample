
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

object editForm extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[Long,Form[Computer],Seq[scala.Tuple2[String, String]],MessagesRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id: Long, computerForm: Form[Computer], companies : Seq[(String, String)])(implicit requestHeader: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import views.html.helper._


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main/*5.6*/ {_display_(Seq[Any](format.raw/*5.8*/("""
    
    """),format.raw/*7.5*/("""<h1>Edit computer</h1>
    
    """),_display_(/*9.6*/form(routes.HomeController.update(id))/*9.44*/ {_display_(Seq[Any](format.raw/*9.46*/("""
        
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
            <input type="submit" value="Save this computer" class="btn primary"> or 
            <a href=""""),_display_(/*28.23*/routes/*28.29*/.HomeController.list()),format.raw/*28.51*/("""" class="btn">Cancel</a>
        </div>
        
    """)))}),format.raw/*31.6*/("""
    
    """),_display_(/*33.6*/form(routes.HomeController.delete(id), Symbol("class") -> "topRight")/*33.75*/ {_display_(Seq[Any](format.raw/*33.77*/("""
        """),_display_(/*34.10*/CSRF/*34.14*/.formField),format.raw/*34.24*/("""
        """),format.raw/*35.9*/("""<input type="submit" value="Delete this computer" class="btn danger">
    """)))}),format.raw/*36.6*/("""
    
""")))}),format.raw/*38.2*/("""
"""))
      }
    }
  }

  def render(id:Long,computerForm:Form[Computer],companies:Seq[scala.Tuple2[String, String]],requestHeader:MessagesRequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(id,computerForm,companies)(requestHeader)

  def f:((Long,Form[Computer],Seq[scala.Tuple2[String, String]]) => (MessagesRequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (id,computerForm,companies) => (requestHeader) => apply(id,computerForm,companies)(requestHeader)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-01-20T22:00:19.688555
                  SOURCE: /Users/Sujata/IdeaProjects/AnormScalaInMemorySample/app/views/editForm.scala.html
                  HASH: 633ae6044ef7cedd1b8165fb4edc07cd58749fae
                  MATRIX: 801->1|996->126|1051->124|1078->153|1105->155|1116->159|1154->161|1190->171|1248->204|1294->242|1333->244|1378->262|1429->286|1442->290|1473->300|1514->314|1627->405|1668->419|1789->518|1830->532|1955->635|2009->662|2268->900|2304->909|2527->1105|2542->1111|2585->1133|2669->1187|2706->1198|2784->1267|2824->1269|2861->1279|2874->1283|2905->1293|2941->1302|3046->1377|3083->1384
                  LINES: 21->1|24->3|27->2|28->4|29->5|29->5|29->5|31->7|33->9|33->9|33->9|35->11|36->12|36->12|36->12|37->13|37->13|38->14|38->14|39->15|39->15|41->17|46->22|47->23|52->28|52->28|52->28|55->31|57->33|57->33|57->33|58->34|58->34|58->34|59->35|60->36|62->38
                  -- GENERATED --
              */
          