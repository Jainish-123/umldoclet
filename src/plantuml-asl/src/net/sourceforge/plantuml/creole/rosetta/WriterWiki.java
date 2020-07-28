/* ========================================================================
 * PlantUML : a free UML diagram generator
 * ========================================================================
 *
 * (C) Copyright 2009-2020, Arnaud Roques
 *
 * Project Info:  https://plantuml.com
 * 
 * If you like this project or if you find it useful, you can support us at:
 * 
 * https://plantuml.com/patreon (only 1$ per month!)
 * https://plantuml.com/paypal
 * 
 * This file is part of PlantUML.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 *
 * Original Author:  Arnaud Roques
 */
package net.sourceforge.plantuml.creole.rosetta;

import java.util.ArrayList;
import java.util.List;

public class WriterWiki {

	private final WikiLanguage syntaxDestination;

	public WriterWiki(WikiLanguage syntaxDestination) {
		this.syntaxDestination = syntaxDestination;
		if (syntaxDestination != WikiLanguage.HTML_DEBUG && syntaxDestination != WikiLanguage.UNICODE) {
			throw new IllegalArgumentException(syntaxDestination.toString());
		}
	}

	public List<String> transform(List<String> data) {
		if (syntaxDestination == WikiLanguage.UNICODE) {
			return data;
		}
		final List<String> result = new ArrayList<String>();
		for (String s : data) {
			result.add(WikiLanguage.toHtmlDebug(s));
		}
		return result;
	}

}
