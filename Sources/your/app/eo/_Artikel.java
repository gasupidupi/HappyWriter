// DO NOT EDIT.  Make changes to Artikel.java instead.
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
public abstract class _Artikel extends  ERXGenericRecord {
  public static final String ENTITY_NAME = "Artikel";

  // Attribute Keys
  public static final ERXKey<String> BEZEICHNUNG = new ERXKey<String>("bezeichnung", Type.Attribute);
  public static final ERXKey<Integer> PREIS = new ERXKey<Integer>("preis", Type.Attribute);

  // Relationship Keys
  public static final ERXKey<BestellPosition> BESTELL_POSITIONS = new ERXKey<BestellPosition>("bestellPositions", Type.ToManyRelationship);
  public static final ERXKey<Konfiguration> KONFIGURATIONS = new ERXKey<Konfiguration>("konfigurations", Type.ToManyRelationship);

  // Attributes
  public static final String BEZEICHNUNG_KEY = BEZEICHNUNG.key();
  public static final String PREIS_KEY = PREIS.key();

  // Relationships
  public static final String BESTELL_POSITIONS_KEY = BESTELL_POSITIONS.key();
  public static final String KONFIGURATIONS_KEY = KONFIGURATIONS.key();

  private static final Logger log = LoggerFactory.getLogger(_Artikel.class);

  public Artikel localInstanceIn(EOEditingContext editingContext) {
    Artikel localInstance = (Artikel)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public String bezeichnung() {
    return (String) storedValueForKey(_Artikel.BEZEICHNUNG_KEY);
  }

  public void setBezeichnung(String value) {
    log.debug( "updating bezeichnung from {} to {}", bezeichnung(), value);
    takeStoredValueForKey(value, _Artikel.BEZEICHNUNG_KEY);
  }

  public Integer preis() {
    return (Integer) storedValueForKey(_Artikel.PREIS_KEY);
  }

  public void setPreis(Integer value) {
    log.debug( "updating preis from {} to {}", preis(), value);
    takeStoredValueForKey(value, _Artikel.PREIS_KEY);
  }

  public NSArray<BestellPosition> bestellPositions() {
    return (NSArray<BestellPosition>)storedValueForKey(_Artikel.BESTELL_POSITIONS_KEY);
  }

  public NSArray<BestellPosition> bestellPositions(EOQualifier qualifier) {
    return bestellPositions(qualifier, null, false);
  }

  public NSArray<BestellPosition> bestellPositions(EOQualifier qualifier, boolean fetch) {
    return bestellPositions(qualifier, null, fetch);
  }

  public NSArray<BestellPosition> bestellPositions(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<BestellPosition> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = ERXQ.equals(BestellPosition.ARTIKEL_KEY, this);

      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        fullQualifier = ERXQ.and(qualifier, inverseQualifier);
      }

      results = BestellPosition.fetchBestellPositions(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = bestellPositions();
      if (qualifier != null) {
        results = (NSArray<BestellPosition>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<BestellPosition>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }

  public void addToBestellPositions(BestellPosition object) {
    includeObjectIntoPropertyWithKey(object, _Artikel.BESTELL_POSITIONS_KEY);
  }

  public void removeFromBestellPositions(BestellPosition object) {
    excludeObjectFromPropertyWithKey(object, _Artikel.BESTELL_POSITIONS_KEY);
  }

  public void addToBestellPositionsRelationship(BestellPosition object) {
    log.debug("adding {} to bestellPositions relationship", object);
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
      addToBestellPositions(object);
    }
    else {
      addObjectToBothSidesOfRelationshipWithKey(object, _Artikel.BESTELL_POSITIONS_KEY);
    }
  }

  public void removeFromBestellPositionsRelationship(BestellPosition object) {
    log.debug("removing {} from bestellPositions relationship", object);
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
      removeFromBestellPositions(object);
    }
    else {
      removeObjectFromBothSidesOfRelationshipWithKey(object, _Artikel.BESTELL_POSITIONS_KEY);
    }
  }

  public BestellPosition createBestellPositionsRelationship() {
    EOEnterpriseObject eo = EOUtilities.createAndInsertInstance(editingContext(),  BestellPosition.ENTITY_NAME );
    addObjectToBothSidesOfRelationshipWithKey(eo, _Artikel.BESTELL_POSITIONS_KEY);
    return (BestellPosition) eo;
  }

  public void deleteBestellPositionsRelationship(BestellPosition object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, _Artikel.BESTELL_POSITIONS_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllBestellPositionsRelationships() {
    Enumeration<BestellPosition> objects = bestellPositions().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteBestellPositionsRelationship(objects.nextElement());
    }
  }

  public NSArray<Konfiguration> konfigurations() {
    return (NSArray<Konfiguration>)storedValueForKey(_Artikel.KONFIGURATIONS_KEY);
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
      EOQualifier inverseQualifier = ERXQ.equals(Konfiguration.ARTIKEL_KEY, this);

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
    includeObjectIntoPropertyWithKey(object, _Artikel.KONFIGURATIONS_KEY);
  }

  public void removeFromKonfigurations(Konfiguration object) {
    excludeObjectFromPropertyWithKey(object, _Artikel.KONFIGURATIONS_KEY);
  }

  public void addToKonfigurationsRelationship(Konfiguration object) {
    log.debug("adding {} to konfigurations relationship", object);
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
      addToKonfigurations(object);
    }
    else {
      addObjectToBothSidesOfRelationshipWithKey(object, _Artikel.KONFIGURATIONS_KEY);
    }
  }

