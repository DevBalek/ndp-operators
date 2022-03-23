public class FlagHandler {
    Boolean isComment = false;
    void swapFlag(){
        if(isComment==false) isComment=true; else isComment=false;
    }

    Boolean getIsComment() {return isComment;}
}
