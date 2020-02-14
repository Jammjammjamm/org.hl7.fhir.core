package org.hl7.fhir.convertors.conv14_30;

import org.hl7.fhir.convertors.VersionConvertor_14_30;
import org.hl7.fhir.dstu2016may.model.CodeSystem.ConceptDefinitionPropertyComponent;
import org.hl7.fhir.dstu3.model.CodeSystem;
import org.hl7.fhir.dstu3.model.CodeSystem.FilterOperator;
import org.hl7.fhir.dstu3.model.Enumeration;
import org.hl7.fhir.exceptions.FHIRException;

public class CodeSystem14_30 {

    public static org.hl7.fhir.dstu3.model.CodeSystem convertCodeSystem(org.hl7.fhir.dstu2016may.model.CodeSystem src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.dstu3.model.CodeSystem tgt = new org.hl7.fhir.dstu3.model.CodeSystem();
        VersionConvertor_14_30.copyDomainResource(src, tgt);
        if (src.hasUrl())
            tgt.setUrlElement(VersionConvertor_14_30.convertUri(src.getUrlElement()));
        if (src.hasIdentifier())
            tgt.setIdentifier(VersionConvertor_14_30.convertIdentifier(src.getIdentifier()));
        if (src.hasVersion())
            tgt.setVersionElement(VersionConvertor_14_30.convertString(src.getVersionElement()));
        if (src.hasName())
            tgt.setNameElement(VersionConvertor_14_30.convertString(src.getNameElement()));
        if (src.hasStatus())
            tgt.setStatus(VersionConvertor_14_30.convertConformanceResourceStatus(src.getStatus()));
        if (src.hasExperimental())
            tgt.setExperimentalElement(VersionConvertor_14_30.convertBoolean(src.getExperimentalElement()));
        if (src.hasPublisher())
            tgt.setPublisherElement(VersionConvertor_14_30.convertString(src.getPublisherElement()));
        for (org.hl7.fhir.dstu2016may.model.CodeSystem.CodeSystemContactComponent t : src.getContact()) tgt.addContact(convertCodeSystemContactComponent(t));
        if (src.hasDate())
            tgt.setDateElement(VersionConvertor_14_30.convertDateTime(src.getDateElement()));
        if (src.hasDescription())
            tgt.setDescription(src.getDescription());
        for (org.hl7.fhir.dstu2016may.model.CodeableConcept t : src.getUseContext()) if (VersionConvertor_14_30.isJurisdiction(t))
            tgt.addJurisdiction(VersionConvertor_14_30.convertCodeableConcept(t));
        else
            tgt.addUseContext(VersionConvertor_14_30.convertCodeableConceptToUsageContext(t));
        if (src.hasRequirements())
            tgt.setPurpose(src.getRequirements());
        if (src.hasCopyright())
            tgt.setCopyright(src.getCopyright());
        if (src.hasCaseSensitive())
            tgt.setCaseSensitiveElement(VersionConvertor_14_30.convertBoolean(src.getCaseSensitiveElement()));
        if (src.hasValueSet())
            tgt.setValueSetElement(VersionConvertor_14_30.convertUri(src.getValueSetElement()));
        if (src.hasCompositional())
            tgt.setCompositionalElement(VersionConvertor_14_30.convertBoolean(src.getCompositionalElement()));
        if (src.hasVersionNeeded())
            tgt.setVersionNeededElement(VersionConvertor_14_30.convertBoolean(src.getVersionNeededElement()));
        if (src.hasContent())
            tgt.setContent(convertCodeSystemContentMode(src.getContent()));
        if (src.hasCount())
            tgt.setCountElement(VersionConvertor_14_30.convertUnsignedInt(src.getCountElement()));
        for (org.hl7.fhir.dstu2016may.model.CodeSystem.CodeSystemFilterComponent t : src.getFilter()) tgt.addFilter(convertCodeSystemFilterComponent(t));
        for (org.hl7.fhir.dstu2016may.model.CodeSystem.CodeSystemPropertyComponent t : src.getProperty()) tgt.addProperty(convertPropertyComponent(t));
        for (org.hl7.fhir.dstu2016may.model.CodeSystem.ConceptDefinitionComponent t : src.getConcept()) tgt.addConcept(convertConceptDefinitionComponent(t));
        return tgt;
    }

