/** *
* @author Muhammed Furkan Balek | G191210069 | muhammed.balek@ogr.sakarya.edu.tr | github.com/DevBalek 
* @since March 2022
* <p>
	* Yorum silme için yardımcı class
* </p> */

public class FlagHandler {
    Boolean isComment = false;
    void swapFlag(){
        if(isComment==false) isComment=true; else isComment=false;
    }

    Boolean getIsComment() {return isComment;}
}
