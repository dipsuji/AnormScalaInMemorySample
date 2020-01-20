
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

object list extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[Page[scala.Tuple2[Computer, Option[Company]]],Int,String,MessagesRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(currentPage: Page[(Computer, Option[Company])], currentOrderBy: Int, currentFilter: String)(implicit request: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._

def /*18.2*/header/*18.8*/(orderBy: Int, title: String):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*18.41*/("""
    """),format.raw/*19.5*/("""<th class="col"""),_display_(/*19.20*/orderBy),format.raw/*19.27*/(""" """),format.raw/*19.28*/("""header """),_display_(/*19.36*/if(scala.math.abs(currentOrderBy) == orderBy)/*19.81*/ {_display_(Seq[Any](format.raw/*19.83*/(""" """),_display_(/*19.85*/{if(currentOrderBy < 0) "headerSortDown" else "headerSortUp"}),format.raw/*19.146*/(""" """)))}),format.raw/*19.148*/("""">
        <a href=""""),_display_(/*20.19*/link(0, Some(orderBy))),format.raw/*20.41*/("""">"""),_display_(/*20.44*/title),format.raw/*20.49*/("""</a>
    </th>
""")))};def /*8.2*/link/*8.6*/(newPage: Int, newOrderBy: Option[Int] = None) = {{
    routes.HomeController.list(newPage, newOrderBy.map { orderBy =>
        if(orderBy == scala.math.abs(currentOrderBy)) -currentOrderBy else orderBy
    }.getOrElse(currentOrderBy), currentFilter)

}};
Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.1*/("""
"""),format.raw/*7.42*/("""
"""),format.raw/*13.2*/("""

"""),format.raw/*17.37*/("""
"""),format.raw/*22.2*/("""

"""),_display_(/*24.2*/main/*24.6*/ {_display_(Seq[Any](format.raw/*24.8*/("""

    """),format.raw/*26.5*/("""<h1 id="section-title">"""),_display_(/*26.29*/Messages("computers.list.title", currentPage.total)),format.raw/*26.80*/("""</h1>

    """),_display_(/*28.6*/request/*28.13*/.flash.get("success").map/*28.38*/ { message =>_display_(Seq[Any](format.raw/*28.51*/("""
        """),format.raw/*29.9*/("""<div class="alert-message warning">
            <strong>Done!</strong> """),_display_(/*30.37*/message),format.raw/*30.44*/("""
        """),format.raw/*31.9*/("""</div>
    """)))}),format.raw/*32.6*/("""

    """),format.raw/*34.5*/("""<div id="actions">

        """),_display_(/*36.10*/form(action=routes.HomeController.list())/*36.51*/ {_display_(Seq[Any](format.raw/*36.53*/("""
            """),format.raw/*37.13*/("""<input type="search" id="searchbox" name="f" value=""""),_display_(/*37.66*/currentFilter),format.raw/*37.79*/("""" placeholder="Filter by computer name...">
            <input type="submit" id="searchsubmit" value="Filter by name" class="btn primary">
        """)))}),format.raw/*39.10*/("""

        """),format.raw/*41.9*/("""<a class="btn success" id="add" href=""""),_display_(/*41.48*/routes/*41.54*/.HomeController.create()),format.raw/*41.78*/("""">Add a new computer</a>

    </div>

    """),_display_(/*45.6*/Option(currentPage.items)/*45.31*/.filterNot(_.isEmpty).map/*45.56*/ { computers =>_display_(Seq[Any](format.raw/*45.71*/("""

        """),format.raw/*47.9*/("""<table class="computers zebra-striped">
            <thead>
                <tr>
                    """),_display_(/*50.22*/header(2, "Computer name")),format.raw/*50.48*/("""
                    """),_display_(/*51.22*/header(3, "Introduced")),format.raw/*51.45*/("""
                    """),_display_(/*52.22*/header(4, "Discontinued")),format.raw/*52.47*/("""
                    """),_display_(/*53.22*/header(5, "Company")),format.raw/*53.42*/("""
                """),format.raw/*54.17*/("""</tr>
            </thead>
            <tbody>

                """),_display_(/*58.18*/computers/*58.27*/.map/*58.31*/ {/*59.21*/case (computer, company) =>/*59.48*/ {_display_(Seq[Any](format.raw/*59.50*/("""
                        """),format.raw/*60.25*/("""<tr>
                            <td><a href=""""),_display_(/*61.43*/routes/*61.49*/.HomeController.edit(computer.id.get)),format.raw/*61.86*/("""">"""),_display_(/*61.89*/computer/*61.97*/.name),format.raw/*61.102*/("""</a></td>
                            <td>
                                """),_display_(/*63.34*/computer/*63.42*/.introduced.map(_.format("dd MMM yyyy")).getOrElse/*63.92*/ {_display_(Seq[Any](format.raw/*63.94*/(""" """),format.raw/*63.95*/("""<em>-</em> """)))}),format.raw/*63.107*/("""
                            """),format.raw/*64.29*/("""</td>
                            <td>
                                """),_display_(/*66.34*/computer/*66.42*/.discontinued.map(_.format("dd MMM yyyy")).getOrElse/*66.94*/ {_display_(Seq[Any](format.raw/*66.96*/(""" """),format.raw/*66.97*/("""<em>-</em> """)))}),format.raw/*66.109*/("""
                            """),format.raw/*67.29*/("""</td>
                            <td>
                                """),_display_(/*69.34*/company/*69.41*/.map(_.name).getOrElse/*69.63*/ {_display_(Seq[Any](format.raw/*69.65*/(""" """),format.raw/*69.66*/("""<em>-</em> """)))}),format.raw/*69.78*/("""
                            """),format.raw/*70.29*/("""</td>
                        </tr>
                    """)))}}),format.raw/*73.18*/("""

            """),format.raw/*75.13*/("""</tbody>
        </table>

        <div id="pagination" class="pagination">
            <ul>
                """),_display_(/*80.18*/currentPage/*80.29*/.prev.map/*80.38*/ { page =>_display_(Seq[Any](format.raw/*80.48*/("""
                    """),format.raw/*81.21*/("""<li class="prev">
                        <a href=""""),_display_(/*82.35*/link(page)),format.raw/*82.45*/("""">&larr; Previous</a>
                    </li>
                """)))}/*84.18*/.getOrElse/*84.28*/ {_display_(Seq[Any](format.raw/*84.30*/("""
                    """),format.raw/*85.21*/("""<li class="prev disabled">
                        <a>&larr; Previous</a>
                    </li>
                """)))}),format.raw/*88.18*/("""
                """),format.raw/*89.17*/("""<li class="current">
                    <a>Displaying """),_display_(/*90.36*/(currentPage.offset + 1)),format.raw/*90.60*/(""" """),format.raw/*90.61*/("""to """),_display_(/*90.65*/(currentPage.offset + computers.size)),format.raw/*90.102*/(""" """),format.raw/*90.103*/("""of """),_display_(/*90.107*/currentPage/*90.118*/.total),format.raw/*90.124*/("""</a>
                </li>
                """),_display_(/*92.18*/currentPage/*92.29*/.next.map/*92.38*/ { page =>_display_(Seq[Any](format.raw/*92.48*/("""
                    """),format.raw/*93.21*/("""<li class="next">
                        <a href=""""),_display_(/*94.35*/link(page)),format.raw/*94.45*/("""">Next &rarr;</a>
                    </li>
                """)))}/*96.18*/.getOrElse/*96.28*/ {_display_(Seq[Any](format.raw/*96.30*/("""
                    """),format.raw/*97.21*/("""<li class="next disabled">
                        <a>Next &rarr;</a>
                    </li>
                """)))}),format.raw/*100.18*/("""
            """),format.raw/*101.13*/("""</ul>
        </div>

    """)))}/*104.6*/.getOrElse/*104.16*/ {_display_(Seq[Any](format.raw/*104.18*/("""

        """),format.raw/*106.9*/("""<div class="well">
            <em>Nothing to display</em>
        </div>

    """)))}),format.raw/*110.6*/("""


""")))}),format.raw/*113.2*/("""

"""))
      }
    }
  }

  def render(currentPage:Page[scala.Tuple2[Computer, Option[Company]]],currentOrderBy:Int,currentFilter:String,request:MessagesRequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(currentPage,currentOrderBy,currentFilter)(request)

  def f:((Page[scala.Tuple2[Computer, Option[Company]]],Int,String) => (MessagesRequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (currentPage,currentOrderBy,currentFilter) => (request) => apply(currentPage,currentOrderBy,currentFilter)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-01-20T22:00:19.681223
                  SOURCE: /Users/Sujata/IdeaProjects/AnormScalaInMemorySample/app/views/list.scala.html
                  HASH: baeb5bba039e2e6ae79cb69bf45efe2c53040411
                  MATRIX: 800->1|1006->137|1035->650|1049->656|1159->689|1191->694|1233->709|1261->716|1290->717|1325->725|1379->770|1419->772|1448->774|1531->835|1565->837|1613->858|1656->880|1686->883|1712->888|1750->281|1761->285|2043->135|2070->153|2098->279|2126->538|2156->648|2184->904|2213->907|2225->911|2264->913|2297->919|2348->943|2420->994|2458->1006|2474->1013|2508->1038|2559->1051|2595->1060|2694->1132|2722->1139|2758->1148|2800->1160|2833->1166|2889->1195|2939->1236|2979->1238|3020->1251|3100->1304|3134->1317|3313->1465|3350->1475|3416->1514|3431->1520|3476->1544|3545->1587|3579->1612|3613->1637|3666->1652|3703->1662|3832->1764|3879->1790|3928->1812|3972->1835|4021->1857|4067->1882|4116->1904|4157->1924|4202->1941|4294->2006|4312->2015|4325->2019|4336->2042|4372->2069|4412->2071|4465->2096|4539->2143|4554->2149|4612->2186|4642->2189|4659->2197|4686->2202|4789->2278|4806->2286|4865->2336|4905->2338|4934->2339|4978->2351|5035->2380|5134->2452|5151->2460|5212->2512|5252->2514|5281->2515|5325->2527|5382->2556|5481->2628|5497->2635|5528->2657|5568->2659|5597->2660|5640->2672|5697->2701|5786->2776|5828->2790|5965->2900|5985->2911|6003->2920|6051->2930|6100->2951|6179->3003|6210->3013|6294->3078|6313->3088|6353->3090|6402->3111|6550->3228|6595->3245|6678->3301|6723->3325|6752->3326|6783->3330|6842->3367|6872->3368|6904->3372|6925->3383|6953->3389|7024->3433|7044->3444|7062->3453|7110->3463|7159->3484|7238->3536|7269->3546|7349->3607|7368->3617|7408->3619|7457->3640|7602->3753|7644->3766|7690->3793|7710->3803|7751->3805|7789->3815|7900->3895|7935->3899
                  LINES: 21->1|24->3|26->18|26->18|28->18|29->19|29->19|29->19|29->19|29->19|29->19|29->19|29->19|29->19|29->19|30->20|30->20|30->20|30->20|32->8|32->8|38->2|39->4|40->7|41->13|43->17|44->22|46->24|46->24|46->24|48->26|48->26|48->26|50->28|50->28|50->28|50->28|51->29|52->30|52->30|53->31|54->32|56->34|58->36|58->36|58->36|59->37|59->37|59->37|61->39|63->41|63->41|63->41|63->41|67->45|67->45|67->45|67->45|69->47|72->50|72->50|73->51|73->51|74->52|74->52|75->53|75->53|76->54|80->58|80->58|80->58|80->59|80->59|80->59|81->60|82->61|82->61|82->61|82->61|82->61|82->61|84->63|84->63|84->63|84->63|84->63|84->63|85->64|87->66|87->66|87->66|87->66|87->66|87->66|88->67|90->69|90->69|90->69|90->69|90->69|90->69|91->70|93->73|95->75|100->80|100->80|100->80|100->80|101->81|102->82|102->82|104->84|104->84|104->84|105->85|108->88|109->89|110->90|110->90|110->90|110->90|110->90|110->90|110->90|110->90|110->90|112->92|112->92|112->92|112->92|113->93|114->94|114->94|116->96|116->96|116->96|117->97|120->100|121->101|124->104|124->104|124->104|126->106|130->110|133->113
                  -- GENERATED --
              */
          