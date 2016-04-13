package com.justdavis.karl.kayak;

import org.apache.wicket.request.mapper.parameter.PageParameters;

import com.justdavis.karl.usgs.water.InstantValuesClient;
import com.justdavis.karl.usgs.water.SiteNumber;

import org.apache.wicket.markup.html.basic.Label;

import java.util.Random;

import org.apache.wicket.markup.html.WebPage;

public class HomePage extends WebPage {
	private static final long serialVersionUID = 1L;

	public HomePage(final PageParameters parameters) {
		super(parameters);

		Random rng = new Random();
		InstantValuesClient instantValuesClient = new InstantValuesClient();
		String waterTemperature = instantValuesClient
				.getMostRecentWaterTemperature(SiteNumber.PATUXENT_BRIGHTON_DAM_BELOW);

		add(new Label("answer", new String[] { "Yes!", "Nope." }[rng.nextInt(2)]));
		add(new Label("temperatureValue", waterTemperature));
	}
}
