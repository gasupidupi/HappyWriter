// DO NOT EDIT.  Make changes to Kunde.java instead.
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
public abstract class _Kunde extends  ERXGenericRecord {
  public static final String ENTITY_NAME = "Kunde";

  // Attribute Keys
  public static final ERXKey<NSTimestamp> KUNDE_SEIT = new ERXKey<NSTimestamp>("kundeSeit", Type.Attribute);
  public static final ERXKey<String> NACHNAME = new ERXKey<String>("nachname", Type.Attribute);
  public static final ERXKey<String> ORT = new ERXKey<String>("ort", Type.Attribute);
  public static final ERXKey<Integer> PLZ = new ERXKey<Integer>("plz", Type.Attribute);
  public static final ERXKey<String> STRASSE = new ERXKey<String>("strasse", Type.Attribute);
  public static final ERXKey<Integer> TEL = new ERXKey<Integer>("tel", Type.Attribute);
  public static final ERXKey<String> VORNAME = new ERXKey<String>("vorname", Type.Attribute);

  // Relationship Keys
  public static final ERXKey<Bestellung> BESTELLUNGS = new ERXKey<Bestellung>("bestellungs", Type.ToManyRelationship);

  // Attributes
  public static final String KUNDE_SEIT_KEY = KUNDE_SEIT.key();
  public static final String NACHNAME_KEY = NACHNAME.key();
  public static final String ORT_KEY = ORT.key();
  public static final String PLZ_KEY = PLZ.key();
  public static final String STRASSE_KEY = STRASSE.key();
  public static final String TEL_KEY = TEL.key();
  public static final String VORNAME_KEY = VORNAME.key();

  // Relationships
  public static final String BESTELLUNGS_KEY = BESTELLUNGS.key();

  private static final Logger log = LoggerFactory.getLogger(_Kunde.class);

