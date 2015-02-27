package com.src.main.scala

/**
 * Author: temon
 * Date: 27/02/15
 * Time: 16:16
 *
 */

import opennlp.tools.sentdetect.{SentenceModel, SentenceDetectorME}
import java.io._

object languageKind {
    val EN = "en"
    val ID = "id"
}

object OpenNlp {

    def sentenceDetector(sentence:String, language:String):Option[Array[String]] = {

        val train = "src/main/resources/" + language + "-sent.bin"

        val inputStream = new FileInputStream(train)

        try {
            val model = new SentenceModel(inputStream)
            val sentenceDetector = new SentenceDetectorME(model)
            Some(sentenceDetector.sentDetect(sentence))
        } catch {
            case e: Exception => {
                println("exception caught: " + e)
                None
            }
        } finally {
            inputStream.close()
        }

    }

}
