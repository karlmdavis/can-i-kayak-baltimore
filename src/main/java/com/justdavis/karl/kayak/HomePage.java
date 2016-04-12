package com.justdavis.karl.kayak;

import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.markup.html.basic.Label;

import java.util.Random;

import org.apache.wicket.markup.html.WebPage;

public class HomePage extends WebPage {
	private static final long serialVersionUID = 1L;

	public HomePage(final PageParameters parameters) {
		super(parameters);

		Random rng = new Random();
		add(new Label("answer", new String[] { "Yes!", "Nope." }[rng.nextInt(2)]));
		add(new Label("temperatureValue", "" + rng.nextInt(200)));
	}
}
