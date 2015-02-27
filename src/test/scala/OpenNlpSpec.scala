

/**
 * Author: temon
 * Date: 27/02/15
 * Time: 15:57
 *
 */

import com.src.main.scala.languageKind
import org.specs2.mutable._
import com.src.main.scala.OpenNlp._

class OpenNlpSpec extends Specification {

    "OpenNlp use test :" should {
        "Sentece Detector" in {

            /**
             * testing with 3 sentence
             */
            val text =
                """
                  |Indonesian Foreign Minister Marty Natalegawa and his Malaysian counterpart Dato' Sri Anifah Aman arrived at the Le Meridien Hotel on Monday at 12:30 p.m. local time for the 16th Indonesia-Malaysia joint commission meeting.
                  | The meeting highlights issues of sea border, the Aug. 13 arrests of Indonesian civil servants and Malaysian fishermen in Indonesian waters and Indonesian migrant workers, according to the hosting minister.
                  | "We'll discuss [among others] the Aug. 13 incident and try to fix it so, that any similar incidents will not repeat in the future," Anifah told visiting and local reporters after escorting Marty into the hotel.
                """.stripMargin

            // first sentence
            val expected = "Indonesian Foreign Minister Marty Natalegawa and his Malaysian counterpart Dato' Sri Anifah Aman arrived at the Le Meridien Hotel on Monday at 12:30 p.m. local time for the 16th Indonesia-Malaysia joint commission meeting."

            val sentence = sentenceDetector(text, languageKind.EN)
            val count = sentence.map(_.length).getOrElse(0)
            val firstSentence = sentence.map(_.head).getOrElse("")

            (firstSentence must beEqualTo(expected)) and (count must beEqualTo(3))
        }
        "Tokenization" in {
            "Hello world" must have size(11)
        }
        "Name Finder" in {
            "Hello world" must have size(11)
        }
        "Document Categorizer" in {
            "Hello world" must have size(11)
        }
        "POS Tagger" in {
            "Hello world" must have size(11)
        }
        "Chunker" in {
            "Hello world" must have size(11)
        }
        "Parser" in {
            "Hello world" must have size(11)
        }
    }

}
