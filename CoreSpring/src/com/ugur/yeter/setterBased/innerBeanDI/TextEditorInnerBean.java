package com.ugur.yeter.setterBased.innerBeanDI;

public class TextEditorInnerBean {
	 private SpellChechkerInnerBean spellChecker;

	   // a setter method to inject the dependency.
	   public void setSpellChecker(SpellChechkerInnerBean spellChecker) {
	      System.out.println("Inside setSpellChecker." );
	      this.spellChecker = spellChecker;
	   }
	   
	   // a getter method to return spellChecker
	   public SpellChechkerInnerBean getSpellChecker() {
	      return spellChecker;
	   }

	   public void spellCheck() {
	      spellChecker.checkSpelling();
	   }
}
