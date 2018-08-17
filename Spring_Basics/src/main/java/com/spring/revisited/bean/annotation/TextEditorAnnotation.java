/**
 * -----------------------------------------------------------------------
 *     Copyright  2010 ShepHertz Technologies Pvt Ltd. All rights reserved.
 * -----------------------------------------------------------------------
 */
package com.spring.revisited.bean.annotation;

import com.spring.revisited.bean.xml.SpellChecker;

/**
 * @author Vishnu Garg
 * @created On Aug 4, 2018
 *
 */
public class TextEditorAnnotation {
	// Use this while by property Autowiring
	// @Autowired
	private SpellChecker spellChecker;
	private String name;

	// Constructor Based DI
	// @Autowired
	public TextEditorAnnotation(SpellChecker spellChecker) {
		System.out.println("Inside TextEditor constructor.");
		this.spellChecker = spellChecker;
	}

	// @Autowired setter Autowiring DI
	public void setSpellChecker(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}

	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void spellCheck() {
		spellChecker.checkSpelling();
	}
}
