// DO NOT EDIT.  Make changes to BestellPosition.java instead.
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
public abstract class _BestellPosition extends  ERXGenericRecord {
  public static final String ENTITY_NAME = "BestellPosition";

  // Attribute Keys

  // Relationship Keys
  public static final ERXKey<Artikel> ARTIKEL = new ERXKey<Artikel>("artikel", Type.ToOneRelationship);
  public static final ERXKey<BestellteKonfiguration> BESTELLTE_KONFIGURATIONS = new ERXKey<BestellteKonfiguration>("bestellteKonfigurations", Type.ToManyRelationship);
  public static final ERXKey<Bestellung> BESTELLUNG = new ERXKey<Bestellung>("bestellung", Type.ToOneRelationship);

  // Attributes

  // Relationships
  public static final String ARTIKEL_KEY = ARTIKEL.key();
  public static final String BESTELLTE_KONFIGURATIONS_KEY = BESTELLTE_KONFIGURATIONS.key();
  public static final String BESTELLUNG_KEY = BESTELLUNG.key();

  private static final Logger log = LoggerFactory.getLogger(_BestellPosition.class);

  public BestellPosition localInstanceIn(EOEditingContext editingContext) {
    BestellPosition localInstance = (BestellPosition)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public Artikel artikel() {
    return (Artikel)storedValueForKey(_BestellPosition.ARTIKEL_KEY);
  }

  public void setArtikel(Artikel value) {
    takeStoredValueForKey(value, _BestellPosition.ARTIKEL_KEY);
  }

  public void setArtikelRelationship(Artikel value) {
    log.debug("updating artikel from {} to {}", artikel(), value);
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
      setArtikel(value);
    }
    else if (value == null) {
      Artikel oldValue = artikel();
      if (oldValue != null) {
        removeObjectFromBothSidesOfRelationshipWithKey(oldValue, _BestellPosition.ARTIKEL_KEY);
      }
    } else {
      addObjectToBothSidesOfRelationshipWithKey(value, _BestellPosition.ARTIKEL_KEY);
    }
  }

  public Bestellung bestellung() {
    return (Bestellung)storedValueForKey(_BestellPosition.BESTELLUNG_KEY);
  }

  public void setBestellung(Bestellung value) {
    takeStoredValueForKey(value, _BestellPosition.BESTELLUNG_KEY);
  }

  public void setBestellungRelationship(Bestellung value) {
    log.debug("updating bestellung from {} to {}", bestellung(), value);
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
      setBestellung(value);
    }
    else if (value == null) {
      Bestellung oldValue = bestellung();
      if (oldValue != null) {
        removeObjectFromBothSidesOfRelationshipWithKey(oldValue, _BestellPosition.BESTELLUNG_KEY);
      }
    } else {
      addObjectToBothSidesOfRelationshipWithKey(value, _BestellPosition.BESTELLUNG_KEY);
    }
  }

  public NSArray<BestellteKonfiguration> bestellteKonfigurations() {
    return (NSArray<BestellteKonfiguration>)storedValueForKey(_BestellPosition.BESTELLTE_KONFIGURATIONS_KEY);
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
      EOQualifier inverseQualifier = ERXQ.equals(BestellteKonfiguration.BESTELL_POSITION_KEY, this);

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
    includeObjectIntoPropertyWithKey(object, _BestellPosition.BESTELLTE_KONFIGURATIONS_KEY);
  }

  public void removeFromBestellteKonfigurations(BestellteKonfiguration object) {
    excludeObjectFromPropertyWithKey(object, _BestellPosition.BESTELLTE_KONFIGURATIONS_KEY);
  }

  public void addToBestellteKonfigurationsRelationship(BestellteKonfiguration object) {
    log.debug("adding {} to bestellteKonfigurations relationship", object);
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
      addToBestellteKonfigurations(object);
    }
    else {
      addObjectToBothSidesOfRelationshipWithKey(object, _BestellPosition.BESTELLTE_KONFIGURATIONS_KEY);
    }
  }

  public void removeFromBestellteKonfigurationsRelationship(BestellteKonfiguration object) {
    log.debug("removing {} from bestellteKonfigurations relationship", object);
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
      removeFromBestellteKonfigurations(object);
    }
    else {
      removeObjectFromBothSidesOfRelationshipWithKey(object, _BestellPosition.BESTELLTE_KONFIGURATIONS_KEY);
    }
  }

  public BestellteKonfiguration createBestellteKonfigurationsRelationship() {
    EOEnterpriseObject eo = EOUtilities.createAndInsertInstance(editingContext(),  BestellteKonfiguration.ENTITY_NAME );
    addObjectToBothSidesOfRelationshipWithKey(eo, _BestellPosition.BESTELLTE_KONFIGURATIONS_KEY);
    return (BestellteKonfiguration) eo;
  }

  public void deleteBestellteKonfigurationsRelationship(BestellteKonfiguration object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, _BestellPosition.BESTELLTE_KONFIGURATIONS_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllBestellteKonfigurationsRelationships() {
    Enumeration<BestellteKonfiguration> objects = bestellteKonfigurations().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteBestellteKonfigurationsRelationship(objects.nextElement());
    }
  }


  public static BestellPosition createBestellPosition(EOEditingContext editingContext, Artikel artikel, Bestellung bestellung) {
    BestellPosition eo = (BestellPosition) EOUtilities.createAndInsertInstance(editingContext, _BestellPosition.ENTITY_NAME);
    eo.setArtikelRelationship(artikel);
    eo.setBestellungRelationship(bestellung);
    return eo;
  }

  public static ERXFetchSpecification<BestellPosition> fetchSpec() {
    return new ERXFetchSpecification<BestellPosition>(_BestellPosition.ENTITY_NAME, null, null, false, true, null);
  }

  public static NSArray<BestellPosition> fetchAllBestellPositions(EOEditingContext editingContext) {
    return _BestellPosition.fetchAllBestellPositions(editingContext, null);
  }

  public static NSArray<BestellPosition> fetchAllBestellPositions(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _BestellPosition.fetchBestellPositions(editingContext, null, sortOrderings);
  }

  public static NSArray<BestellPosition> fetchBestellPositions(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    ERXFetchSpecification<BestellPosition> fetchSpec = new ERXFetchSpecification<BestellPosition>(_BestellPosition.ENTITY_NAME, qualifier, sortOrderings);
    NSArray<BestellPosition> eoObjects = fetchSpec.fetchObjects(editingContext);
    return eoObjects;
  }

  public static BestellPosition fetchBestellPosition(EOEditingContext editingContext, String keyName, Object value) {
    return _BestellPosition.fetchBestellPosition(editingContext, ERXQ.equals(keyName, value));
  }

  public static BestellPosition fetchBestellPosition(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<BestellPosition> eoObjects = _BestellPosition.fetchBestellPositions(editingContext, qualifier, null);
    BestellPosition eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one BestellPosition that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static BestellPosition fetchRequiredBestellPosition(EOEditingContext editingContext, String keyName, Object value) {
    return _BestellPosition.fetchRequiredBestellPosition(editingContext, ERXQ.equals(keyName, value));
  }

  public static BestellPosition fetchRequiredBestellPosition(EOEditingContext editingContext, EOQualifier qualifier) {
    BestellPosition eoObject = _BestellPosition.fetchBestellPosition(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no BestellPosition that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static BestellPosition localInstanceIn(EOEditingContext editingContext, BestellPosition eo) {
    BestellPosition localInstance = (eo == null) ? null : ERXEOControlUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
