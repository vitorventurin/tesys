package com.tesys.models;

public class BaseShirtCanvas {
	private String code;
		
	public BaseShirtCanvas(String color) {
		if (color == null) color="ffffff";
		this.code = "<?xml version='1.0' encoding='utf-8'?><!DOCTYPE svg PUBLIC '-//W3C//DTD SVG 1.1//EN' 'http://www.w3.org/Graphics/SVG/1.1/DTD/svg11.dtd'><svg version='1.1' id='svg3371' xmlns:dc='http://purl.org/dc/elements/1.1/' xmlns:cc='http://creativecommons.org/ns#' xmlns:rdf='http://www.w3.org/1999/02/22-rdf-syntax-ns#' xmlns:svg='http://www.w3.org/2000/svg' xmlns='http://www.w3.org/2000/svg' xmlns:xlink='http://www.w3.org/1999/xlink' x='0px' y='0px' width='358.807px' height='325.632px' viewBox='0 0 358.807 325.632' enable-background='new 0 0 358.807 325.632' xml:space='preserve'><path id='path3020' fill='#"+color+"' stroke='#000000' d='M464.793,487.897V295.055l38.645,10.879l34.143-60.029 c-38.307-40.251-79.211-62.987-129.437-82.538c-30.166,38.814-71.043,35.721-98.673,0c-53.057,13.139-88.405,48.624-129.438,82.538 l34.142,60.029l38.645-10.879v192.842H464.793z'/></svg>";
	}

	public String getCode() {
		return code;
	}
}