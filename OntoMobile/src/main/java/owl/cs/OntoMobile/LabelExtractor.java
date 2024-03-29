package owl.cs.OntoMobile;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLAnnotation;
import org.semanticweb.owlapi.model.OWLAnnotationAssertionAxiom;
import org.semanticweb.owlapi.model.OWLAnnotationObjectVisitor;
import org.semanticweb.owlapi.model.OWLAnnotationProperty;
import org.semanticweb.owlapi.model.OWLAnnotationPropertyDomainAxiom;
import org.semanticweb.owlapi.model.OWLAnnotationPropertyRangeAxiom;
import org.semanticweb.owlapi.model.OWLAnnotationValue;
import org.semanticweb.owlapi.model.OWLAnonymousIndividual;
import org.semanticweb.owlapi.model.OWLAsymmetricObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLClassAssertionAxiom;
import org.semanticweb.owlapi.model.OWLDataAllValuesFrom;
import org.semanticweb.owlapi.model.OWLDataComplementOf;
import org.semanticweb.owlapi.model.OWLDataExactCardinality;
import org.semanticweb.owlapi.model.OWLDataHasValue;
import org.semanticweb.owlapi.model.OWLDataIntersectionOf;
import org.semanticweb.owlapi.model.OWLDataMaxCardinality;
import org.semanticweb.owlapi.model.OWLDataMinCardinality;
import org.semanticweb.owlapi.model.OWLDataOneOf;
import org.semanticweb.owlapi.model.OWLDataProperty;
import org.semanticweb.owlapi.model.OWLDataPropertyAssertionAxiom;
import org.semanticweb.owlapi.model.OWLDataPropertyDomainAxiom;
import org.semanticweb.owlapi.model.OWLDataPropertyRangeAxiom;
import org.semanticweb.owlapi.model.OWLDataSomeValuesFrom;
import org.semanticweb.owlapi.model.OWLDataUnionOf;
import org.semanticweb.owlapi.model.OWLDatatype;
import org.semanticweb.owlapi.model.OWLDatatypeDefinitionAxiom;
import org.semanticweb.owlapi.model.OWLDatatypeRestriction;
import org.semanticweb.owlapi.model.OWLDeclarationAxiom;
import org.semanticweb.owlapi.model.OWLDifferentIndividualsAxiom;
import org.semanticweb.owlapi.model.OWLDisjointClassesAxiom;
import org.semanticweb.owlapi.model.OWLDisjointDataPropertiesAxiom;
import org.semanticweb.owlapi.model.OWLDisjointObjectPropertiesAxiom;
import org.semanticweb.owlapi.model.OWLDisjointUnionAxiom;
import org.semanticweb.owlapi.model.OWLEquivalentClassesAxiom;
import org.semanticweb.owlapi.model.OWLEquivalentDataPropertiesAxiom;
import org.semanticweb.owlapi.model.OWLEquivalentObjectPropertiesAxiom;
import org.semanticweb.owlapi.model.OWLFacetRestriction;
import org.semanticweb.owlapi.model.OWLFunctionalDataPropertyAxiom;
import org.semanticweb.owlapi.model.OWLFunctionalObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLHasKeyAxiom;
import org.semanticweb.owlapi.model.OWLInverseFunctionalObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLInverseObjectPropertiesAxiom;
import org.semanticweb.owlapi.model.OWLIrreflexiveObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLLiteral;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLNegativeDataPropertyAssertionAxiom;
import org.semanticweb.owlapi.model.OWLNegativeObjectPropertyAssertionAxiom;
import org.semanticweb.owlapi.model.OWLObjectAllValuesFrom;
import org.semanticweb.owlapi.model.OWLObjectComplementOf;
import org.semanticweb.owlapi.model.OWLObjectExactCardinality;
import org.semanticweb.owlapi.model.OWLObjectHasSelf;
import org.semanticweb.owlapi.model.OWLObjectHasValue;
import org.semanticweb.owlapi.model.OWLObjectIntersectionOf;
import org.semanticweb.owlapi.model.OWLObjectInverseOf;
import org.semanticweb.owlapi.model.OWLObjectMaxCardinality;
import org.semanticweb.owlapi.model.OWLObjectMinCardinality;
import org.semanticweb.owlapi.model.OWLObjectOneOf;
import org.semanticweb.owlapi.model.OWLObjectProperty;
import org.semanticweb.owlapi.model.OWLObjectPropertyAssertionAxiom;
import org.semanticweb.owlapi.model.OWLObjectPropertyDomainAxiom;
import org.semanticweb.owlapi.model.OWLObjectPropertyRangeAxiom;
import org.semanticweb.owlapi.model.OWLObjectSomeValuesFrom;
import org.semanticweb.owlapi.model.OWLObjectUnionOf;
import org.semanticweb.owlapi.model.OWLObjectVisitor;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLReflexiveObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLSameIndividualAxiom;
import org.semanticweb.owlapi.model.OWLSubAnnotationPropertyOfAxiom;
import org.semanticweb.owlapi.model.OWLSubClassOfAxiom;
import org.semanticweb.owlapi.model.OWLSubDataPropertyOfAxiom;
import org.semanticweb.owlapi.model.OWLSubObjectPropertyOfAxiom;
import org.semanticweb.owlapi.model.OWLSubPropertyChainOfAxiom;
import org.semanticweb.owlapi.model.OWLSymmetricObjectPropertyAxiom;
import org.semanticweb.owlapi.model.OWLTransitiveObjectPropertyAxiom;
import org.semanticweb.owlapi.model.SWRLBuiltInAtom;
import org.semanticweb.owlapi.model.SWRLClassAtom;
import org.semanticweb.owlapi.model.SWRLDataPropertyAtom;
import org.semanticweb.owlapi.model.SWRLDataRangeAtom;
import org.semanticweb.owlapi.model.SWRLDifferentIndividualsAtom;
import org.semanticweb.owlapi.model.SWRLIndividualArgument;
import org.semanticweb.owlapi.model.SWRLLiteralArgument;
import org.semanticweb.owlapi.model.SWRLObjectPropertyAtom;
import org.semanticweb.owlapi.model.SWRLRule;
import org.semanticweb.owlapi.model.SWRLSameIndividualAtom;
import org.semanticweb.owlapi.model.SWRLVariable;



