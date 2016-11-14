import java.awt.BorderLayout as BL
import javax.swing.WindowConstants as WC
import groovy.swing.SwingBuilder
import javax.swing.ImageIcon

/**
 * Created by hlieu on 11/13/16.
 */

String base = 'https://chart.apis.google.com/chart?'

// this is a groovy map
// key value pairs are separated by colon
// by default, any variable named 'params'
// is a java.util.LinkedHashMap
// single quoted values are java.lang.String objects
def params = [cht:'p3', chs:'250x100', chd:'t:60:40', chl:'Hello|World']

String queryString = params.collect { k,v -> "$k=$v" }.join('&');
//params.each { k,v -> assert queryString.contains("$k=$v") }

String url = base.concat(queryString);
url.toURL().text;

SwingBuilder.edt {
    frame(title: 'Hello, Chart!', pack: true,
    visible: true, defaultCloseOperation: WC.EXIT_ON_CLOSE) {
        label(icon:new ImageIcon("$base$queryString".toURL()),
        constraints:BL.CENTER)
    }
}