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
package net.sourceforge.plantuml.activitydiagram3.gtile;

import java.util.Collection;

import net.sourceforge.plantuml.ISkinParam;
import net.sourceforge.plantuml.graphic.StringBounder;
import net.sourceforge.plantuml.graphic.TextBlock;
import net.sourceforge.plantuml.ugraphic.UTranslate;

public interface Gtile extends Swimable2, TextBlock {

	public static final boolean USE_GTILE = false;

	public ISkinParam skinParam();

	public StringBounder getStringBounder();

	// public UTranslate getTranslateFor(Gtile child);

	// public Collection<Gtile> getMyChildren();

	public UTranslate getCoord(String name);

	public GPoint getGPoint(String name);

	public Collection<GConnection> getInnerConnections();

//	public List<WeldingPoint> getWeldingPoints();
//	
//	public HorizontalAlignment arrowHorizontalAlignment();

}
