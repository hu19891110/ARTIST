/*
* Copyright (c) 2012 Vienna University of Technology.
* All rights reserved. This program and the accompanying materials are made 
* available under the terms of the Eclipse Public License v1.0 which accompanies 
* this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
* 
* Contributors:
* Philip Langer - initial API and generator
*/
package eu.artist.postmigration.mbt.modelexecution.fuml.convert.uml2.internal.gen;
    	
import javax.annotation.Generated;

import org.modelexecution.fuml.convert.impl.ConversionResultImpl;

import eu.artist.postmigration.mbt.modelexecution.fuml.convert.uml2.internal.IElementPopulator;

@Generated(value="Generated by org.modelexecution.fuml.convert.uml2.gen.ElementPopulatorGenerator.xtend")
public class ActionPopulator implements IElementPopulator {

	@Override
	public void populate(fUML.Syntax.Classes.Kernel.Element fumlElement,
		org.eclipse.uml2.uml.Element uml2Element, ConversionResultImpl result) {
			
		if (!(uml2Element instanceof org.eclipse.uml2.uml.Action) ||
			!(fumlElement instanceof fUML.Syntax.Actions.BasicActions.Action)) {
			return;
		}
		
		fUML.Syntax.Actions.BasicActions.Action fumlNamedElement = (fUML.Syntax.Actions.BasicActions.Action) fumlElement;
		org.eclipse.uml2.uml.Action uml2NamedElement = (org.eclipse.uml2.uml.Action) uml2Element;
		
		
		for (org.eclipse.uml2.uml.OutputPin value : uml2NamedElement.getOutputs()) {
					fumlNamedElement.output.add((fUML.Syntax.Actions.BasicActions.OutputPin) result.getFUMLElement(value));
		}
		
		fumlNamedElement.context = (fUML.Syntax.Classes.Kernel.Classifier) result
							.getFUMLElement(uml2NamedElement.getContext());
		
		for (org.eclipse.uml2.uml.InputPin value : uml2NamedElement.getInputs()) {
					fumlNamedElement.input.add((fUML.Syntax.Actions.BasicActions.InputPin) result.getFUMLElement(value));
		}
		
		fumlNamedElement.isLocallyReentrant = uml2NamedElement.isLocallyReentrant();
		
		
		
		
	}
	
}