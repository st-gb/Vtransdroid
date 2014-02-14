package vtrans.dynlib.attributes;

import java.util.Vector;

public class TranslationPossibilities
{
  Vector<TranslationPossibility> _translationPossibilities = new 
      Vector<TranslationPossibility>();

  public void add(TranslationPossibility translationPossibility) {
    _translationPossibilities.addElement(translationPossibility);   
  }
  
  public Vector<TranslationPossibility> getVector() {
    return _translationPossibilities;
  }
}