  public void removeFromKonfigurationsRelationship(Konfiguration object) {
    log.debug("removing {} from konfigurations relationship", object);
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
      removeFromKonfigurations(object);
    }
    else {
      removeObjectFromBothSidesOfRelationshipWithKey(object, _Artikel.KONFIGURATIONS_KEY);
    }
  }

  public Konfiguration createKonfigurationsRelationship() {
    EOEnterpriseObject eo = EOUtilities.createAndInsertInstance(editingContext(),  Konfiguration.ENTITY_NAME );
    addObjectToBothSidesOfRelationshipWithKey(eo, _Artikel.KONFIGURATIONS_KEY);
    return (Konfiguration) eo;
  }

  public void deleteKonfigurationsRelationship(Konfiguration object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, _Artikel.KONFIGURATIONS_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllKonfigurationsRelationships() {
    Enumeration<Konfiguration> objects = konfigurations().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteKonfigurationsRelationship(objects.nextElement());
    }
  }


  public static Artikel createArtikel(EOEditingContext editingContext, String bezeichnung
, Integer preis
) {
    Artikel eo = (Artikel) EOUtilities.createAndInsertInstance(editingContext, _Artikel.ENTITY_NAME);
    eo.setBezeichnung(bezeichnung);
    eo.setPreis(preis);
    return eo;
  }

  public static ERXFetchSpecification<Artikel> fetchSpec() {
    return new ERXFetchSpecification<Artikel>(_Artikel.ENTITY_NAME, null, null, false, true, null);
  }

  public static NSArray<Artikel> fetchAllArtikels(EOEditingContext editingContext) {
    return _Artikel.fetchAllArtikels(editingContext, null);
  }

  public static NSArray<Artikel> fetchAllArtikels(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _Artikel.fetchArtikels(editingContext, null, sortOrderings);
  }

  public static NSArray<Artikel> fetchArtikels(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    ERXFetchSpecification<Artikel> fetchSpec = new ERXFetchSpecification<Artikel>(_Artikel.ENTITY_NAME, qualifier, sortOrderings);
    NSArray<Artikel> eoObjects = fetchSpec.fetchObjects(editingContext);
    return eoObjects;
  }

  public static Artikel fetchArtikel(EOEditingContext editingContext, String keyName, Object value) {
    return _Artikel.fetchArtikel(editingContext, ERXQ.equals(keyName, value));
  }

  public static Artikel fetchArtikel(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<Artikel> eoObjects = _Artikel.fetchArtikels(editingContext, qualifier, null);
    Artikel eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one Artikel that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static Artikel fetchRequiredArtikel(EOEditingContext editingContext, String keyName, Object value) {
    return _Artikel.fetchRequiredArtikel(editingContext, ERXQ.equals(keyName, value));
  }

  public static Artikel fetchRequiredArtikel(EOEditingContext editingContext, EOQualifier qualifier) {
    Artikel eoObject = _Artikel.fetchArtikel(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no Artikel that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static Artikel localInstanceIn(EOEditingContext editingContext, Artikel eo) {
    Artikel localInstance = (eo == null) ? null : ERXEOControlUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
