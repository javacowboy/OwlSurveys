package com.javacowboy.owl.survey.data.parser;

public interface DocumentField {
	public String getLabelInDocument();
	public boolean isInTableCell();
	public boolean isEndRowTableCell();
}