  public Kunde localInstanceIn(EOEditingContext editingContext) {
    Kunde localInstance = (Kunde)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public NSTimestamp kundeSeit() {
    return (NSTimestamp) storedValueForKey(_Kunde.KUNDE_SEIT_KEY);
  }

  public void setKundeSeit(NSTimestamp value) {
    log.debug( "updating kundeSeit from {} to {}", kundeSeit(), value);
    takeStoredValueForKey(value, _Kunde.KUNDE_SEIT_KEY);
  }

  public String nachname() {
    return (String) storedValueForKey(_Kunde.NACHNAME_KEY);
  }

  public void setNachname(String value) {
    log.debug( "updating nachname from {} to {}", nachname(), value);
    takeStoredValueForKey(value, _Kunde.NACHNAME_KEY);
  }

  public String ort() {
    return (String) storedValueForKey(_Kunde.ORT_KEY);
  }

  public void setOrt(String value) {
    log.debug( "updating ort from {} to {}", ort(), value);
    takeStoredValueForKey(value, _Kunde.ORT_KEY);
  }

  public Integer plz() {
    return (Integer) storedValueForKey(_Kunde.PLZ_KEY);
  }

  public void setPlz(Integer value) {
    log.debug( "updating plz from {} to {}", plz(), value);
    takeStoredValueForKey(value, _Kunde.PLZ_KEY);
  }

  public String strasse() {
    return (String) storedValueForKey(_Kunde.STRASSE_KEY);
  }

  public void setStrasse(String value) {
    log.debug( "updating strasse from {} to {}", strasse(), value);
    takeStoredValueForKey(value, _Kunde.STRASSE_KEY);
  }

  public Integer tel() {
    return (Integer) storedValueForKey(_Kunde.TEL_KEY);
  }

  public void setTel(Integer value) {
    log.debug( "updating tel from {} to {}", tel(), value);
    takeStoredValueForKey(value, _Kunde.TEL_KEY);
  }

  public String vorname() {
    return (String) storedValueForKey(_Kunde.VORNAME_KEY);
  }

  public void setVorname(String value) {
    log.debug( "updating vorname from {} to {}", vorname(), value);
    takeStoredValueForKey(value, _Kunde.VORNAME_KEY);
  }

  public NSArray<Bestellung> bestellungs() {
    return (NSArray<Bestellung>)storedValueForKey(_Kunde.BESTELLUNGS_KEY);
  }

  public NSArray<Bestellung> bestellungs(EOQualifier qualifier) {
    return bestellungs(qualifier, null, false);
  }

  public NSArray<Bestellung> bestellungs(EOQualifier qualifier, boolean fetch) {
    return bestellungs(qualifier, null, fetch);
  }

  public NSArray<Bestellung> bestellungs(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<Bestellung> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = ERXQ.equals(Bestellung.KUNDE_KEY, this);

      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        fullQualifier = ERXQ.and(qualifier, inverseQualifier);
      }

      results = Bestellung.fetchBestellungs(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = bestellungs();
      if (qualifier != null) {
        results = (NSArray<Bestellung>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<Bestellung>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }

  public void addToBestellungs(Bestellung object) {
    includeObjectIntoPropertyWithKey(object, _Kunde.BESTELLUNGS_KEY);
  }

  public void removeFromBestellungs(Bestellung object) {
    excludeObjectFromPropertyWithKey(object, _Kunde.BESTELLUNGS_KEY);
  }

  public void addToBestellungsRelationship(Bestellung object) {
    log.debug("adding {} to bestellungs relationship", object);
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
      addToBestellungs(object);
    }
    else {
      addObjectToBothSidesOfRelationshipWithKey(object, _Kunde.BESTELLUNGS_KEY);
    }
  }

  public void removeFromBestellungsRelationship(Bestellung object) {
    log.debug("removing {} from bestellungs relationship", object);
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
      removeFromBestellungs(object);
    }
    else {
      removeObjectFromBothSidesOfRelationshipWithKey(object, _Kunde.BESTELLUNGS_KEY);
    }
  }

  public Bestellung createBestellungsRelationship() {
    EOEnterpriseObject eo = EOUtilities.createAndInsertInstance(editingContext(),  Bestellung.ENTITY_NAME );
    addObjectToBothSidesOfRelationshipWithKey(eo, _Kunde.BESTELLUNGS_KEY);
    return (Bestellung) eo;
  }

  public void deleteBestellungsRelationship(Bestellung object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, _Kunde.BESTELLUNGS_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllBestellungsRelationships() {
    Enumeration<Bestellung> objects = bestellungs().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteBestellungsRelationship(objects.nextElement());
    }
  }


  public static Kunde createKunde(EOEditingContext editingContext, NSTimestamp kundeSeit
, String nachname
, String ort
, Integer plz
, String strasse
, Integer tel
, String vorname
) {
    Kunde eo = (Kunde) EOUtilities.createAndInsertInstance(editingContext, _Kunde.ENTITY_NAME);
    eo.setKundeSeit(kundeSeit);
    eo.setNachname(nachname);
    eo.setOrt(ort);
    eo.setPlz(plz);
    eo.setStrasse(strasse);
    eo.setTel(tel);
    eo.setVorname(vorname);
    return eo;
  }

  public static ERXFetchSpecification<Kunde> fetchSpec() {
    return new ERXFetchSpecification<Kunde>(_Kunde.ENTITY_NAME, null, null, false, true, null);
  }

  public static NSArray<Kunde> fetchAllKundes(EOEditingContext editingContext) {
    return _Kunde.fetchAllKundes(editingContext, null);
  }

  public static NSArray<Kunde> fetchAllKundes(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _Kunde.fetchKundes(editingContext, null, sortOrderings);
  }

  public static NSArray<Kunde> fetchKundes(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    ERXFetchSpecification<Kunde> fetchSpec = new ERXFetchSpecification<Kunde>(_Kunde.ENTITY_NAME, qualifier, sortOrderings);
    NSArray<Kunde> eoObjects = fetchSpec.fetchObjects(editingContext);
    return eoObjects;
  }

  public static Kunde fetchKunde(EOEditingContext editingContext, String keyName, Object value) {
    return _Kunde.fetchKunde(editingContext, ERXQ.equals(keyName, value));
  }

  public static Kunde fetchKunde(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<Kunde> eoObjects = _Kunde.fetchKundes(editingContext, qualifier, null);
    Kunde eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one Kunde that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static Kunde fetchRequiredKunde(EOEditingContext editingContext, String keyName, Object value) {
    return _Kunde.fetchRequiredKunde(editingContext, ERXQ.equals(keyName, value));
  }

  public static Kunde fetchRequiredKunde(EOEditingContext editingContext, EOQualifier qualifier) {
    Kunde eoObject = _Kunde.fetchKunde(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no Kunde that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static Kunde localInstanceIn(EOEditingContext editingContext, Kunde eo) {
    Kunde localInstance = (eo == null) ? null : ERXEOControlUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
