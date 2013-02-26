/*
 * This file is part of DropletRules.
 *
 * Copyright (c) 2013 Spout LLC <http://www.spout.org/>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies
 * of the Software, and to permit persons to whom the Software is furnished to do
 * so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package org.spout.droplet.rules.configuration;

import org.spout.api.exception.ConfigurationException;
import org.spout.api.util.config.yaml.YamlConfiguration;

import org.spout.droplet.rules.DropletRules;

public class DropletConfiguration extends YamlConfiguration {
	public static void loadConfig() {
		try {
			DropletRules.getConfig().load();
			DropletRules.getConfig().setPathSeparator(".");
			if (DropletRules.config.getNode("rules.onPlayerJoin.enabled").getValue() != null) {
				if (!DropletRules.getConfig().getNode("rules").isAttached()) {
					setConfig();
				}
			}
		} catch (ConfigurationException e) {
			e.printStackTrace();
		}
	}

	public static void setConfig() throws ConfigurationException{
		try {
			DropletRules.getConfig().getNode("Rules.page1.1").setValue("This is the Default rules");
			DropletRules.getConfig().getNode("Rules.page1.2").setValue("This is the Default rules");
			DropletRules.getConfig().getNode("Rules.page1.3").setValue("This is the Default rules");
			DropletRules.getConfig().getNode("Rules.page1.4").setValue("This is the Default rules");
			DropletRules.getConfig().getNode("Rules.page1.5").setValue("This is the Default rules");
			DropletRules.getConfig().getNode("Rules.page2.1").setValue("This is the Default rules");
			DropletRules.getConfig().getNode("Rules.page2.2").setValue("This is the Default rules");
			DropletRules.getConfig().getNode("Rules.page2.3").setValue("This is the Default rules");
			DropletRules.getConfig().getNode("Rules.page2.4").setValue("This is the Default rules");
			DropletRules.getConfig().getNode("Rules.page2.5").setValue("This is the Default rules");
			DropletRules.getConfig().getNode("Rules.page3.1").setValue("This is the Default rules");
			DropletRules.getConfig().getNode("Rules.page3.2").setValue("This is the Default rules");
			DropletRules.getConfig().getNode("Rules.page3.3").setValue("This is the Default rules");
			DropletRules.getConfig().getNode("Rules.page3.4").setValue("This is the Default rules");
			DropletRules.getConfig().getNode("Rules.page3.5").setValue("This is the Default rules");
			DropletRules.getConfig().getNode("Rules.page4.1").setValue("This is the Default rules");
			DropletRules.getConfig().getNode("Rules.page4.2").setValue("This is the Default rules");
			DropletRules.getConfig().getNode("Rules.page4.3").setValue("This is the Default rules");
			DropletRules.getConfig().getNode("Rules.page4.4").setValue("This is the Default rules");
			DropletRules.getConfig().getNode("Rules.page4.5").setValue("This is the Default rules");
			DropletRules.getConfig().getNode("Rules.page5.1").setValue("This is the Default rules");
			DropletRules.getConfig().getNode("Rules.page5.2").setValue("This is the Default rules");
			DropletRules.getConfig().getNode("Rules.page5.3").setValue("This is the Default rules");
			DropletRules.getConfig().getNode("Rules.page5.4").setValue("This is the Default rules");
			DropletRules.getConfig().getNode("Rules.page5.5").setValue("This is the Default rules");
			DropletRules.getConfig().getNode("Rules.page6.1").setValue("This is the Default rules");
			DropletRules.getConfig().getNode("Rules.page6.2").setValue("This is the Default rules");
			DropletRules.getConfig().getNode("Rules.page6.3").setValue("This is the Default rules");
			DropletRules.getConfig().getNode("Rules.page6.4").setValue("This is the Default rules");
			DropletRules.getConfig().getNode("Rules.page6.5").setValue("This is the Default rules");
			DropletRules.getConfig().getNode("Rules.onPlayerJoin.enabled").setValue(true);
			DropletRules.getConfig().getNode("Rules.onPlayerJoin.1").setValue("This is the Default rules");
			DropletRules.getConfig().getNode("Rules.onPlayerJoin.2").setValue("This is the Default rules");
			DropletRules.getConfig().getNode("Rules.onPlayerJoin.3").setValue("This is the Default rules");
			DropletRules.getConfig().getNode("Rules.onPlayerJoin.4").setValue("This is the Default rules");
			DropletRules.getConfig().getNode("Rules.onPlayerJoin.5").setValue("This is the Default rules");
			DropletRules.getConfig().save();
		}catch (ConfigurationException e) {
			e.printStackTrace();
		}
	}
}