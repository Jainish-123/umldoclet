/*
 * Copyright 2016-2018 Talsma ICT
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package nl.talsmasoftware.umldoclet.uml;

import nl.talsmasoftware.umldoclet.uml.configuration.TypeDisplay;
import nl.talsmasoftware.umldoclet.rendering.indent.IndentingPrintWriter;

/**
 * @author Sjoerd Talsma
 */
public class Method extends TypeMember {

    public Method(Type containingType, Visibility visibility, boolean isAbstract, boolean isStatic,
                  String name, Parameters parameters, TypeName returnType) {
        super(containingType, visibility, isAbstract, isStatic, name, parameters, returnType);
    }

    @Override
    public <IPW extends IndentingPrintWriter> IPW writeTo(IPW output) {
        if (config.getMethodConfig().include(visibility)) super.writeTo(output);
        return output;
    }

    @Override
    protected <IPW extends IndentingPrintWriter> IPW writeTypeTo(IPW output) {
        TypeDisplay returnTypeDisplay = config.getMethodConfig().returnType();
        if (type != null && !TypeDisplay.NONE.equals(returnTypeDisplay)) {
            output.append(": ").append(type.toUml(returnTypeDisplay, null));
        }
        return output;
    }

}
