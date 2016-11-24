package com.ugur.yeter.setterBased.depinj;

public class TextEditorSetter {

	private SpellCheckerSetter spellChecker;

	// a setter method to inject the dependency.
	public void setSpellChecker(SpellCheckerSetter spellChecker) {
		System.out.println("Inside setSpellChecker.");
		this.spellChecker = spellChecker;
	}

	// a getter method to return spellChecker
	public SpellCheckerSetter getSpellChecker() {
	
	return spellChecker;
	}

	public void spellCheck() {	
	spellChecker.checkSpelling();
	}

}