public  class LabelExtractor implements OWLAnnotationObjectVisitor, OWLObjectVisitor {
    String result;

    public LabelExtractor() {
        result = null;
    }

    @Override
    public void visit(OWLAnonymousIndividual individual) {}

    @Override
    public void visit(IRI iri) {}

    @Override
    public void visit(OWLLiteral literal) {}

    @Override
    public void visit(OWLAnnotation annotation) {
        /*
         * If it's a label, grab it as the result. Note that if there are
         * multiple labels, the last one will be used.
         */
        if (annotation.getProperty().isLabel()) {
            OWLLiteral c = (OWLLiteral) annotation.getValue();
            result = c.getLiteral();
        }
    }

    @Override
    public void visit(OWLAnnotationAssertionAxiom axiom) {}

    @Override
    public void visit(OWLAnnotationPropertyDomainAxiom axiom) {}

    @Override
    public void visit(OWLAnnotationPropertyRangeAxiom axiom) {}

    @Override
    public void visit(OWLSubAnnotationPropertyOfAxiom axiom) {}

    public void visit(OWLAnnotationProperty property) {}

    public void visit(OWLAnnotationValue value) {}

    public String getResult() {
        return result;
    }

	@Override
	public void visit(OWLDeclarationAxiom arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(OWLSubClassOfAxiom arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(OWLNegativeObjectPropertyAssertionAxiom arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(OWLAsymmetricObjectPropertyAxiom arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(OWLReflexiveObjectPropertyAxiom arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(OWLDisjointClassesAxiom arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(OWLDataPropertyDomainAxiom arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(OWLObjectPropertyDomainAxiom arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(OWLEquivalentObjectPropertiesAxiom arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(OWLNegativeDataPropertyAssertionAxiom arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(OWLDifferentIndividualsAxiom arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(OWLDisjointDataPropertiesAxiom arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(OWLDisjointObjectPropertiesAxiom arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(OWLObjectPropertyRangeAxiom arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(OWLObjectPropertyAssertionAxiom arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(OWLFunctionalObjectPropertyAxiom arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(OWLSubObjectPropertyOfAxiom arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(OWLDisjointUnionAxiom arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(OWLSymmetricObjectPropertyAxiom arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(OWLDataPropertyRangeAxiom arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(OWLFunctionalDataPropertyAxiom arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(OWLEquivalentDataPropertiesAxiom arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(OWLClassAssertionAxiom arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(OWLEquivalentClassesAxiom arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(OWLDataPropertyAssertionAxiom arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(OWLTransitiveObjectPropertyAxiom arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(OWLIrreflexiveObjectPropertyAxiom arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(OWLSubDataPropertyOfAxiom arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(OWLInverseFunctionalObjectPropertyAxiom arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(OWLSameIndividualAxiom arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(OWLSubPropertyChainOfAxiom arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(OWLInverseObjectPropertiesAxiom arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(OWLHasKeyAxiom arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(OWLDatatypeDefinitionAxiom arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(SWRLRule arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(OWLClass arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(OWLObjectIntersectionOf arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(OWLObjectUnionOf arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(OWLObjectComplementOf arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(OWLObjectSomeValuesFrom arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(OWLObjectAllValuesFrom arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(OWLObjectHasValue arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(OWLObjectMinCardinality arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(OWLObjectExactCardinality arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(OWLObjectMaxCardinality arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(OWLObjectHasSelf arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(OWLObjectOneOf arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(OWLDataSomeValuesFrom arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(OWLDataAllValuesFrom arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(OWLDataHasValue arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(OWLDataMinCardinality arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(OWLDataExactCardinality arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(OWLDataMaxCardinality arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(OWLFacetRestriction arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(OWLDatatype arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(OWLDataOneOf arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(OWLDataComplementOf arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(OWLDataIntersectionOf arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(OWLDataUnionOf arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(OWLDatatypeRestriction arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(OWLObjectProperty arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(OWLObjectInverseOf arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(OWLDataProperty arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(OWLNamedIndividual arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(SWRLClassAtom arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(SWRLDataRangeAtom arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(SWRLObjectPropertyAtom arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(SWRLDataPropertyAtom arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(SWRLBuiltInAtom arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(SWRLVariable arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(SWRLIndividualArgument arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(SWRLLiteralArgument arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(SWRLSameIndividualAtom arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(SWRLDifferentIndividualsAtom arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(OWLOntology arg0) {
		// TODO Auto-generated method stub
		
	}
}