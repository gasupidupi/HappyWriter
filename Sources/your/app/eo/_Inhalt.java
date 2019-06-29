// DO NOT EDIT.  Make changes to Inhalt.java instead.
package your.app.eo;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;

import er.extensions.eof.*;
import er.extensions.eof.ERXKey.Type;
import er.extensions.foundation.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("all")
public abstract class _Inhalt extends  ERXGenericRecord {
  public static final String ENTITY_NAME = "Inhalt";

  // Attribute Keys
  public static final ERXKey<String> NAME = new ERXKey<String>("name", Type.Attribute);
  public static final ERXKey<Long> PREIS = new ERXKey<Long>("preis", Type.Attribute);

  // Relationship Keys
  public static final ERXKey<BestellteKonfiguration> BESTELLTE_KONFIGURATIONS = new ERXKey<BestellteKonfiguration>("bestellteKonfigurations", Type.ToManyRelationship);
  public static final ERXKey<Konfiguration> KONFIGURATIONS = new ERXKey<Konfiguration>("konfigurations", Type.ToManyRelationship);

  // Attributes
  public static final String NAME_KEY = NAME.key();
  public static final String PREIS_KEY = PREIS.key();

  // Relationships
  public static final String BESTELLTE_KONFIGURATIONS_KEY = BESTELLTE_KONFIGURATIONS.key();
  public static final String KONFIGURATIONS_KEY = KONFIGURATIONS.key();

  private static final Logger log = LoggerFactory.getLogger(_Inhalt.class);

