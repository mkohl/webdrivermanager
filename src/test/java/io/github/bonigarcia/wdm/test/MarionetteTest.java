/*
 * (C) Copyright 2016 Boni Garcia (http://bonigarcia.github.io/)
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser General Public License
 * (LGPL) version 2.1 which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl-2.1.html
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 */
package io.github.bonigarcia.wdm.test;

import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.firefox.MarionetteDriver;

import io.github.bonigarcia.wdm.MarionetteDriverManager;
import io.github.bonigarcia.wdm.base.BaseBrowserTst;

/**
 * Test with Marionette browser.
 *
 * @author Boni Garcia (boni.gg@gmail.com)
 * @since 1.4.0
 */
public class MarionetteTest extends BaseBrowserTst {

	@BeforeClass
	public static void setupClass() {
		validOS = false;

		if (validOS) {
			MarionetteDriverManager.getInstance().setup();
		}
	}

	@Before
	public void setupTest() {
		if (validOS) {
			driver = new MarionetteDriver();
		}
	}

}