    public static org.hl7.fhir.dstu2016may.model.CodeSystem convertCodeSystem(org.hl7.fhir.dstu3.model.CodeSystem src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.dstu2016may.model.CodeSystem tgt = new org.hl7.fhir.dstu2016may.model.CodeSystem();
        VersionConvertor_14_30.copyDomainResource(src, tgt);
        if (src.hasUrl())
            tgt.setUrlElement(VersionConvertor_14_30.convertUri(src.getUrlElement()));
        if (src.hasIdentifier())
            tgt.setIdentifier(VersionConvertor_14_30.convertIdentifier(src.getIdentifier()));
        if (src.hasVersion())
            tgt.setVersionElement(VersionConvertor_14_30.convertString(src.getVersionElement()));
        if (src.hasName())
            tgt.setNameElement(VersionConvertor_14_30.convertString(src.getNameElement()));
        if (src.hasStatus())
            tgt.setStatus(VersionConvertor_14_30.convertConformanceResourceStatus(src.getStatus()));
        if (src.hasExperimental())
            tgt.setExperimentalElement(VersionConvertor_14_30.convertBoolean(src.getExperimentalElement()));
        if (src.hasPublisher())
            tgt.setPublisherElement(VersionConvertor_14_30.convertString(src.getPublisherElement()));
        for (org.hl7.fhir.dstu3.model.ContactDetail t : src.getContact()) tgt.addContact(convertCodeSystemContactComponent(t));
        if (src.hasDate())
            tgt.setDateElement(VersionConvertor_14_30.convertDateTime(src.getDateElement()));
        if (src.hasDescription())
            tgt.setDescription(src.getDescription());
        for (org.hl7.fhir.dstu3.model.UsageContext t : src.getUseContext()) if (t.hasValueCodeableConcept())
            tgt.addUseContext(VersionConvertor_14_30.convertCodeableConcept(t.getValueCodeableConcept()));
        for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getJurisdiction()) tgt.addUseContext(VersionConvertor_14_30.convertCodeableConcept(t));
        if (src.hasPurpose())
            tgt.setRequirements(src.getPurpose());
        if (src.hasCopyright())
            tgt.setCopyright(src.getCopyright());
        if (src.hasCaseSensitive())
            tgt.setCaseSensitiveElement(VersionConvertor_14_30.convertBoolean(src.getCaseSensitiveElement()));
        if (src.hasValueSet())
            tgt.setValueSetElement(VersionConvertor_14_30.convertUri(src.getValueSetElement()));
        if (src.hasCompositional())
            tgt.setCompositionalElement(VersionConvertor_14_30.convertBoolean(src.getCompositionalElement()));
        if (src.hasVersionNeeded())
            tgt.setVersionNeededElement(VersionConvertor_14_30.convertBoolean(src.getVersionNeededElement()));
        if (src.hasContent())
            tgt.setContent(convertCodeSystemContentMode(src.getContent()));
        if (src.hasCount())
            tgt.setCountElement(VersionConvertor_14_30.convertUnsignedInt(src.getCountElement()));
        for (org.hl7.fhir.dstu3.model.CodeSystem.CodeSystemFilterComponent t : src.getFilter()) tgt.addFilter(convertCodeSystemFilterComponent(t));
        for (org.hl7.fhir.dstu3.model.CodeSystem.PropertyComponent t : src.getProperty()) tgt.addProperty(convertPropertyComponent(t));
        for (org.hl7.fhir.dstu3.model.CodeSystem.ConceptDefinitionComponent t : src.getConcept()) tgt.addConcept(convertConceptDefinitionComponent(t));
        return tgt;
    }

    public static org.hl7.fhir.dstu2016may.model.CodeSystem.CodeSystemContactComponent convertCodeSystemContactComponent(org.hl7.fhir.dstu3.model.ContactDetail src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.dstu2016may.model.CodeSystem.CodeSystemContactComponent tgt = new org.hl7.fhir.dstu2016may.model.CodeSystem.CodeSystemContactComponent();
        VersionConvertor_14_30.copyElement(src, tgt);
        if (src.hasName())
            tgt.setNameElement(VersionConvertor_14_30.convertString(src.getNameElement()));
        for (org.hl7.fhir.dstu3.model.ContactPoint t : src.getTelecom()) tgt.addTelecom(VersionConvertor_14_30.convertContactPoint(t));
        return tgt;
    }

    public static org.hl7.fhir.dstu3.model.ContactDetail convertCodeSystemContactComponent(org.hl7.fhir.dstu2016may.model.CodeSystem.CodeSystemContactComponent src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.dstu3.model.ContactDetail tgt = new org.hl7.fhir.dstu3.model.ContactDetail();
        VersionConvertor_14_30.copyElement(src, tgt);
        if (src.hasName())
            tgt.setNameElement(VersionConvertor_14_30.convertString(src.getNameElement()));
        for (org.hl7.fhir.dstu2016may.model.ContactPoint t : src.getTelecom()) tgt.addTelecom(VersionConvertor_14_30.convertContactPoint(t));
        return tgt;
    }

    static public org.hl7.fhir.dstu2016may.model.CodeSystem.CodeSystemContentMode convertCodeSystemContentMode(org.hl7.fhir.dstu3.model.CodeSystem.CodeSystemContentMode src) throws FHIRException {
        if (src == null)
            return null;
        switch(src) {
            case NOTPRESENT:
                return org.hl7.fhir.dstu2016may.model.CodeSystem.CodeSystemContentMode.NOTPRESENT;
            case EXAMPLE:
                return org.hl7.fhir.dstu2016may.model.CodeSystem.CodeSystemContentMode.EXAMPLAR;
            case FRAGMENT:
                return org.hl7.fhir.dstu2016may.model.CodeSystem.CodeSystemContentMode.FRAGMENT;
            case COMPLETE:
                return org.hl7.fhir.dstu2016may.model.CodeSystem.CodeSystemContentMode.COMPLETE;
            default:
                return org.hl7.fhir.dstu2016may.model.CodeSystem.CodeSystemContentMode.NULL;
        }
    }

    static public org.hl7.fhir.dstu3.model.CodeSystem.CodeSystemContentMode convertCodeSystemContentMode(org.hl7.fhir.dstu2016may.model.CodeSystem.CodeSystemContentMode src) throws FHIRException {
        if (src == null)
            return null;
        switch(src) {
            case NOTPRESENT:
                return org.hl7.fhir.dstu3.model.CodeSystem.CodeSystemContentMode.NOTPRESENT;
            case EXAMPLAR:
                return org.hl7.fhir.dstu3.model.CodeSystem.CodeSystemContentMode.EXAMPLE;
            case FRAGMENT:
                return org.hl7.fhir.dstu3.model.CodeSystem.CodeSystemContentMode.FRAGMENT;
            case COMPLETE:
                return org.hl7.fhir.dstu3.model.CodeSystem.CodeSystemContentMode.COMPLETE;
            default:
                return org.hl7.fhir.dstu3.model.CodeSystem.CodeSystemContentMode.NULL;
        }
    }

    public static org.hl7.fhir.dstu3.model.CodeSystem.CodeSystemFilterComponent convertCodeSystemFilterComponent(org.hl7.fhir.dstu2016may.model.CodeSystem.CodeSystemFilterComponent src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.dstu3.model.CodeSystem.CodeSystemFilterComponent tgt = new org.hl7.fhir.dstu3.model.CodeSystem.CodeSystemFilterComponent();
        VersionConvertor_14_30.copyElement(src, tgt);
        if (src.hasCodeElement())
            tgt.setCodeElement(VersionConvertor_14_30.convertCode(src.getCodeElement()));
        if (src.hasDescription())
            tgt.setDescriptionElement(VersionConvertor_14_30.convertString(src.getDescriptionElement()));
        for (org.hl7.fhir.dstu2016may.model.CodeType t : src.getOperator()) try {
            tgt.addOperator(CodeSystem.FilterOperator.fromCode(t.getValue()));
        } catch (org.hl7.fhir.exceptions.FHIRException e) {
            throw new FHIRException(e);
        }
        if (src.hasValueElement())
            tgt.setValueElement(VersionConvertor_14_30.convertString(src.getValueElement()));
        return tgt;
    }

    public static org.hl7.fhir.dstu2016may.model.CodeSystem.CodeSystemFilterComponent convertCodeSystemFilterComponent(org.hl7.fhir.dstu3.model.CodeSystem.CodeSystemFilterComponent src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.dstu2016may.model.CodeSystem.CodeSystemFilterComponent tgt = new org.hl7.fhir.dstu2016may.model.CodeSystem.CodeSystemFilterComponent();
        VersionConvertor_14_30.copyElement(src, tgt);
        if (src.hasCodeElement())
            tgt.setCodeElement(VersionConvertor_14_30.convertCode(src.getCodeElement()));
        if (src.hasDescription())
            tgt.setDescriptionElement(VersionConvertor_14_30.convertString(src.getDescriptionElement()));
        for (Enumeration<FilterOperator> t : src.getOperator()) tgt.addOperator(t.getValue().toCode());
        if (src.hasValueElement())
            tgt.setValueElement(VersionConvertor_14_30.convertString(src.getValueElement()));
        return tgt;
    }

    public static org.hl7.fhir.dstu2016may.model.CodeSystem.ConceptDefinitionComponent convertConceptDefinitionComponent(org.hl7.fhir.dstu3.model.CodeSystem.ConceptDefinitionComponent src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.dstu2016may.model.CodeSystem.ConceptDefinitionComponent tgt = new org.hl7.fhir.dstu2016may.model.CodeSystem.ConceptDefinitionComponent();
        VersionConvertor_14_30.copyElement(src, tgt);
        if (src.hasCodeElement())
            tgt.setCodeElement(VersionConvertor_14_30.convertCode(src.getCodeElement()));
        if (src.hasDisplay())
            tgt.setDisplayElement(VersionConvertor_14_30.convertString(src.getDisplayElement()));
        if (src.hasDefinition())
            tgt.setDefinitionElement(VersionConvertor_14_30.convertString(src.getDefinitionElement()));
        for (org.hl7.fhir.dstu3.model.CodeSystem.ConceptDefinitionDesignationComponent t : src.getDesignation()) tgt.addDesignation(convertConceptDefinitionDesignationComponent(t));
        for (org.hl7.fhir.dstu3.model.CodeSystem.ConceptPropertyComponent t : src.getProperty()) tgt.addProperty(convertConceptPropertyComponent(t));
        for (org.hl7.fhir.dstu3.model.CodeSystem.ConceptDefinitionComponent t : src.getConcept()) tgt.addConcept(convertConceptDefinitionComponent(t));
        return tgt;
    }

    public static org.hl7.fhir.dstu3.model.CodeSystem.ConceptDefinitionComponent convertConceptDefinitionComponent(org.hl7.fhir.dstu2016may.model.CodeSystem.ConceptDefinitionComponent src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.dstu3.model.CodeSystem.ConceptDefinitionComponent tgt = new org.hl7.fhir.dstu3.model.CodeSystem.ConceptDefinitionComponent();
        VersionConvertor_14_30.copyElement(src, tgt);
        if (src.hasCodeElement())
            tgt.setCodeElement(VersionConvertor_14_30.convertCode(src.getCodeElement()));
        if (src.hasDisplay())
            tgt.setDisplayElement(VersionConvertor_14_30.convertString(src.getDisplayElement()));
        if (src.hasDefinition())
            tgt.setDefinitionElement(VersionConvertor_14_30.convertString(src.getDefinitionElement()));
        for (org.hl7.fhir.dstu2016may.model.CodeSystem.ConceptDefinitionDesignationComponent t : src.getDesignation()) tgt.addDesignation(convertConceptDefinitionDesignationComponent(t));
        for (ConceptDefinitionPropertyComponent t : src.getProperty()) tgt.addProperty(convertConceptPropertyComponent(t));
        for (org.hl7.fhir.dstu2016may.model.CodeSystem.ConceptDefinitionComponent t : src.getConcept()) tgt.addConcept(convertConceptDefinitionComponent(t));
        return tgt;
    }

    public static org.hl7.fhir.dstu2016may.model.CodeSystem.ConceptDefinitionDesignationComponent convertConceptDefinitionDesignationComponent(org.hl7.fhir.dstu3.model.CodeSystem.ConceptDefinitionDesignationComponent src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.dstu2016may.model.CodeSystem.ConceptDefinitionDesignationComponent tgt = new org.hl7.fhir.dstu2016may.model.CodeSystem.ConceptDefinitionDesignationComponent();
        VersionConvertor_14_30.copyElement(src, tgt);
        if (src.hasLanguage())
            tgt.setLanguageElement(VersionConvertor_14_30.convertCode(src.getLanguageElement()));
        if (src.hasUse())
            tgt.setUse(VersionConvertor_14_30.convertCoding(src.getUse()));
        if (src.hasValueElement())
            tgt.setValueElement(VersionConvertor_14_30.convertString(src.getValueElement()));
        return tgt;
    }

    public static org.hl7.fhir.dstu3.model.CodeSystem.ConceptDefinitionDesignationComponent convertConceptDefinitionDesignationComponent(org.hl7.fhir.dstu2016may.model.CodeSystem.ConceptDefinitionDesignationComponent src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.dstu3.model.CodeSystem.ConceptDefinitionDesignationComponent tgt = new org.hl7.fhir.dstu3.model.CodeSystem.ConceptDefinitionDesignationComponent();
        VersionConvertor_14_30.copyElement(src, tgt);
        if (src.hasLanguage())
            tgt.setLanguageElement(VersionConvertor_14_30.convertCode(src.getLanguageElement()));
        if (src.hasUse())
            tgt.setUse(VersionConvertor_14_30.convertCoding(src.getUse()));
        if (src.hasValueElement())
            tgt.setValueElement(VersionConvertor_14_30.convertString(src.getValueElement()));
        return tgt;
    }

    public static org.hl7.fhir.dstu2016may.model.CodeSystem.ConceptDefinitionPropertyComponent convertConceptPropertyComponent(org.hl7.fhir.dstu3.model.CodeSystem.ConceptPropertyComponent src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.dstu2016may.model.CodeSystem.ConceptDefinitionPropertyComponent tgt = new org.hl7.fhir.dstu2016may.model.CodeSystem.ConceptDefinitionPropertyComponent();
        VersionConvertor_14_30.copyElement(src, tgt);
        if (src.hasCodeElement())
            tgt.setCodeElement(VersionConvertor_14_30.convertCode(src.getCodeElement()));
        if (src.hasValue())
            tgt.setValue(VersionConvertor_14_30.convertType(src.getValue()));
        return tgt;
    }

    public static org.hl7.fhir.dstu3.model.CodeSystem.ConceptPropertyComponent convertConceptPropertyComponent(org.hl7.fhir.dstu2016may.model.CodeSystem.ConceptDefinitionPropertyComponent src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.dstu3.model.CodeSystem.ConceptPropertyComponent tgt = new org.hl7.fhir.dstu3.model.CodeSystem.ConceptPropertyComponent();
        VersionConvertor_14_30.copyElement(src, tgt);
        if (src.hasCodeElement())
            tgt.setCodeElement(VersionConvertor_14_30.convertCode(src.getCodeElement()));
        if (src.hasValue())
            tgt.setValue(VersionConvertor_14_30.convertType(src.getValue()));
        return tgt;
    }

    public static org.hl7.fhir.dstu3.model.CodeSystem.PropertyComponent convertPropertyComponent(org.hl7.fhir.dstu2016may.model.CodeSystem.CodeSystemPropertyComponent src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.dstu3.model.CodeSystem.PropertyComponent tgt = new org.hl7.fhir.dstu3.model.CodeSystem.PropertyComponent();
        VersionConvertor_14_30.copyElement(src, tgt);
        if (src.hasCodeElement())
            tgt.setCodeElement(VersionConvertor_14_30.convertCode(src.getCodeElement()));
        if (src.hasDescription())
            tgt.setDescriptionElement(VersionConvertor_14_30.convertString(src.getDescriptionElement()));
        if (src.hasType())
            tgt.setType(convertPropertyType(src.getType()));
        return tgt;
    }

    public static org.hl7.fhir.dstu2016may.model.CodeSystem.CodeSystemPropertyComponent convertPropertyComponent(org.hl7.fhir.dstu3.model.CodeSystem.PropertyComponent src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.dstu2016may.model.CodeSystem.CodeSystemPropertyComponent tgt = new org.hl7.fhir.dstu2016may.model.CodeSystem.CodeSystemPropertyComponent();
        VersionConvertor_14_30.copyElement(src, tgt);
        if (src.hasCodeElement())
            tgt.setCodeElement(VersionConvertor_14_30.convertCode(src.getCodeElement()));
        if (src.hasDescription())
            tgt.setDescriptionElement(VersionConvertor_14_30.convertString(src.getDescriptionElement()));
        if (src.hasType())
            tgt.setType(convertPropertyType(src.getType()));
        return tgt;
    }

    static public org.hl7.fhir.dstu3.model.CodeSystem.PropertyType convertPropertyType(org.hl7.fhir.dstu2016may.model.CodeSystem.PropertyType src) throws FHIRException {
        if (src == null)
            return null;
        switch(src) {
            case CODE:
                return org.hl7.fhir.dstu3.model.CodeSystem.PropertyType.CODE;
            case CODING:
                return org.hl7.fhir.dstu3.model.CodeSystem.PropertyType.CODING;
            case STRING:
                return org.hl7.fhir.dstu3.model.CodeSystem.PropertyType.STRING;
            case INTEGER:
                return org.hl7.fhir.dstu3.model.CodeSystem.PropertyType.INTEGER;
            case BOOLEAN:
                return org.hl7.fhir.dstu3.model.CodeSystem.PropertyType.BOOLEAN;
            case DATETIME:
                return org.hl7.fhir.dstu3.model.CodeSystem.PropertyType.DATETIME;
            default:
                return org.hl7.fhir.dstu3.model.CodeSystem.PropertyType.NULL;
        }
    }

    static public org.hl7.fhir.dstu2016may.model.CodeSystem.PropertyType convertPropertyType(org.hl7.fhir.dstu3.model.CodeSystem.PropertyType src) throws FHIRException {
        if (src == null)
            return null;
        switch(src) {
            case CODE:
                return org.hl7.fhir.dstu2016may.model.CodeSystem.PropertyType.CODE;
            case CODING:
                return org.hl7.fhir.dstu2016may.model.CodeSystem.PropertyType.CODING;
            case STRING:
                return org.hl7.fhir.dstu2016may.model.CodeSystem.PropertyType.STRING;
            case INTEGER:
                return org.hl7.fhir.dstu2016may.model.CodeSystem.PropertyType.INTEGER;
            case BOOLEAN:
                return org.hl7.fhir.dstu2016may.model.CodeSystem.PropertyType.BOOLEAN;
            case DATETIME:
                return org.hl7.fhir.dstu2016may.model.CodeSystem.PropertyType.DATETIME;
            default:
                return org.hl7.fhir.dstu2016may.model.CodeSystem.PropertyType.NULL;
        }
    }
}