  public Inhalt localInstanceIn(EOEditingContext editingContext) {
    Inhalt localInstance = (Inhalt)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public String name() {
    return (String) storedValueForKey(_Inhalt.NAME_KEY);
  }

  public void setName(String value) {
    log.debug( "updating name from {} to {}", name(), value);
    takeStoredValueForKey(value, _Inhalt.NAME_KEY);
  }

  public Long preis() {
    return (Long) storedValueForKey(_Inhalt.PREIS_KEY);
  }

  public void setPreis(Long value) {
    log.debug( "updating preis from {} to {}", preis(), value);
    takeStoredValueForKey(value, _Inhalt.PREIS_KEY);
  }

  public NSArray<BestellteKonfiguration> bestellteKonfigurations() {
    return (NSArray<BestellteKonfiguration>)storedValueForKey(_Inhalt.BESTELLTE_KONFIGURATIONS_KEY);
  }

  public NSArray<BestellteKonfiguration> bestellteKonfigurations(EOQualifier qualifier) {
    return bestellteKonfigurations(qualifier, null, false);
  }

  public NSArray<BestellteKonfiguration> bestellteKonfigurations(EOQualifier qualifier, boolean fetch) {
    return bestellteKonfigurations(qualifier, null, fetch);
  }

  public NSArray<BestellteKonfiguration> bestellteKonfigurations(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<BestellteKonfiguration> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = ERXQ.equals(BestellteKonfiguration.INHALT_KEY, this);

      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        fullQualifier = ERXQ.and(qualifier, inverseQualifier);
      }

      results = BestellteKonfiguration.fetchBestellteKonfigurations(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = bestellteKonfigurations();
      if (qualifier != null) {
        results = (NSArray<BestellteKonfiguration>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<BestellteKonfiguration>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }

  public void addToBestellteKonfigurations(BestellteKonfiguration object) {
    includeObjectIntoPropertyWithKey(object, _Inhalt.BESTELLTE_KONFIGURATIONS_KEY);
  }

  public void removeFromBestellteKonfigurations(BestellteKonfiguration object) {
    excludeObjectFromPropertyWithKey(object, _Inhalt.BESTELLTE_KONFIGURATIONS_KEY);
  }

  public void addToBestellteKonfigurationsRelationship(BestellteKonfiguration object) {
    log.debug("adding {} to bestellteKonfigurations relationship", object);
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
      addToBestellteKonfigurations(object);
    }
    else {
      addObjectToBothSidesOfRelationshipWithKey(object, _Inhalt.BESTELLTE_KONFIGURATIONS_KEY);
    }
  }

  public void removeFromBestellteKonfigurationsRelationship(BestellteKonfiguration object) {
    log.debug("removing {} from bestellteKonfigurations relationship", object);
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
      removeFromBestellteKonfigurations(object);
    }
    else {
      removeObjectFromBothSidesOfRelationshipWithKey(object, _Inhalt.BESTELLTE_KONFIGURATIONS_KEY);
    }
  }

  public BestellteKonfiguration createBestellteKonfigurationsRelationship() {
    EOEnterpriseObject eo = EOUtilities.createAndInsertInstance(editingContext(),  BestellteKonfiguration.ENTITY_NAME );
    addObjectToBothSidesOfRelationshipWithKey(eo, _Inhalt.BESTELLTE_KONFIGURATIONS_KEY);
    return (BestellteKonfiguration) eo;
  }

  public void deleteBestellteKonfigurationsRelationship(BestellteKonfiguration object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, _Inhalt.BESTELLTE_KONFIGURATIONS_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllBestellteKonfigurationsRelationships() {
    Enumeration<BestellteKonfiguration> objects = bestellteKonfigurations().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteBestellteKonfigurationsRelationship(objects.nextElement());
    }
  }

  public NSArray<Konfiguration> konfigurations() {
    return (NSArray<Konfiguration>)storedValueForKey(_Inhalt.KONFIGURATIONS_KEY);
  }

  public NSArray<Konfiguration> konfigurations(EOQualifier qualifier) {
    return konfigurations(qualifier, null, false);
  }

  public NSArray<Konfiguration> konfigurations(EOQualifier qualifier, boolean fetch) {
    return konfigurations(qualifier, null, fetch);
  }

  public NSArray<Konfiguration> konfigurations(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<Konfiguration> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = ERXQ.equals(Konfiguration.INHALT_KEY, this);

      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        fullQualifier = ERXQ.and(qualifier, inverseQualifier);
      }

      results = Konfiguration.fetchKonfigurations(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = konfigurations();
      if (qualifier != null) {
        results = (NSArray<Konfiguration>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<Konfiguration>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }

  public void addToKonfigurations(Konfiguration object) {
    includeObjectIntoPropertyWithKey(object, _Inhalt.KONFIGURATIONS_KEY);
  }

  public void removeFromKonfigurations(Konfiguration object) {
    excludeObjectFromPropertyWithKey(object, _Inhalt.KONFIGURATIONS_KEY);
  }

  public void addToKonfigurationsRelationship(Konfiguration object) {
    log.debug("adding {} to konfigurations relationship", object);
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
      addToKonfigurations(object);
    }
    else {
      addObjectToBothSidesOfRelationshipWithKey(object, _Inhalt.KONFIGURATIONS_KEY);
    }
  }

  public void removeFromKonfigurationsRelationship(Konfiguration object) {
    log.debug("removing {} from konfigurations relationship", object);
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
      removeFromKonfigurations(object);
    }
    else {
      removeObjectFromBothSidesOfRelationshipWithKey(object, _Inhalt.KONFIGURATIONS_KEY);
    }
  }

  public Konfiguration createKonfigurationsRelationship() {
    EOEnterpriseObject eo = EOUtilities.createAndInsertInstance(editingContext(),  Konfiguration.ENTITY_NAME );
    addObjectToBothSidesOfRelationshipWithKey(eo, _Inhalt.KONFIGURATIONS_KEY);
    return (Konfiguration) eo;
  }

  public void deleteKonfigurationsRelationship(Konfiguration object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, _Inhalt.KONFIGURATIONS_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllKonfigurationsRelationships() {
    Enumeration<Konfiguration> objects = konfigurations().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteKonfigurationsRelationship(objects.nextElement());
    }
  }


  public static Inhalt createInhalt(EOEditingContext editingContext, String name
, Long preis
) {
    Inhalt eo = (Inhalt) EOUtilities.createAndInsertInstance(editingContext, _Inhalt.ENTITY_NAME);
    eo.setName(name);
    eo.setPreis(preis);
    return eo;
  }

  public static ERXFetchSpecification<Inhalt> fetchSpec() {
    return new ERXFetchSpecification<Inhalt>(_Inhalt.ENTITY_NAME, null, null, false, true, null);
  }

  public static NSArray<Inhalt> fetchAllInhalts(EOEditingContext editingContext) {
    return _Inhalt.fetchAllInhalts(editingContext, null);
  }

  public static NSArray<Inhalt> fetchAllInhalts(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _Inhalt.fetchInhalts(editingContext, null, sortOrderings);
  }

  public static NSArray<Inhalt> fetchInhalts(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    ERXFetchSpecification<Inhalt> fetchSpec = new ERXFetchSpecification<Inhalt>(_Inhalt.ENTITY_NAME, qualifier, sortOrderings);
    NSArray<Inhalt> eoObjects = fetchSpec.fetchObjects(editingContext);
    return eoObjects;
  }

  public static Inhalt fetchInhalt(EOEditingContext editingContext, String keyName, Object value) {
    return _Inhalt.fetchInhalt(editingContext, ERXQ.equals(keyName, value));
  }

  public static Inhalt fetchInhalt(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<Inhalt> eoObjects = _Inhalt.fetchInhalts(editingContext, qualifier, null);
    Inhalt eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one Inhalt that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static Inhalt fetchRequiredInhalt(EOEditingContext editingContext, String keyName, Object value) {
    return _Inhalt.fetchRequiredInhalt(editingContext, ERXQ.equals(keyName, value));
  }

  public static Inhalt fetchRequiredInhalt(EOEditingContext editingContext, EOQualifier qualifier) {
    Inhalt eoObject = _Inhalt.fetchInhalt(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no Inhalt that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static Inhalt localInstanceIn(EOEditingContext editingContext, Inhalt eo) {
    Inhalt localInstance = (eo == null) ? null : ERXEOControlUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
