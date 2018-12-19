
package mp3.player;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.mp3.LyricsHandler;
import org.apache.tika.parser.mp3.Mp3Parser;
import org.apache.tika.sax.BodyContentHandler;

import org.xml.sax.SAXException;

public class Mp3Parse {

   public static void main(final String[] args) throws Exception, IOException, SAXException, TikaException {

      //detecting the file type
      BodyContentHandler handler = new BodyContentHandler();
      Metadata metadata = new Metadata();
      FileInputStream inputstream = new FileInputStream(new File("example.mp3"));
      ParseContext pcontext = new ParseContext();
      
      //Mp3 parser
      Mp3Parser  Mp3Parser = new  Mp3Parser();
      Mp3Parser.parse(inputstream, handler, metadata, pcontext);
      LyricsHandler lyrics = new LyricsHandler(inputstream,handler);
      
      while(lyrics.hasLyrics()) {
    	  System.out.println(lyrics.toString());
      }
      
      System.out.println("Contents of the document:" + handler.toString());
      System.out.println("Metadata of the document:");
      String[] metadataNames = metadata.names();
      for(String name : metadataNames) {		        
    	  System.out.println(name + ": " + metadata.get(name));   
      }
int i=0;
      for(String name1 : metadataNames)
      {
          i++;
          if(i==15)
          {
          System.out.println(metadata.get(name1));
          double a = Double.parseDouble(metadata.get(name1));       
          System.out.println(Math.round(((a*0.001)/60)*100.0)/100.0);
          }
      }
      
   }
}
